package com.prarui.coment.service;

import com.prarui.coment.bean.UserInfo;
import com.prarui.coment.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserInfoMapper userInfoMapper;

    public UserInfo findBookById(Integer userAge) {
        return userInfoMapper.findBookById(userAge);
    }

    public List<UserInfo> selectUserInfoList() {
        return userInfoMapper.selectUserInfoList();
    }
    public UserInfo findByUsername(UserInfo user){
        return userInfoMapper.findByUsername(user.getUserName());
    }
    public UserInfo findUserById(String userId) {
        return userInfoMapper.findUserById(userId);
    }

}
