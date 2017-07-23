package com.emon;

import static org.junit.Assert.assertThat;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.assertj.core.api.BDDAssertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Controller.class,webEnvironment=WebEnvironment.RANDOM_PORT)
public class ExceptionhandlingApplicationTests {

	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate;

	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void doTest(){
		ResponseEntity<Map> map = restTemplate.getForEntity("http://los.dev:"+port+"/person/info", Map.class);
	}

}
