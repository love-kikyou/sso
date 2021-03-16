package com.cjs.sso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.cjs.sso.mapper")
public class Oauth2SsoAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2SsoAuthServerApplication.class, args);
    }

}
