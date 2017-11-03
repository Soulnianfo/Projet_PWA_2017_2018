/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsc.projet.Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author snianfo
 */
@Entity
@Data
public class Company {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)        
    long id;
    String nom;
    
    String description;
    
    @OneToOne(cascade = CascadeType.ALL)
    Image img;
    
   // @ManyToMany
    //List<Domain> dom = new ArrayList<>();
    
    //@OneToMany(cascade = CascadeType.ALL)
   // List<Project> projects = new ArrayList<>();
    
    //@OneToMany(cascade = CascadeType.ALL)
  //  List<Competition> competitions = new ArrayList<>();

    public Company() {
        
    }

    public Company(String nom, String description, List<Domain> dom) {
        this.nom = nom;
        this.description = description;
      //  this.dom = dom;
    }
}