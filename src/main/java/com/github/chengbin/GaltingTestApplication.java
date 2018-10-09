package com.github.chengbin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAsync
@SpringBootApplication
@MapperScan("com.github.chengbin.mapper")
public class GaltingTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GaltingTestApplication.class, args);
	}
}
