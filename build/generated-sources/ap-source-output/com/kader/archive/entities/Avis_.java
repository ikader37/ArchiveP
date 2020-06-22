package com.kader.archive.entities;

import com.kader.archive.entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(Avis.class)
public class Avis_ { 

    public static volatile SingularAttribute<Avis, Date> createdAt;
    public static volatile SingularAttribute<Avis, String> avis;
    public static volatile SingularAttribute<Avis, Integer> id;
    public static volatile SingularAttribute<Avis, Users> userId;
    public static volatile SingularAttribute<Avis, Date> updatedAt;

}