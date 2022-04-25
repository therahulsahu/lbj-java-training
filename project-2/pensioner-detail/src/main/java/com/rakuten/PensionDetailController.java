package com.rakuten;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PensionDetailController {
	
	@GetMapping("/pensionerDetailByAadhar")
	PensionerDetail getPensionerDetail(@RequestParam String aadharNumber) {
		System.out.println(aadharNumber);
		PensionerDetail demo = new PensionerDetail();
		demo.setName("rahul");
		demo.setSalaryEarned(50000);
		return demo;
	}
}
