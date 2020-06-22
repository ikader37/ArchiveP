/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kader.archive.beans;

import com.kader.archive.entities.Typedocuments;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP
 */
@Stateless
public class TypedocumentsFacade extends AbstractFacade<Typedocuments> {

    @PersistenceContext(unitName = "ArchivePPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypedocumentsFacade() {
        super(Typedocuments.class);
    }
    
    
    public List<Typedocuments> findAll(){
        return em.createNamedQuery("Typedocuments.findAll").setParameter("deleted", false).getResultList();
    }
}
