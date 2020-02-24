package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Equipe;
import com.example.demo.entity.Joueur;
@Repository
public interface equipeRepository extends JpaRepository<Equipe , Long> {
	
}
