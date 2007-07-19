package net.mauhiz.rael;

import java.io.File;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

/**
 * Représente un album produit par un certain groupe en une certain année
 * 
 * @author abby
 */
public class Album implements Comparable<Album> {
    /**
     * Ensemble des commentaire sur cet album
     */
    private Set<Commentaire> commentaires;
    /**
     * Date de parution de l'album
     */
    private Calendar         dateParution;
    /**
     * Release par défaut affichée par RAEL, les autres release étant accessible en cliquant un peu
     */
    private Release          defaultRelease;
    /**
     * Jaquette par défaut de l'album, si il n'y en a pas d'autre spécifiée via freedb.
     */
    private File             jaquetteDefault;
    /**
     * Maison de disque ayant supervisee la production de l'album
     */
    private MaisonDeDisque   maisonDeDisque;
    /**
     * Différentes releases du meme album (pour les identifier via freedb par exemple)
     */
    private Set<Release>     releases = new TreeSet<Release>();
    /**
     * La review de cet album, si elle existe
     */
    private Review           review;
    /**
     * Titre de l'album
     */
    private String           titreAlbum;
    /**
     * Utilisateur ayant ajouté cet album à la base de données
     */
    private Utilisateur      userAjouteur;

    /**
     * Classement des albums par défaut selon leur date de parution.
     * 
     * @param o
     * @return ?
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(final Album o) {
        if (this.dateParution == o.dateParution) {
            return this.titreAlbum.compareTo(o.titreAlbum);
        }
        return this.dateParution.compareTo(o.dateParution);
    }
    
    /**
     * Nombre de commentaires contenus dans le Set
     * @return commentaires[].size
     */
    public int nombreCommentaires()
    {
        return this.commentaires.size();
    }
    
    /**
     * Moyenne des notes attribuées à cet album par les utilisateurs
     * @return note moyenne, sur 20
     */
    public float noteMoyenneAlbum()
    {
        float n = 0;
        for (Commentaire c : this.commentaires){
            n += c.getNote();
        }
        return n/this.nombreCommentaires();
    }

    public Release getDefaultRelease() {
        return defaultRelease;
    }

    public void setDefaultRelease(Release defaultRelease) {
        this.defaultRelease = defaultRelease;
    }

    public File getJaquetteDefault() {
        return jaquetteDefault;
    }

    public void setJaquetteDefault(File jaquetteDefault) {
        this.jaquetteDefault = jaquetteDefault;
    }

    public MaisonDeDisque getMaisonDeDisque() {
        return maisonDeDisque;
    }

    public void setMaisonDeDisque(MaisonDeDisque maisonDeDisque) {
        this.maisonDeDisque = maisonDeDisque;
    }

    public Set < Commentaire > getCommentaires() {
        return commentaires;
    }
}
