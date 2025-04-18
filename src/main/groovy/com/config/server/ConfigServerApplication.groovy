package com.config.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ConfigServerApplication {

	static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication, args)
	}

}
