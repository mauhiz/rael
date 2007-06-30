package net.mauhiz.rael;
/**
 * Décrit un métier possible pour un musicien (quel instrument, quel hauteur de voix, etc)
 * 
 * @author All Users
 */
public class Role implements Comparable<Role> {
    private String metier;
    public int compareTo(final Role other) {
        // Simple classement par ordre alphabétique
        return this.metier.compareTo(other.metier);
    }
}
