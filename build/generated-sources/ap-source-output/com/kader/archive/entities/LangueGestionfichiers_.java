package com.kader.archive.entities;

import com.kader.archive.entities.Gestionfichiers;
import com.kader.archive.entities.Langues;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(LangueGestionfichiers.class)
public class LangueGestionfichiers_ { 

    public static volatile SingularAttribute<LangueGestionfichiers, Date> createdAt;
    public static volatile SingularAttribute<LangueGestionfichiers, Integer> id;
    public static volatile SingularAttribute<LangueGestionfichiers, Langues> langueId;
    public static volatile SingularAttribute<LangueGestionfichiers, Gestionfichiers> gestionfichierId;
    public static volatile SingularAttribute<LangueGestionfichiers, Date> updatedAt;

}