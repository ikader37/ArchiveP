package com.kader.archive.entities;

import com.kader.archive.entities.SouscategorieAccords;
import com.kader.archive.entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(Souscategories.class)
public class Souscategories_ { 

    public static volatile SingularAttribute<Souscategories, Date> createdAt;
    public static volatile ListAttribute<Souscategories, SouscategorieAccords> souscategorieAccordsList;
    public static volatile SingularAttribute<Souscategories, Integer> id;
    public static volatile SingularAttribute<Souscategories, String> nom;
    public static volatile SingularAttribute<Souscategories, Users> userId;
    public static volatile SingularAttribute<Souscategories, Date> updatedAt;

}