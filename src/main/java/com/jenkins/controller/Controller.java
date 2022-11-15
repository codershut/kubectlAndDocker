//package com.jenkins.controller;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Controller {
//	
//	public static final Logger log = LogManager.getLogger(Controller.class);
//
//	
//	@GetMapping("/api/{name}")
//	public String gethii(@PathVariable("name") String name) {
//		log.info("request received");
//		return "Hello" + name + "!";
//	}
//
//}
