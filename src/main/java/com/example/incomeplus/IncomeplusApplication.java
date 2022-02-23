package com.example.incomeplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA Auditing 활성화 기능 어노테이션
@SpringBootApplication
public class IncomeplusApplication {

	public static void main(String[] args) {

		SpringApplication.run(IncomeplusApplication.class, args);
	}

}
