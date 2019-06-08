package com.tensquare.tensquare_base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tensquare.tensquare_base.mapper")
public class BaseApplicaion {
    public static void main(String[] args){
        SpringApplication.run(BaseApplicaion.class,args);
    }
}
