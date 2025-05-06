package com.cidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cidade.entities.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
