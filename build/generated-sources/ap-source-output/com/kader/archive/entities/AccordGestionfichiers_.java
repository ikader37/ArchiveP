package com.kader.archive.entities;

import com.kader.archive.entities.Accords;
import com.kader.archive.entities.Gestionfichiers;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(AccordGestionfichiers.class)
public class AccordGestionfichiers_ { 

    public static volatile SingularAttribute<AccordGestionfichiers, Date> createdAt;
    public static volatile SingularAttribute<AccordGestionfichiers, Accords> accordId;
    public static volatile SingularAttribute<AccordGestionfichiers, Integer> id;
    public static volatile SingularAttribute<AccordGestionfichiers, Gestionfichiers> gestionfichierId;
    public static volatile SingularAttribute<AccordGestionfichiers, Date> updatedAt;

}