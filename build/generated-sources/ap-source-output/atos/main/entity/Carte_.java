package atos.main.entity;

import atos.main.entity.Carte.TypeCarte;
import atos.main.entity.Joueur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-13T14:29:32")
@StaticMetamodel(Carte.class)
public class Carte_ { 

    public static volatile SingularAttribute<Carte, Joueur> joueur;
    public static volatile SingularAttribute<Carte, Long> id;
    public static volatile SingularAttribute<Carte, TypeCarte> type;

}