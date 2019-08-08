package com.prarui.coment.controller;

import com.google.gson.Gson;
import com.prarui.coment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayhello() {
        return gson.toJson(userService.findBookById());
    }
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String sayMap() {
        return gson.toJson(userService.selectUserInfoList());
    }


}
