package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Equipe")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, 
        allowGetters = true)
public class Equipe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nomEquipe;
	
	private String urlLogo;
	
	@OneToMany
	@JoinColumn(name = "equipe_id")
	@JsonManagedReference
	private List<Joueur> joueurs;
//	
//	@OneToMany
//	@JoinColumn(name = "equipe_id")
//	@JsonManagedReference
//	private List<Staff> staffs;

	
	
	public Equipe() {
		super();
	}

	public Equipe(String nomEquipe, List<Joueur> joueurs, String urlLogo) {
		super();
		this.nomEquipe = nomEquipe;
		this.joueurs = joueurs;
	//	this.staffs = staffs;
		this.urlLogo = urlLogo;
	}
	
	public Equipe(String nomEquipe, List<Joueur> joueurs) {
		super();
		this.nomEquipe = nomEquipe;
		this.joueurs = joueurs;
		//this.staffs = staffs;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomEquipe() {
		return nomEquipe;
	}

	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}

	public List<Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}

	


	public String getUrlLogo() {
		return urlLogo;
	}

	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
	}
	
}
