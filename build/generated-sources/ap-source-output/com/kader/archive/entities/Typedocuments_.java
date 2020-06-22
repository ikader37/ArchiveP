package com.kader.archive.entities;

import com.kader.archive.entities.TypedocAccords;
import com.kader.archive.entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:50")
@StaticMetamodel(Typedocuments.class)
public class Typedocuments_ { 

    public static volatile SingularAttribute<Typedocuments, Date> createdAt;
    public static volatile ListAttribute<Typedocuments, TypedocAccords> typedocAccordsList;
    public static volatile SingularAttribute<Typedocuments, Integer> id;
    public static volatile SingularAttribute<Typedocuments, String> nom;
    public static volatile SingularAttribute<Typedocuments, Users> userId;
    public static volatile SingularAttribute<Typedocuments, Date> updatedAt;

}