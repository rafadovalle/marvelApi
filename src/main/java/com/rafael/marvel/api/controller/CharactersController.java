package com.rafael.marvel.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.marvel.domain.model.Characters;
import com.rafael.marvel.domain.repository.CharactersRepository;

@RestController
@RequestMapping("/characters")
public class CharactersController {

	@Autowired
	private CharactersRepository charactersRepository;
		
	//Realiza a busca a partir do parâmetro URI passado no RequestMapping da classe
	@GetMapping
	public List<Characters> listar() {
		return charactersRepository.findAll();
	}
	
	@GetMapping("/{characterId}")
	public ResponseEntity<Characters> buscar(@PathVariable Long characterId) {
		Optional<Characters> character = charactersRepository.findById(characterId);
		
		// Validação de código http
		if (character.isPresent()) {
			return ResponseEntity.ok(character.get());
		}
		
		return ResponseEntity.notFound().build();
	}
		
}
