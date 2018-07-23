package atos.main.entity;

import atos.main.entity.Joueur;
import atos.main.entity.Partie.EtatPartie;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-23T10:26:35")
@StaticMetamodel(Partie.class)
public class Partie_ { 

    public static volatile SingularAttribute<Partie, Long> id;
    public static volatile SingularAttribute<Partie, String> nom;
    public static volatile SingularAttribute<Partie, EtatPartie> etat;
    public static volatile ListAttribute<Partie, Joueur> joueurs;

}