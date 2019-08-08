package com.prarui.coment.controller;

import com.google.gson.Gson;
import com.prarui.coment.bean.BaseRequest;
import com.prarui.coment.bean.UserInfo;
import com.prarui.coment.exception.AgeDeleteException;
import com.prarui.coment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    /**
     * 开始
     */
    @Autowired
    private UserService userService;
    private Gson gson = new Gson();

    @RequestMapping(value = "/hello/{userAge}", method = RequestMethod.GET)
    public String sayhello(@PathVariable("userAge") Integer userAge) {
        UserInfo userInfo = userService.findBookById(userAge);
        if (userInfo == null) {
            throw new AgeDeleteException("我的额");
        }
        if (userInfo.getUserAge() < 18) {
            throw new AgeDeleteException();
        }
        return gson.toJson(new BaseRequest<Object>(200, "成功", userInfo));
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String sayMap() {
        return gson.toJson(new BaseRequest<Object>(200, "成功", userService.selectUserInfoList()));
    }


}
