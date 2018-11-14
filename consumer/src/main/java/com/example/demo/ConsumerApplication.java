package com.example.demo;

import com.example.demo.service.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@ComponentScan(basePackages = {"com.practice.springboot.dubbo.consumer"})
@ImportResource("classpath:dubbo-consumer.xml")
public class ConsumerApplication {
	@Autowired
	SayService sayService;

	@RequestMapping("/hello")
	public String say(@RequestParam("name") String name) {
		return sayService.say(name);
	}


	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
