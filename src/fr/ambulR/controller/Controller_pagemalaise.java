package fr.ambulR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.ambulR.model.Connexion;

@Controller
public class Controller_pagemalaise {
	
	@RequestMapping("/malaise")
	public String home(Model model) {
		model.addAttribute("user", new Connexion());
	return "page_malaise";
	}
	}


