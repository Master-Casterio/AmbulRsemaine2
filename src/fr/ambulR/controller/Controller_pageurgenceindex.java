package fr.ambulR.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.ambulR.model.Connexion;

@Controller
public class Controller_pageurgenceindex {

	@RequestMapping(value = "/urgenceindex", method = RequestMethod.POST)
	public String subscribe(@Valid @ModelAttribute("user") Connexion connexion, BindingResult result, Model model) {
	if (result.hasErrors()) {
	System.out.println("L'utilisateur n'a pas été validé ...");
	return "page_accueil";
	}
	System.out.println("Identifiant : " + connexion.getIdentifiant() + " password : " + connexion.getPassword());
	return "page-urgenceindex";
	}
	}