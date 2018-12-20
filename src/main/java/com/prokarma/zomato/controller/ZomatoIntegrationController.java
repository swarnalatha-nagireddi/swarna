package com.prokarma.zomato.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ZomatoIntegrationController {

	@RequestMapping("/api/restaurantDetails")
	public String getZomatoAPI() {
		final String uri = "https://developers.zomato.com/documentation#!/restaurant/restaurant_0?key=718f7d88e935e0df4103da96ba7eb81c";

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	    System.out.println("Hai");
		return result;
	}
}
