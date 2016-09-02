package edu.mum.cs544;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"edu.mum.cs544.controllers","edu.mum.cs544.services"})
public class OnlinepetmatchfinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinepetmatchfinderApplication.class, args);
	}
}
