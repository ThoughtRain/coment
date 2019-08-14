package com.prarui.coment.controller;


import com.google.gson.Gson;
import com.prarui.coment.bean.BaseRequest;
import com.prarui.coment.service.OrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired
    Gson gson;
    @Autowired
    OrderService service;

    @ApiOperation(value = "多表查询的test类", notes = "获取全部")
    @RequestMapping(value = "/orderInfo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String orderInfo() {
        return gson.toJson(new BaseRequest<Object>(200, "成功", service.findOrderUser2()));
    }

}
