package org.dxc.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDockerJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerJenkinsApplication.class, args);
		System.out.println("hi");
	}

}
