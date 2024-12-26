package com.camisetasmd.camisetasmd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class CamisetasmdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamisetasmdApplication.class, args);
	}

}
