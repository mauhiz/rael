package net.mauhiz.rael;

import java.util.Calendar;
import java.util.TreeSet;

public class Groupe {
    /**
     * Contient la biographie du groupe
     */
    private String          bio;
    /**
     * Date à laquelle le groupe a été créé
     */
    private Calendar        dateFormation;
    /**
     * Contient tous les Albums produits par le groupe (un single est considéré comme un album)
     */
    private TreeSet<Album>  discographie;
    /**
     * Contient tous les membres qui appartiennent ou ont appartenu au groupe
     */
    private TreeSet<Membre> membres;
    /**
     * L'utilisateur ayant ajouté ce groupe en premier
     */
    private Utilisateur     utilisateurAjoutteur;
    /**
     * Adresse du site officiel du groupe
     */
    private String          website;

    public Groupe() {
    }
}
