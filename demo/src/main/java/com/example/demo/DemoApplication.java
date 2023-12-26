package com.example.demo;

import com.example.demo.dao.entities.computer;
import com.example.demo.dao.repositories.ComputerRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ComputerRepositories computerRepository){
		return args -> {
			List<computer> computers = List.of(
					computer.builder().macAddress("12").price(10).build(),
					computer.builder().macAddress("13").price(10).build(),
					computer.builder().macAddress("14").price(10).build(),
					computer.builder().macAddress("15").price(10).build()
			);

			computerRepository.saveAll(computers);

		};
	}
}
