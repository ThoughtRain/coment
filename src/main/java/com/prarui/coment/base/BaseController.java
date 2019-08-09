package com.prarui.coment.base;

import com.prarui.coment.annotation.UserLoginToken;
import org.springframework.web.bind.annotation.GetMapping;

public class BaseController {
    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }
}
