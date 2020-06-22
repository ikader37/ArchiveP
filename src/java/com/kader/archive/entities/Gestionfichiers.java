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
@Table(name = "gestionfichiers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gestionfichiers.findAll", query = "SELECT g FROM Gestionfichiers g")
    , @NamedQuery(name = "Gestionfichiers.findById", query = "SELECT g FROM Gestionfichiers g WHERE g.id = :id")
    , @NamedQuery(name = "Gestionfichiers.findByNomfichier", query = "SELECT g FROM Gestionfichiers g WHERE g.nomfichier = :nomfichier")
    , @NamedQuery(name = "Gestionfichiers.findByFichier", query = "SELECT g FROM Gestionfichiers g WHERE g.fichier = :fichier")
    , @NamedQuery(name = "Gestionfichiers.findByCreatedAt", query = "SELECT g FROM Gestionfichiers g WHERE g.createdAt = :createdAt")
    , @NamedQuery(name = "Gestionfichiers.findByUpdatedAt", query = "SELECT g FROM Gestionfichiers g WHERE g.updatedAt = :updatedAt")})
public class Gestionfichiers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "nomfichier")
    private String nomfichier;
    @Size(max = 255)
    @Column(name = "fichier")
    private String fichier;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gestionfichierId")
    private List<AccordGestionfichiers> accordGestionfichiersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gestionfichierId")
    private List<LangueGestionfichiers> langueGestionfichiersList;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users userId;

    public Gestionfichiers() {
    }

    public Gestionfichiers(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomfichier() {
        return nomfichier;
    }

    public void setNomfichier(String nomfichier) {
        this.nomfichier = nomfichier;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
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
    public List<AccordGestionfichiers> getAccordGestionfichiersList() {
        return accordGestionfichiersList;
    }

    public void setAccordGestionfichiersList(List<AccordGestionfichiers> accordGestionfichiersList) {
        this.accordGestionfichiersList = accordGestionfichiersList;
    }

    @XmlTransient
    public List<LangueGestionfichiers> getLangueGestionfichiersList() {
        return langueGestionfichiersList;
    }

    public void setLangueGestionfichiersList(List<LangueGestionfichiers> langueGestionfichiersList) {
        this.langueGestionfichiersList = langueGestionfichiersList;
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
        if (!(object instanceof Gestionfichiers)) {
            return false;
        }
        Gestionfichiers other = (Gestionfichiers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kader.archive.entities.Gestionfichiers[ id=" + id + " ]";
    }
    
}
