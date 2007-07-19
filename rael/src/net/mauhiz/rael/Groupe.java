package net.mauhiz.rael;

import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author viper
 */
public class Groupe {
    /**
     * Contient la biographie du groupe
     */
    private String      bio;
    /**
     * Date � laquelle le groupe a �t� cr��
     */
    private Calendar    dateFormation;
    /**
     * Contient tous les Albums produits par le groupe (un single est consid�r� comme un album)
     */
    private Set<Album>  discographie = new TreeSet<Album>();
    /**
     * Contient tous les membres qui appartiennent ou ont appartenu au groupe
     */
    private Set<Membre> membres      = new TreeSet<Membre>();
    /**
     * L'utilisateur ayant ajout� ce groupe en premier
     */
    private Utilisateur ajouteur;
    /**
     * Adresse du site officiel du groupe
     */
    private String      website;

    /**
     * Calcule la note moyenne d'un groupe, a partir des notes brutes, prises ind�pendamment de chaque album (Plus �quitable car 1 seul vote ne fait pas beaucoup changer la moyenne)
     * @return moyenne du groupe
     */
    public float noteMoyenneGroupeRepartie()
    {
        float total=0;
        float n=0;
        for(Album a : this.discographie)
        {
            for(Commentaire c : a.getCommentaires())
            {
                total += c.getNote();
            }
            n+=a.nombreCommentaires();
        }
        if(n==0) return Float.NaN;
        return total/n;
        // TODO: id�e g�niale, classer dans chaque page de Groupe, les albums sur une �chelle (album qui sux <----< album qui rox), en faisant en sorte que la mise en page positionne les albums selon leur moyenne
        
    }
    
    /**
     * 
     */
    public Groupe() {
        // TODO
    }
}
