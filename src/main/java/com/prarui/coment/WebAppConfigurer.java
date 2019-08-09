package com.prarui.coment;

import com.prarui.coment.Interceptor.AuthenticationInterceptor;
import com.prarui.coment.Interceptor.HelloInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {
    /**
     * 拦截器初始话要在在设置拦击器的前面；
     *
     * @return
     */
    @Bean
    public AuthenticationInterceptor getMyInterceptor() {
        return new AuthenticationInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 可添加多个
        //   registry.addInterceptor(new HelloInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(getMyInterceptor()).addPathPatterns("/**");
    }


}

