package com.ms.eureka.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eurekaport")
public class EurekaaController {

	private Environment env;

	@Autowired
	public EurekaaController(Environment env) {
		this.env = env;
	}

	@GetMapping
	public String getPort() {
		return "Eureka is running at Port " + env.getProperty("local.server.port");

	}

}
