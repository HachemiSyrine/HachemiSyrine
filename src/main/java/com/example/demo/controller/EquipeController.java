package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Equipe;
import com.example.demo.entity.Joueur;
import com.example.demo.services.EquipeService;;

@Controller
public class EquipeController {
	
	  EquipeService equipeService ; 

	
	
	  @RequestMapping(value = "/getAllPlayers", method = RequestMethod.GET)
	  public ArrayList<Equipe> getAllPlayers() {
	      return this.equipeService.getAllTeams() ;
	   }

	  @RequestMapping(value = "/getTeam/{id}", method = RequestMethod.GET)
	   public Equipe getTeam(@PathVariable(value="id")long id ){
	      return this.equipeService.getTeam(id);
	   }

	  @RequestMapping(value = "/updateTeam", method = RequestMethod.PUT)
	   public void updatePlayer (@RequestBody Equipe player  ){
	       this.equipeService.updateTeam(player);
	   }
	  @RequestMapping(value = "/deleteTeam/{id}", method = RequestMethod.DELETE)
	   public void  deletePlayer(@PathVariable(value="id")long id ){
	       this.equipeService.deleteTeam(id);
	   }
	  @RequestMapping(value = "/addTeam", method = RequestMethod.POST)
	   public void addPlayer (@RequestBody Equipe player  ){
	       this.equipeService.addTeam(player);
	   }
	  
}
