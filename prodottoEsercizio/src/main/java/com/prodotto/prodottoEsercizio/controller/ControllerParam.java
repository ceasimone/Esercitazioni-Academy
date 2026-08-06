package com.prodotto.prodottoEsercizio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("params")
@Controller
public class ControllerParam {
	
	@RequestMapping(params="testo")
	public String visualizzaTesto(@RequestParam("testo") String testo, Model model) {
		System.out.println("Il testo ricevuto è " + testo);
		
		model.addAttribute("testo",testo);
		
		return "index";
	}
	
	@RequestMapping(params="nomeProdotto")
	public String visualizzaProdotto(@RequestParam("nomeProdotto") String prodotto, Model model) {
		System.out.println("Il prodotto ricevuto è " + prodotto);
		
		model.addAttribute("prodotto","Il prodotto è : " + prodotto);
		
		return "index";
	}
	
	@RequestMapping(params="quantitaProdotto")
	public String quantitaProdotto(@RequestParam("quantitaProdotto") int quantita, Model model) {
		System.out.println("La quantità ricevuta è " + quantita);
		
		model.addAttribute("quantita","La quantità è : " + quantita);
		
		return "index";
	}
	
	@RequestMapping(params= {"descrizioneProdotto","prezzoProdotto"})
	public String prendiInformazioni(@RequestParam("descrizioneProdotto") String descrizione, @RequestParam("prezzoProdotto") double prezzo, Model model) {
		System.out.println("La descrizione è: " + descrizione + "\nIl prezzo è: " + prezzo);
		
		model.addAttribute("descrizione", "La descrizione è: " + descrizione);
		model.addAttribute("prezzo", "Il prezzo è: " + prezzo);
		
		return "index";
		
	}
	
	@RequestMapping("{nomeCliente}/Carrello")
	public String getCliente(@PathVariable String nomeCliente,  @RequestParam String prodotto, Model model) {
		System.out.println("Il cliente è: " + nomeCliente);
		
		model.addAttribute("cliente", "Il cliente  "+ nomeCliente);
		model.addAttribute("prodotto", "Il prodotto è  "+ prodotto);
		
		return "index";
	}
	
	
// NON RICHIAMARTE I CONTROLLER DA ALTRI CONTROLLER, NON VA BENE PER L'MVC, UTILIZZARE IL FORWARD
	
//	@RequestMapping(params= {"prodotto","quantita","descrizione","prezzo"})
//	public String informazioniProdotto(@RequestParam("prodotto") String prodotto, @RequestParam("quantita") int quantita, @RequestParam("descrizione") String descrizione, @RequestParam("prezzo") double prezzo, Model model) {
//		
//		visualizzaProdotto(prodotto,model);
//		quantitaProdotto(quantita,model);
//		prendiInformazioni(descrizione,prezzo,model);
//		 
//		return "index";
//	}
//	
//	@RequestMapping(value = "{nomeCliente}/Carrello",params= {"prodotto","quantita","descrizione","prezzo"})
//	public String informazioniCliente(@PathVariable String nomeCliente, @RequestParam("prodotto") String prodotto, @RequestParam("quantita") int quantita, @RequestParam("descrizione") String descrizione, @RequestParam("prezzo") double prezzo, Model model) {
//		
//		getCliente(nomeCliente,prodotto,model);
//		quantitaProdotto(quantita,model);
//		prendiInformazioni(descrizione,prezzo,model);
//		 
//		return "index";
//	}
	
	
	@RequestMapping(params= {"prodotto","quantita","descrizione","prezzo"})
	public String informazioniProdotto(@RequestParam("prodotto") String prodotto, @RequestParam("quantita") int quantita, @RequestParam("descrizione") String descrizione, @RequestParam("prezzo") double prezzo, Model model) {
		
		model.addAttribute("prodotto","Il prodotto è : " + prodotto);
		model.addAttribute("quantita","La quantità è : " + quantita);
		model.addAttribute("descrizione", "La descrizione è: " + descrizione);
		model.addAttribute("prezzo", "Il prezzo è: " + prezzo);
		 
		return "index";
	}
	
	@RequestMapping(value = "{nomeCliente}/Carrello",params= {"prodotto","quantita","descrizione","prezzo"})
	public String informazioniCliente(@PathVariable String nomeCliente, Model model) {
		
		model.addAttribute("cliente", "Il cliente  "+ nomeCliente);
		 
		return "forward:/params";
	}

}
