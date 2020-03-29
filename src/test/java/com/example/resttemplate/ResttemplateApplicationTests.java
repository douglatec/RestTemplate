package com.example.resttemplate;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResttemplateApplicationTests {

	@Test
	public void consumerAPI() {
		
		//https://api.trello.com/1/boards/5612e4f91b25c15e873722b8?fields=all
		//https://api.hgbrasil.com/geoip
		//https://api.hgbrasil.com/geoip?fields=only_results,city,region,country_name,continent&key=14a603cf&address=remote
		//https://api.hgbrasil.com/geoip?key=14a603cf&address=remote&precision=false
		
		RestTemplate template = new RestTemplate();
		
		
		//REQUEST TRELLO
		
		
		 UriComponents uri = UriComponentsBuilder.newInstance()
		.scheme("https")
		.host("api.trello.com")
		.path("1/boards/5612e4f91b25c15e873722b8")
		.queryParam("fields","all")
		.build();
		
		ResponseEntity<Trello> entity = template.getForEntity(uri.toString(), Trello.class);
		
		System.out.println(entity.getBody().getName());
		
		
		
		
		//REQUEST HGBRASIL
		
		/*
		 UriComponents uri = UriComponentsBuilder.newInstance()
					.scheme("https")
					.host("api.hgbrasil.com")
					.path("geoip")					
					.queryParam("key","14a603cf")
					.queryParam("address","remote")
					.queryParam("precision","false")
					.build();
					
					ResponseEntity<HGbrasil> entity = template.getForEntity(uri.toString(), HGbrasil.class);
					
					System.out.println(entity.getBody().getCity());
					System.out.println(entity.getBody().getRegion());
		*/
		
		
	}

}
