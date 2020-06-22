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
@Table(name = "langue_gestionfichiers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LangueGestionfichiers.findAll", query = "SELECT l FROM LangueGestionfichiers l")
    , @NamedQuery(name = "LangueGestionfichiers.findById", query = "SELECT l FROM LangueGestionfichiers l WHERE l.id = :id")
    , @NamedQuery(name = "LangueGestionfichiers.findByCreatedAt", query = "SELECT l FROM LangueGestionfichiers l WHERE l.createdAt = :createdAt")
    , @NamedQuery(name = "LangueGestionfichiers.findByUpdatedAt", query = "SELECT l FROM LangueGestionfichiers l WHERE l.updatedAt = :updatedAt")})
public class LangueGestionfichiers implements Serializable {

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
    @JoinColumn(name = "gestionfichier_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Gestionfichiers gestionfichierId;
    @JoinColumn(name = "langue_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Langues langueId;

    public LangueGestionfichiers() {
    }

    public LangueGestionfichiers(Integer id) {
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

    public Gestionfichiers getGestionfichierId() {
        return gestionfichierId;
    }

    public void setGestionfichierId(Gestionfichiers gestionfichierId) {
        this.gestionfichierId = gestionfichierId;
    }

    public Langues getLangueId() {
        return langueId;
    }

    public void setLangueId(Langues langueId) {
        this.langueId = langueId;
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
        if (!(object instanceof LangueGestionfichiers)) {
            return false;
        }
        LangueGestionfichiers other = (LangueGestionfichiers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kader.archive.entities.LangueGestionfichiers[ id=" + id + " ]";
    }
    
}
