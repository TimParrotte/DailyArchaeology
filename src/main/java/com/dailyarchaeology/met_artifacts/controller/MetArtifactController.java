package com.dailyarchaeology.met_artifacts.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dailyarchaeology.met_artifacts.domain.Item;
import com.dailyarchaeology.met_artifacts.service.MetApiService;
import com.fasterxml.jackson.core.JsonProcessingException;

@Controller
public class MetArtifactController {
	
	@Autowired
	MetApiService metApiService;
	
	@GetMapping("/metTemplate")
	public String getTemplate(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "metTemplate";
	}
	
	@GetMapping({"/", "/item"})
	public String index(Model model) throws JsonProcessingException, IOException, InterruptedException {
		Item item = metApiService.getItemForDisplay();
		model.addAttribute(item);
		return "itemTemplate";
	}

}
