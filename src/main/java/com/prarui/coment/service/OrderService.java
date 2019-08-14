package com.prarui.coment.service;


import com.prarui.coment.bean.Emp;
import com.prarui.coment.mapper.MepMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    MepMapper mapper;

    public Emp findOrderUser2() {
        return mapper.getEmpById_1(2);
    }
}
