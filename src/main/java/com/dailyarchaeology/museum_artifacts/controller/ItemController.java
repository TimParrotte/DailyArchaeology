package com.dailyarchaeology.museum_artifacts.controller;

import com.dailyarchaeology.museum_artifacts.domain.MuseumItemFactory;
import com.dailyarchaeology.museum_artifacts.domain.UniversalItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

/**
 * ItemController associates the UniversalItemDto class with the ItemTemplate HTML file.
 */

@Controller
public class ItemController {

	@Autowired
	MuseumItemFactory museumItemFactory;

	@GetMapping({"/", "/item"})
	public String index(Model model) throws IOException, InterruptedException {
		UniversalItemDto item = museumItemFactory.getMuseumItem();
		model.addAttribute("title", item.getTitle());
		model.addAttribute("description", item.getDescription());
		model.addAttribute("imageUrl", item.getImageUrl());
		model.addAttribute("culture", item.getCulture());
		model.addAttribute("era", item.getEra());
		model.addAttribute("medium", item.getMedium());
		return "itemTemplate";
	}

}
