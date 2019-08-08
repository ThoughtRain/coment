package com.prarui.coment;

import com.prarui.coment.mapper.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComentApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Test
    public void getBookById(){
        System.out.println(userInfoMapper.findBookById(12));
    }

}
