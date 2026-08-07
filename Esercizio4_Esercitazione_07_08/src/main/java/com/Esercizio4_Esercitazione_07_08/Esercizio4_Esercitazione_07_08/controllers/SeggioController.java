package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.dto.SeggioDto;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.entities.Seggio;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.services.SeggioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/seggi")
public class SeggioController {

	@Autowired
	SeggioService ss;

	@PostMapping
	public ResponseEntity<String> salva(@Valid @RequestBody SeggioDto dto) {
		ss.salvaSeggio(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Seggio creato correttamente");
	}

	@GetMapping
	public ResponseEntity<List<Seggio>> cercaTutti() {
		return ResponseEntity.ok(ss.cercaTuttiSeggi());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Seggio> cercaPerId(@PathVariable Integer id) {
		Optional<Seggio> s = ss.cercaSeggio(id);
		return s.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@PutMapping("/{id}/sede")
	public ResponseEntity<String> modificaSede(@PathVariable Integer id, @RequestParam String sede) {
		try {
			ss.modificaSede(sede, id);
			return ResponseEntity.ok("Sede aggiornata");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@PutMapping("/{id}/citta")
	public ResponseEntity<String> modificaCitta(@PathVariable Integer id, @RequestParam String citta) {
		try {
			ss.modificaCitta(citta, id);
			return ResponseEntity.ok("Città aggiornata");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@PutMapping("/{id}/provincia")
	public ResponseEntity<String> modificaProvincia(@PathVariable Integer id, @RequestParam String provincia) {
		try {
			ss.modificaProvincia(provincia, id);
			return ResponseEntity.ok("Provincia aggiornata");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@PutMapping("/{id}/regione")
	public ResponseEntity<String> modificaRegione(@PathVariable Integer id, @RequestParam String regione) {
		try {
			ss.modificaRegione(regione, id);
			return ResponseEntity.ok("Regione aggiornata");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> cancella(@PathVariable Integer id) {
		try {
			ss.cancellaSeggio(id);
			return ResponseEntity.ok("Seggio eliminato");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
}