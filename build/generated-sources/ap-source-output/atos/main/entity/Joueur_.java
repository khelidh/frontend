package atos.main.entity;

import atos.main.entity.Carte;
import atos.main.entity.Joueur.EtatJoueur;
import atos.main.entity.Partie;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-13T14:29:32")
@StaticMetamodel(Joueur.class)
public class Joueur_ { 

    public static volatile ListAttribute<Joueur, Carte> cartes;
    public static volatile SingularAttribute<Joueur, Partie> partie;
    public static volatile SingularAttribute<Joueur, String> pass;
    public static volatile SingularAttribute<Joueur, Long> partiesJouees;
    public static volatile SingularAttribute<Joueur, Long> id;
    public static volatile SingularAttribute<Joueur, Long> position;
    public static volatile SingularAttribute<Joueur, String> avatar;
    public static volatile SingularAttribute<Joueur, EtatJoueur> etat;
    public static volatile SingularAttribute<Joueur, String> pseudo;
    public static volatile SingularAttribute<Joueur, Long> partiesGagnees;

}