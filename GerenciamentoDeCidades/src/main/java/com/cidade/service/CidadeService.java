package com.cidade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cidade.entities.Cidade;
import com.cidade.repository.CidadeRepository;

@Service
public class CidadeService {
	private final CidadeRepository cidadeRepository;
	
	public CidadeService(CidadeRepository cidadeRepository) {
		this.cidadeRepository = cidadeRepository;
	}
	
	public List<Cidade>getAllCidade(){
		return cidadeRepository.findAll();
	}
	
	public Cidade getCidadeById(Long id) {
		return cidadeRepository.findById(id).orElse(null);
	}
	
	public Cidade saveCidade(Cidade cidade) {
		return cidadeRepository.save(cidade);
	}
	
	public Cidade updateCidade(Cidade cidade, Long id) {
		Optional<Cidade>existe = cidadeRepository.findById(id);
		if(existe.isPresent()) {
			cidade.setId(id);
			return cidadeRepository.save(cidade);
		}return null;
	}
	
	public boolean deleteCidade(Long id) {
		Optional<Cidade>existe = cidadeRepository.findById(id);
		if(existe.isPresent()) {
			cidadeRepository.deleteById(id);
			return true;
		}return false;
	}
}
