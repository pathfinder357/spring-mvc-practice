package com.sparta.springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}

	@GetMapping("/get")
	@ResponseBody
	public String get() {
		return "get";
	}

	@PostMapping("/post")
	@ResponseBody
	public String post() {
		return "post";
	}

	@PutMapping("/put")
	@ResponseBody
	public String put() {
		return "put";
	}

	@DeleteMapping("/delete")
	@ResponseBody
	public String delete() {
		return "delete";
	}

}
