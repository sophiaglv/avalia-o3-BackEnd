package com.cidade.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cidade.entities.Cidade;
import com.cidade.service.CidadeService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/cidade")
public class CidadeController {
	private final CidadeService cidadeService;
	
	public CidadeController(CidadeService cidadeService) {
		this.cidadeService = cidadeService;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Cidade>>getAllCidade(){
		List<Cidade>cidades = cidadeService.getAllCidade();
		return ResponseEntity.ok(cidades);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cidade>getCidadeById(@PathVariable Long id){
		Cidade cidade = cidadeService.getCidadeById(id);
		if(cidade != null) {
			return ResponseEntity.ok(cidade);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/")
	public ResponseEntity<Cidade>saveCidade(@RequestBody @Valid Cidade cidade){
		Cidade saveCidade = cidadeService.saveCidade(cidade);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveCidade);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Cidade>updateCidade(@PathVariable @RequestBody @Valid Long id, Cidade cidade){
		Cidade updateCidade = cidadeService.updateCidade(cidade, id);
		if(updateCidade != null) {
			return ResponseEntity.ok(cidade);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteCidade(@PathVariable Long id){
		boolean delete = cidadeService.deleteCidade(id);
		if(delete) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}
