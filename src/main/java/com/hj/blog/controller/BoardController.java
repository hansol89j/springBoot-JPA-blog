package com.hj.blog.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class BoardController {

	@GetMapping({"","/"})
	public String index() {
		return "index";
	}
}
