package com.serverBigdata.api.bigdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.serverBigdata.api")
@MapperScan(value = {"com.serverBigdata.api.dao"})
public class BigdataApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigdataApplication.class, args);
	}

}
