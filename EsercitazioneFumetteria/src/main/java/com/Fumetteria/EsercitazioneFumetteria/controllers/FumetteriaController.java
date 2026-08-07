package com.Fumetteria.EsercitazioneFumetteria.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Fumetteria.EsercitazioneFumetteria.models.dto.FumetteriaDTO;
import com.Fumetteria.EsercitazioneFumetteria.models.entities.Fumetteria;
import com.Fumetteria.EsercitazioneFumetteria.services.FumetteriaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/fumetterie")
public class FumetteriaController {

	@Autowired
	FumetteriaService fs;

	// CREATE
	@PostMapping
	public ResponseEntity<String> salva(@Valid @RequestBody FumetteriaDTO dto) {
		fs.salvaFumetteria(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Fumetteria creata correttamente");
	}

	@PostMapping("/batch")
	public ResponseEntity<String> salvaMultiple(@RequestBody List<FumetteriaDTO> lista) {
		fs.salvaFumetterie(lista);
		return ResponseEntity.status(HttpStatus.CREATED).body("Create " + lista.size() + " fumetterie");
	}

	// READ
	@GetMapping
	public ResponseEntity<List<Fumetteria>> cercaTutte() {
		return ResponseEntity.ok(fs.cercaTutteFumetterie());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Fumetteria> cercaPerId(@PathVariable Integer id) {
		Optional<Fumetteria> f = fs.cercaFumetteria(id);
		return f.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<Fumetteria> cercaPerNome(@PathVariable String nome) {
		Fumetteria f = fs.cercaFumetteriaDalNome(nome);
		return f != null ? ResponseEntity.ok(f) : ResponseEntity.notFound().build();
	}

	@GetMapping("/indirizzo/{indirizzo}")
	public ResponseEntity<Fumetteria> cercaPerIndirizzo(@PathVariable String indirizzo) {
		Fumetteria f = fs.cercaFumetteriaDaIndirizzo(indirizzo);
		return f != null ? ResponseEntity.ok(f) : ResponseEntity.notFound().build();
	}

	// UPDATE
	@PutMapping("/{id}/nome")
	public ResponseEntity<String> modificaNome(@PathVariable Integer id, @RequestParam String nome) {
		try {
			fs.modificaNomeFumetteria(nome, id);
			return ResponseEntity.ok("Nome aggiornato");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@PutMapping("/{id}/indirizzo")
	public ResponseEntity<String> modificaIndirizzo(@PathVariable Integer id, @RequestParam String indirizzo) {
		try {
			fs.modificaIndirizzoFumetteria(indirizzo, id);
			return ResponseEntity.ok("Indirizzo aggiornato");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	// DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<String> cancella(@PathVariable Integer id) {
		fs.cancellaFumetteria(id);
		return ResponseEntity.ok("Fumetteria eliminata");
	}

}