package com.rafael.marvel.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafael.marvel.domain.model.Characters;

@Repository
public interface CharactersRepository extends JpaRepository<Characters, Long>{

}
