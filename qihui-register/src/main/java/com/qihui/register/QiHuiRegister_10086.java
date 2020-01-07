package com.qihui.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QiHuiRegister_10086
{
    public static void main( String[] args )
    {
        SpringApplication.run(QiHuiRegister_10086.class, args);
    }
}
