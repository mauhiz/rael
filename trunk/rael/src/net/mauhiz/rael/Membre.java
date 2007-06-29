package net.mauhiz.rael;
import java.util.Calendar;
import java.util.TreeSet;
public class Membre implements Comparable<Membre> {
    private boolean       actif;
    private Calendar      date_de_sortie;
    private Calendar      date_dentree;
    private Artiste       identite;
    /**
     * Quelles sont les différents instruments joués par ce membre dans ce groupe ?
     */
    private TreeSet<Role> roles;
    public Membre() {
        this.roles = new TreeSet<Role>();
    }
    /**
     * Classement des membre se base sur le classement des artistes eux meme
     */
    public int compareTo(final Membre other) {
        return this.identite.compareTo(other.identite);
    }
}
