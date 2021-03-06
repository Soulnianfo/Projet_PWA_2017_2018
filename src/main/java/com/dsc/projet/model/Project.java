/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsc.projet.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author snianfo
 */
@Data
@Entity
public class Project implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    public String title;
    public String descrip;
    public String beginMonth;
    public String beginYear;
    public String endMonth;
    public String endYear;
    @ManyToOne(cascade = CascadeType.ALL)
    public Student author;
    @ManyToMany
    public List<Student> contributors = new ArrayList<>();
    public Project(){
        
    }

    public Project( String title, String descrip, String beginMonth, String beginYear, String endMonth, String endYear, Student author) {
        
        this.title = title;
        this.descrip = descrip;
        this.beginMonth = beginMonth;
        this.beginYear = beginYear;
        this.endMonth = endMonth;
        this.endYear = endYear;
        this.author = author;
    }

   
    
}
