package com.kader.archive.entities;

import com.kader.archive.entities.AccordGestionfichiers;
import com.kader.archive.entities.EtataccordAccords;
import com.kader.archive.entities.SouscategorieAccords;
import com.kader.archive.entities.TypedocAccords;
import com.kader.archive.entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-22T22:27:51")
@StaticMetamodel(Accords.class)
public class Accords_ { 

    public static volatile SingularAttribute<Accords, String> resume;
    public static volatile SingularAttribute<Accords, String> note;
    public static volatile ListAttribute<Accords, AccordGestionfichiers> accordGestionfichiersList;
    public static volatile SingularAttribute<Accords, String> titre;
    public static volatile SingularAttribute<Accords, Date> dateEntreeVigueur;
    public static volatile SingularAttribute<Accords, String> motsclesgeograph;
    public static volatile SingularAttribute<Accords, Users> userId;
    public static volatile SingularAttribute<Accords, String> motscles;
    public static volatile SingularAttribute<Accords, Date> createdAt;
    public static volatile ListAttribute<Accords, TypedocAccords> typedocAccordsList;
    public static volatile SingularAttribute<Accords, String> cote;
    public static volatile SingularAttribute<Accords, String> lieuSignature;
    public static volatile SingularAttribute<Accords, Date> dateadoption;
    public static volatile ListAttribute<Accords, SouscategorieAccords> souscategorieAccordsList;
    public static volatile SingularAttribute<Accords, Integer> id;
    public static volatile SingularAttribute<Accords, Integer> nboitearchive;
    public static volatile ListAttribute<Accords, EtataccordAccords> etataccordAccordsList;
    public static volatile SingularAttribute<Accords, Date> updatedAt;

}