package com.prarui.coment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {

    // 访问路径   http://localhost:9090/swagger-ui.html
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.prarui.coment")) // 控制器所在目录
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")  // 文档标题
                .description("测试 swagger2文档")  // 文档描述
                .termsOfServiceUrl("http://127.0.0.1:9090/")     // 服务路径
                .contact("prarui")
                .version("1.0")
                .build();
    }
    /**
     * http://127.0.0.1:8080/swagger-ui.html
     */
}
