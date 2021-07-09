package com.citius.mstwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {

	@GetMapping("/heroes")
	public String[] getName() {
		{
			return new String[] {"John","James","Jakie"};
		}
	}
}
