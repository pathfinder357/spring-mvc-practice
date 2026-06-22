package com.sparta.springmvc2.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

	private static long visitcount = 0;

	@GetMapping("/static-hello")
	public String hello() {
		return "hello.html";
	}

	@GetMapping("/html/redirect")
	public String redirect() {
		return "redirect:/hello.html";
	}

	@GetMapping("/html/templates")
	public String templates() {
		return "hello";
	}

	@GetMapping("/html/dynamic")
	public String dynamic(Model model) {
		visitcount++;
		model.addAttribute("visits", visitcount);
		return "hello-visit";
	}
}
