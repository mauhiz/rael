package net.mauhiz.rael;
/**
 * D�crit un m�tier possible pour un musicien (quel instrument, quel hauteur de voix, etc)
 * 
 * @author All Users
 */
public class Role implements Comparable<Role> {
    /**
     * 
     */
    private String metier;
    /**
     * @param other 
     * @return ?
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(final Role other) {
        // Simple classement par ordre alphab�tique
        return this.metier.compareTo(other.metier);
    }
}
