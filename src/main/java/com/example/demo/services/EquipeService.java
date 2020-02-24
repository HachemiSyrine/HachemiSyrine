package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Equipe;
import com.example.demo.entity.Joueur;
import com.example.demo.jpa.equipeRepository;
import com.example.demo.jpa.joueurRepository;

@RestController
public class EquipeService {
	@Autowired
	equipeRepository equipeRepository ; 
	
	
	public void addTeam(Equipe equipe) {
		equipeRepository.save(equipe) ; 
	}
	public void updateTeam(Equipe equipe) {
		equipeRepository.saveAndFlush(equipe) ; 
	}
	public void deleteTeam(Long id) {
		equipeRepository.deleteById(id); 
	}
	public ArrayList<Equipe> getAllTeams() {
		return (ArrayList<Equipe>) equipeRepository.findAll() ; 
	}
	public Equipe getTeam(Long id) {
		return equipeRepository.getOne(id);
	}

	
	
}
