package com.kader.archive.entities;

import com.kader.archive.entities.Accords;
import com.kader.archive.entities.Avis;
import com.kader.archive.entities.Etataccords;
import com.kader.archive.entities.Gestionfichiers;
import com.kader.archive.entities.Langues;
import com.kader.archive.entities.Roles;
import com.kader.archive.entities.Souscategories;
import com.kader.archive.entities.Typedocuments;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile ListAttribute<Users, Langues> languesList;
    public static volatile ListAttribute<Users, Avis> avisList;
    public static volatile ListAttribute<Users, Typedocuments> typedocumentsList;
    public static volatile ListAttribute<Users, Etataccords> etataccordsList;
    public static volatile SingularAttribute<Users, Date> createdAt;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile ListAttribute<Users, Roles> rolesList;
    public static volatile SingularAttribute<Users, String> contact;
    public static volatile SingularAttribute<Users, String> name;
    public static volatile ListAttribute<Users, Souscategories> souscategoriesList;
    public static volatile SingularAttribute<Users, String> nomComplet;
    public static volatile ListAttribute<Users, Accords> accordsList;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile SingularAttribute<Users, String> rememberToken;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, Date> updatedAt;
    public static volatile ListAttribute<Users, Gestionfichiers> gestionfichiersList;

}