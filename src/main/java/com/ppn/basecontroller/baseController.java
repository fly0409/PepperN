package com.ppn.basecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class baseController {

	@GetMapping("/")
	public String toindex() {
		return "index";
	}
}
