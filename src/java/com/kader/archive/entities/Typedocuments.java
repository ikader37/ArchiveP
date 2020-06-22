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
@Table(name = "typedocuments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Typedocuments.findAllTable", query = "SELECT t FROM Typedocuments t")
    , @NamedQuery(name = "Typedocuments.findById", query = "SELECT t FROM Typedocuments t WHERE t.id = :id")
    , @NamedQuery(name = "Typedocuments.findByNom", query = "SELECT t FROM Typedocuments t WHERE t.nom = :nom")
    , @NamedQuery(name = "Typedocuments.findByCreatedAt", query = "SELECT t FROM Typedocuments t WHERE t.createdAt = :createdAt")
    , @NamedQuery(name = "Typedocuments.findByUpdatedAt", query = "SELECT t FROM Typedocuments t WHERE t.updatedAt = :updatedAt")
    , @NamedQuery(name = "Typedocuments.findAll", query = "SELECT t FROM Typedocuments t WHERE t.deleted = :deleted")})
public class Typedocuments implements Serializable {

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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typedocumentId")
    private List<TypedocAccords> typedocAccordsList;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users userId;
    @Column(name = "deleted")
    private boolean deleted;

    public Typedocuments() {
    }

    public Typedocuments(Integer id) {
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

    @XmlTransient
    public List<TypedocAccords> getTypedocAccordsList() {
        return typedocAccordsList;
    }

    public void setTypedocAccordsList(List<TypedocAccords> typedocAccordsList) {
        this.typedocAccordsList = typedocAccordsList;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
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
        if (!(object instanceof Typedocuments)) {
            return false;
        }
        Typedocuments other = (Typedocuments) object;
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
        return "com.kader.archive.entities.Typedocuments[ id=" + id + " ]";
    }
    
}
