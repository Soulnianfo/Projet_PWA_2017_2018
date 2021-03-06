/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsc.projet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author Noura
 */
@Entity
@Data
public class Image {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;
    
    String url;
    
    String alt;
    //@OneToOne
    //public Student student;
    public Image() {
        
    }
   
    public Image(String url, String alt) {
        this.url = url;
        this.alt = alt;
    }
    
    
}
