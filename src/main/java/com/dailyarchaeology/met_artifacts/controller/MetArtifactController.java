package com.dailyarchaeology.met_artifacts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MetArtifactController {
	
	@GetMapping("/")
	public String getTemplate(@RequestParam(name="imageUrl", required=true) String imageUrl, Model model) {
		model.addAttribute("imageUrl", imageUrl);
		return "template";
	}

}
