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

import com.Fumetteria.EsercitazioneFumetteria.models.dto.MangaDTO;
import com.Fumetteria.EsercitazioneFumetteria.models.entities.Manga;
import com.Fumetteria.EsercitazioneFumetteria.services.MangaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/manga")
public class MangaController {

	@Autowired
	MangaService ms;

	// CREATE
	@PostMapping
	public ResponseEntity<String> salva(@Valid @RequestBody MangaDTO dto) {
		ms.salvaManga(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Manga creato correttamente");
	}

	@PostMapping("/batch")
	public ResponseEntity<String> salvaMultipli(@RequestBody List<MangaDTO> lista) {
		ms.salvaTuttiManga(lista);
		return ResponseEntity.status(HttpStatus.CREATED).body("Creati " + lista.size() + " manga");
	}

	// READ
	@GetMapping
	public ResponseEntity<List<Manga>> cercaTutti() {
		return ResponseEntity.ok(ms.cercaTuttiManga());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Manga> cercaPerId(@PathVariable Integer id) {
		Optional<Manga> m = ms.cercaManga(id);
		return m.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<Manga> cercaPerNome(@PathVariable String nome) {
		Manga m = ms.cercaMangaDalNome(nome);
		return m != null ? ResponseEntity.ok(m) : ResponseEntity.notFound().build();
	}

	// UPDATE
	@PutMapping("/{id}/nome")
	public ResponseEntity<String> modificaNome(@PathVariable Integer id, @RequestParam String nome) {
		try {
			ms.modificaNome(nome, id);
			return ResponseEntity.ok("Nome aggiornato");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@PutMapping("/{id}/descrizione")
	public ResponseEntity<String> modificaDescrizione(@PathVariable Integer id, @RequestParam String descrizione) {
		try {
			ms.modificaDescrizione(descrizione, id);
			return ResponseEntity.ok("Descrizione aggiornata");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@PutMapping("/{id}/capitoli")
	public ResponseEntity<String> modificaCapitoli(@PathVariable Integer id, @RequestParam int capitoli) {
		try {
			ms.modificaCapitoli(capitoli, id);
			return ResponseEntity.ok("Capitoli aggiornati");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@PutMapping("/{id}/valutazione")
	public ResponseEntity<String> modificaValutazione(@PathVariable Integer id, @RequestParam double valutazione) {
		try {
			ms.modificaValutazione(valutazione, id);
			return ResponseEntity.ok("Valutazione aggiornata");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	@PutMapping("/{id}/prezzo")
	public ResponseEntity<String> modificaPrezzo(@PathVariable Integer id, @RequestParam double prezzo) {
		try {
			ms.modificaPrezzo(prezzo, id);
			return ResponseEntity.ok("Prezzo aggiornato");
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}

	// DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<String> cancella(@PathVariable Integer id) {
		ms.cancellaManga(id);
		return ResponseEntity.ok("Manga eliminato");
	}

}
