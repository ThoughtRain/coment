package com.prarui.coment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.prarui.coment.mapper")
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ComentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComentApplication.class, args);
    }

}
