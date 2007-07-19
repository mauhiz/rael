package net.mauhiz.rael;

import java.io.File;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

/**
 * Repr�sente un album produit par un certain groupe en une certain ann�e
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
     * Release par d�faut affich�e par RAEL, les autres release �tant accessible en cliquant un peu
     */
    private Release          defaultRelease;
    /**
     * Jaquette par d�faut de l'album, si il n'y en a pas d'autre sp�cifi�e via freedb.
     */
    private File             jaquetteDefault;
    /**
     * Maison de disque ayant supervisee la production de l'album
     */
    private MaisonDeDisque   maisonDeDisque;
    /**
     * Diff�rentes releases du meme album (pour les identifier via freedb par exemple)
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
     * Utilisateur ayant ajout� cet album � la base de donn�es
     */
    private Utilisateur      userAjouteur;

    /**
     * Classement des albums par d�faut selon leur date de parution.
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
     * Moyenne des notes attribu�es � cet album par les utilisateurs
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
