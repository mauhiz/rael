package net.mauhiz.rael;

import java.io.File;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

/**
 * Représente un album produit par un certain groupe en une certain année
 * 
 * @author abby
 */
public class Album implements Comparable<Album> {
    /**
     * Date de parution de l'album
     */
    private Calendar       dateParution;
    /**
     * Release par défaut affichée par RAEL, les autres release étant accessible en cliquant un peu
     */
    private Release        defaultRelease;
    /**
     * Jaquette par défaut de l'album, si il n'y en a pas d'autre spécifiée via freedb.
     */
    private File           jaquetteDefault;
    /**
     * Maison de disque ayant supervisee la production de l'album
     */
    private MaisonDeDisque maisonDeDisque;
    /**
     * Différentes releases du meme album (pour les identifier via freedb par exemple)
     */
    private Set<Release>   releases = new TreeSet<Release>();
    /**
     * La review de cet album, si elle existe
     */
    private Review         review;
    /**
     * Titre de l'album
     */
    private String         titreAlbum;
    /**
     * Utilisateur ayant ajouté cet album à la base de données
     */
    private Utilisateur    userAjouteur;

    /**
     * Classement des albums par défaut selon leur date de parution.
     * @param o 
     * @return ?
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(final Album o) {
        if (this.dateParution == o.dateParution) {
            return this.titreAlbum.compareTo(o.titreAlbum);
        }
        return this.dateParution.compareTo(o.dateParution);
    }
}
