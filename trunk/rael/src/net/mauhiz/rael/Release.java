package net.mauhiz.rael;

public class Release implements Comparable<Release> {
    private String disc_id;

    public int compareTo(final Release o) {
        return this.disc_id.compareTo(o.disc_id);
    }
}
