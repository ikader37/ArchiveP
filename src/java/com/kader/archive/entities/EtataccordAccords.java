/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kader.archive.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "etataccord_accords")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtataccordAccords.findAll", query = "SELECT e FROM EtataccordAccords e")
    , @NamedQuery(name = "EtataccordAccords.findById", query = "SELECT e FROM EtataccordAccords e WHERE e.id = :id")
    , @NamedQuery(name = "EtataccordAccords.findByCreatedAt", query = "SELECT e FROM EtataccordAccords e WHERE e.createdAt = :createdAt")
    , @NamedQuery(name = "EtataccordAccords.findByUpdatedAt", query = "SELECT e FROM EtataccordAccords e WHERE e.updatedAt = :updatedAt")})
public class EtataccordAccords implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "accord_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Accords accordId;
    @JoinColumn(name = "etataccord_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Etataccords etataccordId;

    public EtataccordAccords() {
    }

    public EtataccordAccords(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Accords getAccordId() {
        return accordId;
    }

    public void setAccordId(Accords accordId) {
        this.accordId = accordId;
    }

    public Etataccords getEtataccordId() {
        return etataccordId;
    }

    public void setEtataccordId(Etataccords etataccordId) {
        this.etataccordId = etataccordId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtataccordAccords)) {
            return false;
        }
        EtataccordAccords other = (EtataccordAccords) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kader.archive.entities.EtataccordAccords[ id=" + id + " ]";
    }
    
}
