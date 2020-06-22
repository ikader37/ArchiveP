/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kader.archive.controller;

import com.kader.archive.beans.SouscategoriesFacade;
import com.kader.archive.beans.UsersFacade;
import com.kader.archive.entities.Souscategories;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import utilities.JSFUtils;

/**
 *
 * @author HP
 */
@Named("SousCategorieController")
@SessionScoped
public class SousCategorieController  implements Serializable{
    
    private Souscategories sousCat=new Souscategories();
    private List<Souscategories> listCategories=new ArrayList<>();
    private JSFUtils jsfu=new JSFUtils();

    public Souscategories getSousCat() {
        return sousCat;
    }

    public void setSousCat(Souscategories sousCat) {
        this.sousCat = sousCat;
    }

    public List<Souscategories> getListCategories() {
        return listCategories;
    }

    public void setListCategories(List<Souscategories> listCategories) {
        this.listCategories = listCategories;
    }
    
    
    
    
    
    @Inject
    SouscategoriesFacade sousCatFacade;
    @Inject
    UsersFacade userFacade;
    
    
    @PostConstruct
    public void init(){
        sousCat=new Souscategories();
        listCategories=sousCatFacade.findAll();
    }
    
    public void enregistrer(){
        if(sousCat.getId()==null){
            
            sousCat.setCreatedAt(new Date());
            sousCat.setUpdatedAt(new Date());
            sousCat.setUserId(userFacade.find(1));
            try{
                sousCatFacade.create(sousCat);
                jsfu.sendInfoMessage("Enregistrement reussi!!!");
                init();
            }catch(Exception ex){
                ex.printStackTrace();
                jsfu.sendErrorMessage("Enregistrement echoue!!");
            }
        }else{
            sousCat.setUpdatedAt(new Date());
            try{
                sousCatFacade.edit(sousCat);
                jsfu.sendInfoMessage("Enregistrement reussi!!");
                init();
            }catch(Exception ex){
                jsfu.sendErrorMessage("Enregistrement echoue!");
                ex.printStackTrace();
                
            }
        }
    }
    
    public void supprimer(){
        
        try{
            sousCat.setUpdatedAt(new Date());
            sousCat.setDeleted(true);
            sousCatFacade.edit(sousCat);
            jsfu.sendInfoMessage("Enregistrement reussi!!");
            init();
            
        }catch(Exception ex){
            jsfu.sendErrorMessage("Suppression echouee!!");
            ex.printStackTrace();
        }
    }
}
