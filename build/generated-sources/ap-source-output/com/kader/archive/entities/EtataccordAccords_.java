package com.kader.archive.entities;

import com.kader.archive.entities.Accords;
import com.kader.archive.entities.Etataccords;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(EtataccordAccords.class)
public class EtataccordAccords_ { 

    public static volatile SingularAttribute<EtataccordAccords, Date> createdAt;
    public static volatile SingularAttribute<EtataccordAccords, Etataccords> etataccordId;
    public static volatile SingularAttribute<EtataccordAccords, Accords> accordId;
    public static volatile SingularAttribute<EtataccordAccords, Integer> id;
    public static volatile SingularAttribute<EtataccordAccords, Date> updatedAt;

}