package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Joueur;
import com.example.demo.jpa.joueurRepository;

@RestController
public class joueurService {
	@Autowired
	joueurRepository joueurRepository ; 
	
	
	public void addPlayers(Joueur player) {
		joueurRepository.save(player) ; 
	}
	public void updatePlayer(Joueur player) {
		joueurRepository.saveAndFlush(player) ; 
	}
	public void deletePlayer(Long id) {
		joueurRepository.deleteById(id); 
	}
	public ArrayList<Joueur> getAllPlayers() {
		return (ArrayList<Joueur>) joueurRepository.findAll() ; 
	}
	public Joueur getPlayer(Long id) {
		return joueurRepository.getOne(id);
	}

}
