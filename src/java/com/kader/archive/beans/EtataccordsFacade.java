/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kader.archive.beans;

import com.kader.archive.entities.Etataccords;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP
 */
@Stateless
public class EtataccordsFacade extends AbstractFacade<Etataccords> {

    @PersistenceContext(unitName = "ArchivePPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EtataccordsFacade() {
        super(Etataccords.class);
    }
    
}
