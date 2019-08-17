package com.prarui.coment.controller;

import com.google.gson.Gson;
import com.prarui.coment.annotation.UserLoginToken;
import com.prarui.coment.bean.BaseRequest;
import com.prarui.coment.bean.UserInfo;
import com.prarui.coment.exception.AgeDeleteException;
import com.prarui.coment.service.TokenService;
import com.prarui.coment.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class Hello {
    /**
     * 开始
     */
    @Autowired
    private UserService userService;
    private Gson gson = new Gson();

    //    @RequestMapping(value = "/hello/{userAge}", method = RequestMethod.GET)
//    public String sayhello(@PathVariable("userAge") Integer userAge) {
//        //UserInfo userInfo = userService.findBookById(userAge);
//        if (userInfo == null) {
//            throw new AgeDeleteException("我的额");
//        }
//        if (userInfo.getUserAge() < 18) {
//            throw new AgeDeleteException();
//        }
//        return gson.toJson(new BaseRequest<Object>(200, "成功", userInfo));
//    }
    @ApiOperation(value = "查询所有用户", notes = "获取全部")
    @RequestMapping(value = "/hello2", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String sayMap() {
        return gson.toJson(new BaseRequest<Object>(200, "成功", userService.selectUserInfoList()));
    }
    @ApiOperation(value = "test", notes = "获取全部")
    @RequestMapping(value = "/images", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String images() {

        return gson.toJson(new BaseRequest<Object>(200, "成功", userService.selectUserInfoList()));
    }

    @ApiOperation(value = "查询单个用户", notes = "根据Id获取对象")
    @RequestMapping(value = "/hello3", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String sayFind() {
        return gson.toJson(new BaseRequest<Object>(200, "成功", userService.findUserById("1")));
    }

    @Autowired
    TokenService tokenService;

    //登录
    @PostMapping("/login")
    public Object login(@RequestBody UserInfo user) {
        UserInfo userForBase = userService.findByUsername(user);
        HashMap<String, Object> map = new HashMap<>();
        if (userForBase == null) {
            map.put("message", "登录失败,用户不存在");
            return new BaseRequest<Object>(200, "成功", map);
        } else {
            if (!userForBase.getUserPassWord().equals(user.getUserPassWord())) {
                map.put("message", "登录失败,密码错误");
                return new BaseRequest<Object>(200, "登录失败,密码错误", null);
            } else {
                String token = tokenService.getToken(userForBase);
                map.put("token", token);
                map.put("user", userForBase);
                return new BaseRequest<Object>(200, "成功", map);
            }
        }
    }

    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage() {
        return "你已通过验证";
    }

}
