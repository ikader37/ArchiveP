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
@Table(name = "langues")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Langues.findAll", query = "SELECT l FROM Langues l")
    , @NamedQuery(name = "Langues.findById", query = "SELECT l FROM Langues l WHERE l.id = :id")
    , @NamedQuery(name = "Langues.findByNom", query = "SELECT l FROM Langues l WHERE l.nom = :nom")
    , @NamedQuery(name = "Langues.findByCode", query = "SELECT l FROM Langues l WHERE l.code = :code")
    , @NamedQuery(name = "Langues.findByCreatedAt", query = "SELECT l FROM Langues l WHERE l.createdAt = :createdAt")
    , @NamedQuery(name = "Langues.findByUpdatedAt", query = "SELECT l FROM Langues l WHERE l.updatedAt = :updatedAt")})
public class Langues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "nom")
    private String nom;
    @Size(max = 255)
    @Column(name = "code")
    private String code;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users userId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "langueId")
    private List<LangueGestionfichiers> langueGestionfichiersList;

    public Langues() {
    }

    public Langues(Integer id) {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    public List<LangueGestionfichiers> getLangueGestionfichiersList() {
        return langueGestionfichiersList;
    }

    public void setLangueGestionfichiersList(List<LangueGestionfichiers> langueGestionfichiersList) {
        this.langueGestionfichiersList = langueGestionfichiersList;
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
        if (!(object instanceof Langues)) {
            return false;
        }
        Langues other = (Langues) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kader.archive.entities.Langues[ id=" + id + " ]";
    }
    
}
