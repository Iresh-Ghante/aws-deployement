package com.wehcamp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

	@GetMapping("/get")
	public ResponseEntity<String> getMassage(
			@RequestParam(name = "massage", required = false, defaultValue = "User") String msg) {
		return ResponseEntity.ok().body("Good morning " + msg);
	}
}
