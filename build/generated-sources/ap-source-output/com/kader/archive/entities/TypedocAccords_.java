package com.kader.archive.entities;

import com.kader.archive.entities.Accords;
import com.kader.archive.entities.Typedocuments;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(TypedocAccords.class)
public class TypedocAccords_ { 

    public static volatile SingularAttribute<TypedocAccords, Date> createdAt;
    public static volatile SingularAttribute<TypedocAccords, Accords> accordId;
    public static volatile SingularAttribute<TypedocAccords, Integer> id;
    public static volatile SingularAttribute<TypedocAccords, Typedocuments> typedocumentId;
    public static volatile SingularAttribute<TypedocAccords, Date> updatedAt;

}