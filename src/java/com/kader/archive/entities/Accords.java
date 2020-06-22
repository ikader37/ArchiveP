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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "accords")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accords.findAll", query = "SELECT a FROM Accords a")
    , @NamedQuery(name = "Accords.findById", query = "SELECT a FROM Accords a WHERE a.id = :id")
    , @NamedQuery(name = "Accords.findByCote", query = "SELECT a FROM Accords a WHERE a.cote = :cote")
    , @NamedQuery(name = "Accords.findByNboitearchive", query = "SELECT a FROM Accords a WHERE a.nboitearchive = :nboitearchive")
    , @NamedQuery(name = "Accords.findByDateadoption", query = "SELECT a FROM Accords a WHERE a.dateadoption = :dateadoption")
    , @NamedQuery(name = "Accords.findByDateEntreeVigueur", query = "SELECT a FROM Accords a WHERE a.dateEntreeVigueur = :dateEntreeVigueur")
    , @NamedQuery(name = "Accords.findByLieuSignature", query = "SELECT a FROM Accords a WHERE a.lieuSignature = :lieuSignature")
    , @NamedQuery(name = "Accords.findByTitre", query = "SELECT a FROM Accords a WHERE a.titre = :titre")
    , @NamedQuery(name = "Accords.findByMotscles", query = "SELECT a FROM Accords a WHERE a.motscles = :motscles")
    , @NamedQuery(name = "Accords.findByMotsclesgeograph", query = "SELECT a FROM Accords a WHERE a.motsclesgeograph = :motsclesgeograph")
    , @NamedQuery(name = "Accords.findByNote", query = "SELECT a FROM Accords a WHERE a.note = :note")
    , @NamedQuery(name = "Accords.findByResume", query = "SELECT a FROM Accords a WHERE a.resume = :resume")
    , @NamedQuery(name = "Accords.findByCreatedAt", query = "SELECT a FROM Accords a WHERE a.createdAt = :createdAt")
    , @NamedQuery(name = "Accords.findByUpdatedAt", query = "SELECT a FROM Accords a WHERE a.updatedAt = :updatedAt")})
public class Accords implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "cote")
    private String cote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nboitearchive")
    private int nboitearchive;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateadoption")
    @Temporal(TemporalType.DATE)
    private Date dateadoption;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_entree_vigueur")
    @Temporal(TemporalType.DATE)
    private Date dateEntreeVigueur;
    @Size(max = 255)
    @Column(name = "lieu_signature")
    private String lieuSignature;
    @Size(max = 255)
    @Column(name = "titre")
    private String titre;
    @Size(max = 255)
    @Column(name = "motscles")
    private String motscles;
    @Size(max = 255)
    @Column(name = "motsclesgeograph")
    private String motsclesgeograph;
    @Size(max = 255)
    @Column(name = "note")
    private String note;
    @Size(max = 2147483647)
    @Column(name = "resume")
    private String resume;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Users userId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accordId")
    private List<AccordGestionfichiers> accordGestionfichiersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accordId")
    private List<TypedocAccords> typedocAccordsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accordId")
    private List<EtataccordAccords> etataccordAccordsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accordId")
    private List<SouscategorieAccords> souscategorieAccordsList;

    public Accords() {
    }

    public Accords(Integer id) {
        this.id = id;
    }

    public Accords(Integer id, int nboitearchive, Date dateadoption, Date dateEntreeVigueur) {
        this.id = id;
        this.nboitearchive = nboitearchive;
        this.dateadoption = dateadoption;
        this.dateEntreeVigueur = dateEntreeVigueur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCote() {
        return cote;
    }

    public void setCote(String cote) {
        this.cote = cote;
    }

    public int getNboitearchive() {
        return nboitearchive;
    }

    public void setNboitearchive(int nboitearchive) {
        this.nboitearchive = nboitearchive;
    }

    public Date getDateadoption() {
        return dateadoption;
    }

    public void setDateadoption(Date dateadoption) {
        this.dateadoption = dateadoption;
    }

    public Date getDateEntreeVigueur() {
        return dateEntreeVigueur;
    }

    public void setDateEntreeVigueur(Date dateEntreeVigueur) {
        this.dateEntreeVigueur = dateEntreeVigueur;
    }

    public String getLieuSignature() {
        return lieuSignature;
    }

    public void setLieuSignature(String lieuSignature) {
        this.lieuSignature = lieuSignature;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getMotscles() {
        return motscles;
    }

    public void setMotscles(String motscles) {
        this.motscles = motscles;
    }

    public String getMotsclesgeograph() {
        return motsclesgeograph;
    }

    public void setMotsclesgeograph(String motsclesgeograph) {
        this.motsclesgeograph = motsclesgeograph;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
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
    public List<AccordGestionfichiers> getAccordGestionfichiersList() {
        return accordGestionfichiersList;
    }

    public void setAccordGestionfichiersList(List<AccordGestionfichiers> accordGestionfichiersList) {
        this.accordGestionfichiersList = accordGestionfichiersList;
    }

    @XmlTransient
    public List<TypedocAccords> getTypedocAccordsList() {
        return typedocAccordsList;
    }

    public void setTypedocAccordsList(List<TypedocAccords> typedocAccordsList) {
        this.typedocAccordsList = typedocAccordsList;
    }

    @XmlTransient
    public List<EtataccordAccords> getEtataccordAccordsList() {
        return etataccordAccordsList;
    }

    public void setEtataccordAccordsList(List<EtataccordAccords> etataccordAccordsList) {
        this.etataccordAccordsList = etataccordAccordsList;
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
        if (!(object instanceof Accords)) {
            return false;
        }
        Accords other = (Accords) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kader.archive.entities.Accords[ id=" + id + " ]";
    }
    
}
