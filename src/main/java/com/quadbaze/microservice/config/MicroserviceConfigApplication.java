package com.quadbaze.microservice.config;

import com.quadbaze.microservice.config.browser.BrowserUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroserviceConfigApplication {

	public static void main(String[] args) {
		BrowserUtil.browse(
				SpringApplication.run(MicroserviceConfigApplication.class, args)
						.getEnvironment()
						.getProperty("config.server.status.uri")
		);
	}
}
