package com.sakha.sakhaBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {
	
	
	@GetMapping("/add")
	public String add(@RequestParam("t1") int a, @RequestParam("t2") int b, Model model) {
		
				
		model.addAttribute("sum",(a+b));
		
		return "show";
	}
	
	@GetMapping("/")
	public String defaultPage() {
		return  "view";
	}
	
}
