package com.prarui.coment.mapper;

import com.prarui.coment.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    @Select("select * from userInfo where userAge=#{userAge}")
    public  UserInfo findBookById(@Param("userAge") Integer userAge);


    public List<UserInfo> selectUserInfoList();

    public UserInfo findByUsername(@Param("userName") String username);

    public UserInfo findUserById(@Param("id") String id);

}
