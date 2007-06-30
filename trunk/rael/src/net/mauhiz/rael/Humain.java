package net.mauhiz.rael;

import java.util.Calendar;

/**
 * Représente une personne réelle, qui a une identité propre
 * 
 * @author All Users
 */
public class Humain implements Comparable<Humain> {
    /**
     * Contient la biographie d'une personne, généralement d'un artiste
     */
    private String   bio;
    /**
     * Variable utile seulement pour les vieux artiste, et pas pour les membres, on l'espère
     */
    private Calendar dateDeces;
    /**
     * Contient la date de naissance de la personne
     */
    private Calendar dateNaissance;
    /**
     * Cette personne joue-t-elle de la musique ou non ?
     */
    private boolean  isArtist;
    /**
     * Contient le nom de famille de la personne
     */
    private String   nomDeFamille;
    /**
     * Contient le pays d'origine de la personne (pays de naissance)
     */
    private Pays     paysOrigine;
    /**
     * Contient le prenom de la personne
     */
    private String   prenom;

    /**
     * Simple Classement alphabétique, puis classement par date de naissance si 2 personnes s'appellent pareil
     */
    public int compareTo(final Humain o) {
        if (this.nomDeFamille != o.nomDeFamille) {
            return this.nomDeFamille.compareTo(o.nomDeFamille);
        } else if (this.prenom != o.prenom) {
            return this.prenom.compareTo(o.prenom);
        } else {
            return this.dateNaissance.compareTo(o.dateNaissance);
        }
    }
}
