package com.kader.archive.entities;

import com.kader.archive.entities.EtataccordAccords;
import com.kader.archive.entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:50")
@StaticMetamodel(Etataccords.class)
public class Etataccords_ { 

    public static volatile SingularAttribute<Etataccords, Date> createdAt;
    public static volatile SingularAttribute<Etataccords, Integer> id;
    public static volatile ListAttribute<Etataccords, EtataccordAccords> etataccordAccordsList;
    public static volatile SingularAttribute<Etataccords, String> nom;
    public static volatile SingularAttribute<Etataccords, Users> userId;
    public static volatile SingularAttribute<Etataccords, Date> updatedAt;

}