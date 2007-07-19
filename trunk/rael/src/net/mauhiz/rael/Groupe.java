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
     * Date à laquelle le groupe a été créé
     */
    private Calendar    dateFormation;
    /**
     * Contient tous les Albums produits par le groupe (un single est considéré comme un album)
     */
    private Set<Album>  discographie = new TreeSet<Album>();
    /**
     * Contient tous les membres qui appartiennent ou ont appartenu au groupe
     */
    private Set<Membre> membres      = new TreeSet<Membre>();
    /**
     * L'utilisateur ayant ajouté ce groupe en premier
     */
    private Utilisateur ajouteur;
    /**
     * Adresse du site officiel du groupe
     */
    private String      website;

    /**
     * Calcule la note moyenne d'un groupe, a partir des notes brutes, prises indépendamment de chaque album (Plus équitable car 1 seul vote ne fait pas beaucoup changer la moyenne)
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
        // TODO: idée géniale, classer dans chaque page de Groupe, les albums sur une échelle (album qui sux <----< album qui rox), en faisant en sorte que la mise en page positionne les albums selon leur moyenne
        
    }
    
    /**
     * 
     */
    public Groupe() {
        // TODO
    }
}
