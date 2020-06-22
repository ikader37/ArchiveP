/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kader.archive.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "souscategories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Souscategories.findAllTable", query = "SELECT s FROM Souscategories s")
    , @NamedQuery(name = "Souscategories.findById", query = "SELECT s FROM Souscategories s WHERE s.id = :id")
    , @NamedQuery(name = "Souscategories.findByNom", query = "SELECT s FROM Souscategories s WHERE s.nom = :nom")
    , @NamedQuery(name = "Souscategories.findByCreatedAt", query = "SELECT s FROM Souscategories s WHERE s.createdAt = :createdAt")
    , @NamedQuery(name = "Souscategories.findByUpdatedAt", query = "SELECT s FROM Souscategories s WHERE s.updatedAt = :updatedAt")
    , @NamedQuery(name = "Souscategories.findAll", query = "SELECT s FROM Souscategories s WHERE s.deleted = :deleted")})
public class Souscategories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "nom")
    private String nom;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users userId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "souscategorieId")
    private List<SouscategorieAccords> souscategorieAccordsList;
    @Column(name = "deleted")
    private boolean deleted;

    public Souscategories() {
    }

    public Souscategories(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @XmlTransient
    public List<SouscategorieAccords> getSouscategorieAccordsList() {
        return souscategorieAccordsList;
    }

    public void setSouscategorieAccordsList(List<SouscategorieAccords> souscategorieAccordsList) {
        this.souscategorieAccordsList = souscategorieAccordsList;
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
        if (!(object instanceof Souscategories)) {
            return false;
        }
        Souscategories other = (Souscategories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    
    @Override
    public String toString() {
        return "com.kader.archive.entities.Souscategories[ id=" + id + " ]";
    }
    
}
