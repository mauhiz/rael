package net.mauhiz.rael;

import java.io.File;
import java.util.Calendar;
import java.util.TreeSet;

public class Album implements Comparable<Album> {
    private Calendar         date_de_parution;
    /**
     * Jaquette par défaut de l'album, si il n'y en a pas d'autre spécifiée via freedb.
     */
    private File             default_jaquette;
    private TreeSet<Release> releases;
    private Review           review;
    private String           titre_album;

    /**
     * Classement des albums par défaut selon leur date de parution.
     */
    public int compareTo(final Album o) {
        return this.date_de_parution.compareTo(o.date_de_parution);
    }
}
