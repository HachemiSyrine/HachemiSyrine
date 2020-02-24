package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Joueur;
import com.example.demo.services.joueurService;

@Controller
public class joueurController {
	
	
	  joueurService joueurService ; 
	  
	  @RequestMapping(value = "/getAllPlayers", method = RequestMethod.GET)
	  public ArrayList<Joueur> getAllPlayers() {
	      return this.joueurService.getAllPlayers() ;
	   }

	  @RequestMapping(value = "/getPlayer/{id}", method = RequestMethod.GET)
	   public Joueur getPlayer(@PathVariable(value="id")long id ){
	      return this.joueurService.getPlayer(id);
	   }

	  @RequestMapping(value = "/updatePlayer", method = RequestMethod.PUT)
	   public void updatePlayer (@RequestBody Joueur player  ){
	       this.joueurService.updatePlayer(player);
	   }
	  @RequestMapping(value = "/deletePlayer/{id}", method = RequestMethod.DELETE)
	   public void  deletePlayer(@PathVariable(value="id")long id ){
	       this.joueurService.deletePlayer(id);
	   }
	  @RequestMapping(value = "/addPlayer", method = RequestMethod.POST)
	   public void addPlayer (@RequestBody Joueur player  ){
	       this.joueurService.addPlayers(player);
	   }
	  
	  

}
