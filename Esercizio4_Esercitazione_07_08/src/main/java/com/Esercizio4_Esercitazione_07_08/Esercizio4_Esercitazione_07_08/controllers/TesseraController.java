package com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.controllers;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.dto.TesseraDto;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.models.entities.Tessera;
import com.Esercizio4_Esercitazione_07_08.Esercizio4_Esercitazione_07_08.services.TesseraService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tessere")
public class TesseraController {

	@Autowired
	TesseraService ts;

	@PostMapping
	public ResponseEntity<String> salva(@Valid @RequestBody TesseraDto dto) {
		try {
			ts.salvaTessera(dto);
			return ResponseEntity.status(HttpStatus.CREATED).body("Tessera creata correttamente");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@GetMapping
	public ResponseEntity<List<Tessera>> cercaTutte() {
		return ResponseEntity.ok(ts.cercaTutteTessere());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Tessera> cercaPerId(@PathVariable Integer id) {
		Optional<Tessera> t = ts.cercaTessera(id);
		return t.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@PutMapping("/{id}/scadenza")
	public ResponseEntity<String> modificaScadenza(@PathVariable Integer id,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate scadenza) {
		try {
			ts.modificaScadenza(scadenza, id);
			return ResponseEntity.ok("Scadenza aggiornata");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> cancella(@PathVariable Integer id) {
		try {
			ts.cancellatessera(id);
			return ResponseEntity.ok("Tessera eliminata");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
}