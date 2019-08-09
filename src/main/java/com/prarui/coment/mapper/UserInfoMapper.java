package com.prarui.coment.mapper;

import com.prarui.coment.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    @Select("select * from userInfo where userAge=#{userAge}")
    UserInfo findBookById(@Param("userAge") Integer userAge);


    List<UserInfo> selectUserInfoList();

    UserInfo findByUsername(@Param("userName") String username);

    UserInfo findUserById(@Param("id") String Id);

}
