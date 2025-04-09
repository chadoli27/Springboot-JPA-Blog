package com.cos.blog.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello springboot</h1>";
	}
	
}
