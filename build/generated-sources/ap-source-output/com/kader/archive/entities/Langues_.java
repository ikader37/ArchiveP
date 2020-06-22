package com.kader.archive.entities;

import com.kader.archive.entities.LangueGestionfichiers;
import com.kader.archive.entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(Langues.class)
public class Langues_ { 

    public static volatile ListAttribute<Langues, LangueGestionfichiers> langueGestionfichiersList;
    public static volatile SingularAttribute<Langues, Date> createdAt;
    public static volatile SingularAttribute<Langues, String> code;
    public static volatile SingularAttribute<Langues, Integer> id;
    public static volatile SingularAttribute<Langues, String> nom;
    public static volatile SingularAttribute<Langues, Users> userId;
    public static volatile SingularAttribute<Langues, Date> updatedAt;

}