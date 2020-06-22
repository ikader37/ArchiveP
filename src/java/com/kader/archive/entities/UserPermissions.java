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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "user_permissions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserPermissions.findAll", query = "SELECT u FROM UserPermissions u")
    , @NamedQuery(name = "UserPermissions.findById", query = "SELECT u FROM UserPermissions u WHERE u.id = :id")
    , @NamedQuery(name = "UserPermissions.findByUserId", query = "SELECT u FROM UserPermissions u WHERE u.userId = :userId")
    , @NamedQuery(name = "UserPermissions.findByPermissionId", query = "SELECT u FROM UserPermissions u WHERE u.permissionId = :permissionId")
    , @NamedQuery(name = "UserPermissions.findByCreatedAt", query = "SELECT u FROM UserPermissions u WHERE u.createdAt = :createdAt")
    , @NamedQuery(name = "UserPermissions.findByUpdatedAt", query = "SELECT u FROM UserPermissions u WHERE u.updatedAt = :updatedAt")})
public class UserPermissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "permission_id")
    private int permissionId;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    public UserPermissions() {
    }

    public UserPermissions(Integer id) {
        this.id = id;
    }

    public UserPermissions(Integer id, int userId, int permissionId) {
        this.id = id;
        this.userId = userId;
        this.permissionId = permissionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserPermissions)) {
            return false;
        }
        UserPermissions other = (UserPermissions) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kader.archive.entities.UserPermissions[ id=" + id + " ]";
    }
    
}
