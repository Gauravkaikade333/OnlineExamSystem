package com.thekiranacademy.myspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class MyspringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringappApplication.class, args);
	}

}
