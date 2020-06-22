package com.kader.archive.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(Permissions.class)
public class Permissions_ { 

    public static volatile SingularAttribute<Permissions, Date> createdAt;
    public static volatile SingularAttribute<Permissions, Integer> id;
    public static volatile SingularAttribute<Permissions, String> nom;
    public static volatile SingularAttribute<Permissions, Integer> userId;
    public static volatile SingularAttribute<Permissions, Date> updatedAt;

}