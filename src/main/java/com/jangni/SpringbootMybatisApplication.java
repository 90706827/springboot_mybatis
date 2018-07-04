package com.jangni;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.jangni")
@MapperScan("com.jangni.mapper")
public class SpringbootMybatisApplication {

	public static void main(String[] args) {

        SpringApplication.run(SpringbootMybatisApplication.class, args);
	}
}
