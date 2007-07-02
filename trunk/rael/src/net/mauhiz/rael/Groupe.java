package net.mauhiz.rael;

import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author viper
 */
public class Groupe {
    /**
     * Contient la biographie du groupe
     */
    private String      bio;
    /**
     * Date � laquelle le groupe a �t� cr��
     */
    private Calendar    dateFormation;
    /**
     * Contient tous les Albums produits par le groupe (un single est consid�r� comme un album)
     */
    private Set<Album>  discographie = new TreeSet<Album>();
    /**
     * Contient tous les membres qui appartiennent ou ont appartenu au groupe
     */
    private Set<Membre> membres      = new TreeSet<Membre>();
    /**
     * L'utilisateur ayant ajout� ce groupe en premier
     */
    private Utilisateur ajouteur;
    /**
     * Adresse du site officiel du groupe
     */
    private String      website;

    /**
     * 
     */
    public Groupe() {
        // TODO
    }
}
