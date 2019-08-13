package com.prarui.coment.controller;


import com.google.gson.Gson;
import com.prarui.coment.StudentRepository;
import com.prarui.coment.bean.BaseRequest;
import com.prarui.coment.bean.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/student")
public class AutoStudentController {
    @Autowired
    private StudentRepository studentRepository;
    private static int cnt = 0;
    private Gson gson = new Gson();
    @RequestMapping("queryAll")
    @ResponseBody
    public String queryAll(){
        return gson.toJson(new BaseRequest<Object>(200, "成功", studentRepository.findAll())) ;
    }

    @RequestMapping("add")
    @ResponseBody
    public  void add(){
        Student user = new Student();
        user.setName("junjun"+(cnt++));
        user.setAge(6);
        studentRepository.save(user);
    }

    @RequestMapping("update")
    @ResponseBody
    public  void update(){
        Student user = studentRepository.findById(1).get();
        user.setName("duoduo");
        studentRepository.save(user);
    }

}