package ru.nemtsov.springcourse.Less91FirstRestApp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Less91FirstRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Less91FirstRestAppApplication.class, args);
	}


	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
