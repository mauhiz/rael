package net.mauhiz.rael;
public class Artiste implements Comparable<Artiste> {
    private Biographie bio;
    private String     nom;
    private Pays       pays_dorigine;
    /**
     * Simple Classement alphabétique
     */
    public int compareTo(final Artiste o) {
        return this.nom.compareTo(o.nom);
    }
}
