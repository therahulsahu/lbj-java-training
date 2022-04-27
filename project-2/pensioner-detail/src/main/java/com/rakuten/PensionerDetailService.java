package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class PensionerDetailService {
	
	List<PensionerDetail> details = new ArrayList<>();
	PensionerDetailService() {
		// sample data
		details.add(new PensionerDetail("Rahul", "1234567", "12348765", 50000, 4000, "self", "public"));
		details.add(new PensionerDetail("Nitesh", "5437889", "12345678", 40000, 3000, "self", "private"));
		details.add(new PensionerDetail("Ankita", "234351", "56781234", 60000, 5000, "family", "public"));
		details.add(new PensionerDetail("Ujjwal", "6456234", "56784321", 35000, 2500, "family", "private"));
		
	}
	
	
	PensionerDetail getPensionerDetails(String aadharNumber) {
		List<PensionerDetail> detail = details.stream().filter(pensionDetail -> pensionDetail.getAadharNumber().equals(aadharNumber)).collect(Collectors.toList());
		if(detail.size() == 0) {
			return new PensionerDetail(false);
		}
		System.out.println(detail.get(0));
		return detail.get(0);
	}
}
