package net.mauhiz.rael;

import java.util.Calendar;
import java.util.TreeSet;

public class Membre extends Artiste {
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
}
