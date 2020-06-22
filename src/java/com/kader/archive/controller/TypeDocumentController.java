/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kader.archive.controller;

import com.kader.archive.beans.TypedocumentsFacade;
import com.kader.archive.beans.UsersFacade;
import com.kader.archive.entities.Typedocuments;
import com.kader.archive.entities.Users;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.inject.Inject;
import utilities.JSFUtils;

/**
 *
 * @author HP
 */
@Named("typeDocumentController")
@SessionScoped
public class TypeDocumentController implements Serializable {

    private Typedocuments typeDoc = new Typedocuments();
    private List<Typedocuments> listTypeDocs = new ArrayList<>();
    JSFUtils jsfu = new JSFUtils();

    public Typedocuments getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(Typedocuments typeDoc) {
        this.typeDoc = typeDoc;
    }

    public List<Typedocuments> getListTypeDocs() {
        return listTypeDocs;
    }

    public void setListTypeDocs(List<Typedocuments> listTypeDocs) {
        this.listTypeDocs = listTypeDocs;
    }

    @Inject
    TypedocumentsFacade typeDocFacade;
    @Inject
    UsersFacade userFacade;

    @PostConstruct
    public void init() {
        typeDoc = new Typedocuments();
        listTypeDocs = typeDocFacade.findAll();

    }

    public void createTypeDocument() {
        if (typeDoc.getId() == null) {
            typeDoc.setCreatedAt(new Date());
            typeDoc.setUpdatedAt(new Date());
            try {
                Users u = userFacade.find(1);
                typeDoc.setUserId(u);
                typeDocFacade.create(typeDoc);
                jsfu.sendInfoMessage("Enregistrement effectue avec success");
                init();
            } catch (Exception ex) {
                ex.printStackTrace();
                jsfu.sendErrorMessage("Enregistrement echoue!!!");
            }

        } else {
            typeDoc.setUpdatedAt(new Date());
            Users u = new Users();
            u.setId(1);
            typeDoc.setUserId(u);
            typeDocFacade.edit(typeDoc);
           jsfu.sendInfoMessage("Enregistrement effectue avec success");
            init();
        }
    }
    
    public void supprimer(){
        this.typeDoc.setDeleted(true);
        try{
            this.typeDoc.setUpdatedAt(new Date());
            jsfu.sendInfoMessage("Suppression effectue avec success");
            typeDocFacade.edit(typeDoc);
            init();
        }catch(Exception ex){
            jsfu.sendErrorMessage("suppression echoue!!!");
        }
    }

}
