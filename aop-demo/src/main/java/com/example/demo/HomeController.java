package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String getHome() {
		return "server started!!!";
	}
	@GetMapping("/test1")
	public void test1() {
		System.out.println("test1..");
	}
	@GetMapping("/test2")
	public void test2() {
		for(int i =1;i<1000; i++) {
			System.out.print("A");
		}
		System.out.println("test2..");
	}
	@GetMapping("/test3")
	public void test3() {
		System.out.println("test3..");
	}
}
