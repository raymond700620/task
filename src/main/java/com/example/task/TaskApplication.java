package com.example.task;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableTask
public class TaskApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
			System.out.println("=====>Hello, World!");
	}

}
