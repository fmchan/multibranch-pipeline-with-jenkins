package com.hket.multibranch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MultibranchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultibranchApplication.class, args);
	}

	@GetMapping("/")
	public String appWork() {
		return "Multibranch is working on Friday.";
	}
}
