package com.citius.msone;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OneController {

	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/messages")
	public String[] getMessage() {
		
		StringBuilder builder = new StringBuilder("http://mstwo:8081/heroes");
		URI uri = URI.create(builder.toString());
		
		String heroes[] = restTemplate.getForObject(uri, String[].class);
		return new String[] { "Hello World", "Welcome",heroes[0],heroes[1],heroes[2] };
	}

}
