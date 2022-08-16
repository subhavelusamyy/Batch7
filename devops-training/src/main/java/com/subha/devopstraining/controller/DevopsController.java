package com.subha.devopstraining.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
@GetMapping("/")
	public ResponseEntity<String> sample(){
		return new ResponseEntity<String>("Hello Subha.... Yuor Application is running", HttpStatus.OK);
	}
}
