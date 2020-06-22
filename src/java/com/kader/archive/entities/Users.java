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
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findById", query = "SELECT u FROM Users u WHERE u.id = :id")
    , @NamedQuery(name = "Users.findByName", query = "SELECT u FROM Users u WHERE u.name = :name")
    , @NamedQuery(name = "Users.findByNomComplet", query = "SELECT u FROM Users u WHERE u.nomComplet = :nomComplet")
    , @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email = :email")
    , @NamedQuery(name = "Users.findByContact", query = "SELECT u FROM Users u WHERE u.contact = :contact")
    , @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password")
    , @NamedQuery(name = "Users.findByRememberToken", query = "SELECT u FROM Users u WHERE u.rememberToken = :rememberToken")
    , @NamedQuery(name = "Users.findByCreatedAt", query = "SELECT u FROM Users u WHERE u.createdAt = :createdAt")
    , @NamedQuery(name = "Users.findByUpdatedAt", query = "SELECT u FROM Users u WHERE u.updatedAt = :updatedAt")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "name_")
    private String name;
    @Size(max = 255)
    @Column(name = "nom_complet")
    private String nomComplet;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Size(max = 255)
    @Column(name = "contact")
    private String contact;
    @Size(max = 255)
    @Column(name = "password_")
    private String password;
    @Size(max = 100)
    @Column(name = "remember_token")
    private String rememberToken;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Accords> accordsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Typedocuments> typedocumentsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Roles> rolesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Langues> languesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Avis> avisList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Souscategories> souscategoriesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Etataccords> etataccordsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Gestionfichiers> gestionfichiersList;

    public Users() {
    }

    public Users(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
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
    public List<Accords> getAccordsList() {
        return accordsList;
    }

    public void setAccordsList(List<Accords> accordsList) {
        this.accordsList = accordsList;
    }

    @XmlTransient
    public List<Typedocuments> getTypedocumentsList() {
        return typedocumentsList;
    }

    public void setTypedocumentsList(List<Typedocuments> typedocumentsList) {
        this.typedocumentsList = typedocumentsList;
    }

    @XmlTransient
    public List<Roles> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<Roles> rolesList) {
        this.rolesList = rolesList;
    }

    @XmlTransient
    public List<Langues> getLanguesList() {
        return languesList;
    }

    public void setLanguesList(List<Langues> languesList) {
        this.languesList = languesList;
    }

    @XmlTransient
    public List<Avis> getAvisList() {
        return avisList;
    }

    public void setAvisList(List<Avis> avisList) {
        this.avisList = avisList;
    }

    @XmlTransient
    public List<Souscategories> getSouscategoriesList() {
        return souscategoriesList;
    }

    public void setSouscategoriesList(List<Souscategories> souscategoriesList) {
        this.souscategoriesList = souscategoriesList;
    }

    @XmlTransient
    public List<Etataccords> getEtataccordsList() {
        return etataccordsList;
    }

    public void setEtataccordsList(List<Etataccords> etataccordsList) {
        this.etataccordsList = etataccordsList;
    }

    @XmlTransient
    public List<Gestionfichiers> getGestionfichiersList() {
        return gestionfichiersList;
    }

    public void setGestionfichiersList(List<Gestionfichiers> gestionfichiersList) {
        this.gestionfichiersList = gestionfichiersList;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kader.archive.entities.Users[ id=" + id + " ]";
    }
    
}
