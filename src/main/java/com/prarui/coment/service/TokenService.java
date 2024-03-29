package com.prarui.coment.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.prarui.coment.bean.UserInfo;
import org.springframework.stereotype.Service;


/**
 * @author jinbin
 * @date 2018-07-08 21:04
 */
@Service("TokenService")
public class TokenService {
    public String getToken(UserInfo user) {
        String token="";
        token= JWT.create().withAudience(user.getId()+"")// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(user.getUserPassWord()));// 以 password 作为 token 的密钥
        return token;
    }
}
