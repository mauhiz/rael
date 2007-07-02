package net.mauhiz.rael;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author viper
 */
public class MaisonDeDisque {
    /**
     * Contient un histoire de la maison de disque (si un utilisateur veux bien se donner la peine de le remplir !!)
     */
    private String        histoire;
    /**
     * Nom abbrégé de la maison de disque (ex : "EMI"), affiché plus courrament dans les pages
     */
    private String        nomAbbrege;
    /**
     * Nom de la maison de disque (ex: "Electronic & Musical Industries")
     */
    private String        nomComplet;
    /**
     * Contient la liste des différents pays dans lesquels cette maison de disque opère
     */
    private Set<Pays> pays = new TreeSet<Pays>();
    /**
     * Site officiel de la maison de disque
     */
    private String        website;
}
