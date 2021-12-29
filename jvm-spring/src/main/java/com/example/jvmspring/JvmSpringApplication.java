package com.example.jvmspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@SpringBootApplication
@RestController
public class JvmSpringApplication{

	public static void main(String[] args) {
		SpringApplication.run(JvmSpringApplication.class, args);
	}

	@GetMapping("/")
	public Person receive(){
		return new Person(generateString(), generateString());
	}

	private String generateString(){
		StringBuilder s = new StringBuilder();
		IntStream.rangeClosed(1, 20).forEach(i -> s.append(Character.toChars('a' + (int)(Math.random() * 26))));
		return s.toString();
	}
}

record Person(String fname, String lname){}


