package com.rakuten;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/processPension")
public class ProcessPensionController {
	
	@PostMapping
	void getPensionRequest(@RequestBody ProcessPensionInput input) {
		System.out.println(input.getAadharNumber());
	}
}
