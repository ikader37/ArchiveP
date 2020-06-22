package com.kader.archive.entities;

import com.kader.archive.entities.AccordGestionfichiers;
import com.kader.archive.entities.LangueGestionfichiers;
import com.kader.archive.entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(Gestionfichiers.class)
public class Gestionfichiers_ { 

    public static volatile ListAttribute<Gestionfichiers, LangueGestionfichiers> langueGestionfichiersList;
    public static volatile SingularAttribute<Gestionfichiers, Date> createdAt;
    public static volatile SingularAttribute<Gestionfichiers, String> fichier;
    public static volatile ListAttribute<Gestionfichiers, AccordGestionfichiers> accordGestionfichiersList;
    public static volatile SingularAttribute<Gestionfichiers, String> nomfichier;
    public static volatile SingularAttribute<Gestionfichiers, Integer> id;
    public static volatile SingularAttribute<Gestionfichiers, Users> userId;
    public static volatile SingularAttribute<Gestionfichiers, Date> updatedAt;

}