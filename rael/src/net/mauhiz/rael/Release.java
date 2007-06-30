package net.mauhiz.rael;

public class Release implements Comparable<Release> {
    /**
     * ID a priori unique du disque (les id de freedb ne sont pas vraiment uniques, il faut en choisir d'autres).
     */
    private String discId;

    /**
     * Remplace la comparaison de base des albums
     * 
     * @param o
     * @return
     */
    public int compareTo(final Release o) {
        return this.discId.compareTo(o.discId);
    }
}
