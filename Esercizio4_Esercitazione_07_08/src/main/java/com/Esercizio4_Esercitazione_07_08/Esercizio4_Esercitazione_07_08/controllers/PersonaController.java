package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.dto.PersonaDto;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.entities.Persona;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.services.PersonaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/persone")
public class PersonaController {

	@Autowired
	PersonaService ps;

	@PostMapping
	public ResponseEntity<String> salva(@Valid @RequestBody PersonaDto dto) {
		ps.salvaPersona(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Persona creata correttamente");
	}

	@GetMapping
	public ResponseEntity<List<Persona>> cercaTutte() {
		return ResponseEntity.ok(ps.cercaTuttePersone());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Persona> cercaPerId(@PathVariable Integer id) {
		Optional<Persona> p = ps.cercaPersona(id);
		return p.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping("/cf/{codiceFiscale}")
	public ResponseEntity<Persona> cercaPerCf(@PathVariable String codiceFiscale) {
		Persona p = ps.cercaPersonaDalCf(codiceFiscale);
		return p != null ? ResponseEntity.ok(p) : ResponseEntity.notFound().build();
	}

	@PutMapping("/{id}/nome")
	public ResponseEntity<String> modificaNome(@PathVariable Integer id, @RequestParam String nome) {
		try {
			ps.modificaNomePersona(nome, id);
			return ResponseEntity.ok("Nome aggiornato");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@PutMapping("/{id}/cognome")
	public ResponseEntity<String> modificaCognome(@PathVariable Integer id, @RequestParam String cognome) {
		try {
			ps.modificaCognomePersona(cognome, id);
			return ResponseEntity.ok("Cognome aggiornato");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@PutMapping("/{id}/codiceFiscale")
	public ResponseEntity<String> modificaCf(@PathVariable Integer id, @RequestParam String codiceFiscale) {
		try {
			ps.modificaCfPersona(codiceFiscale, id);
			return ResponseEntity.ok("Codice fiscale aggiornato");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> cancella(@PathVariable Integer id) {
		ps.cancellaPersona(id);
		return ResponseEntity.ok("Persona eliminata");
	}
}