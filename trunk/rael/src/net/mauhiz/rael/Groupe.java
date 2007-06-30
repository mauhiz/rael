package net.mauhiz.rael;

import java.util.Calendar;
import java.util.TreeSet;

public class Groupe {
    private Biographie      bio;
    private Calendar        date_de_formation;
    /**
     * Contient tous les Albums produits par le groupe (un single est considéré comme un album)
     */
    private TreeSet<Album>  discographie;
    /**
     * Contient tous les membres qui appartiennent ou ont appartenu au groupe
     */
    private TreeSet<Membre> membres;

    public Groupe() {
    }
}
