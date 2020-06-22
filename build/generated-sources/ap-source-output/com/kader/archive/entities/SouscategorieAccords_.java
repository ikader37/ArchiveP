package com.kader.archive.entities;

import com.kader.archive.entities.Accords;
import com.kader.archive.entities.Souscategories;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(SouscategorieAccords.class)
public class SouscategorieAccords_ { 

    public static volatile SingularAttribute<SouscategorieAccords, Date> createdAt;
    public static volatile SingularAttribute<SouscategorieAccords, Souscategories> souscategorieId;
    public static volatile SingularAttribute<SouscategorieAccords, Accords> accordId;
    public static volatile SingularAttribute<SouscategorieAccords, Integer> id;
    public static volatile SingularAttribute<SouscategorieAccords, Date> updatedAt;

}