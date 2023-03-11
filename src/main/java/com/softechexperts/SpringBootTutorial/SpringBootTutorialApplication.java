package com.softechexperts.SpringBootTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.softechexperts.examples.SpringBootTutorial.repository")
@EntityScan("com.softechexperts.examples.SpringBootTutorial.entity")
@SpringBootApplication
public class SpringBootTutorialApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}

}
