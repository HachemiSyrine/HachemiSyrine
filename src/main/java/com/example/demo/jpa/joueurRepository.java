package com.example.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Joueur;
@Repository
public interface joueurRepository extends JpaRepository<Joueur , Long> {

}
