package com.Fumetteria.EsercitazioneFumetteria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Fumetteria.EsercitazioneFumetteria.models.dto.FumetteriaDTO;
import com.Fumetteria.EsercitazioneFumetteria.services.FumetteriaService;

import ch.qos.logback.core.model.Model;

@RequestMapping("Fumetteria")
@Controller
public class ControllerParams {
	
	@Autowired
	FumetteriaService fs;
	
	//post crea
	//put aggiorna
	//delete elimina
	
	@PostMapping("/salvaFumetteria")
	public void salvaFumetteria(@RequestBody FumetteriaDTO fd) {
		
		fs.salvaFumetteria(fd);
		
	}
	
	@GetMapping("/cercaFumetteriaById")
	public void cercaFumetteria(@RequestParam Integer id) {
		
		System.out.println(fs.cercaFumetteria(id));
		
	}
	
	
	
}
