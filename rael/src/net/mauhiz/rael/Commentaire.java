package net.mauhiz.rael;

import java.util.Calendar;

/**
 * @author viper
 */
public class Commentaire implements Comparable<Commentaire> {
    /**
     * Album concerné par le commentaire
     */
    private Album       album;
    /**
     * Auteur du commentaire
     */
    private Utilisateur auteur;
    /**
     * Contenu du commentaire
     */
    private String      contenu;
    /**
     * Date à laquelle ce commentaire a été modifié pour la dernière fois
     */
    private Calendar    dateDeDerniereModif;
    /**
     * Date à laquelle le commentaire a été envoyé
     */
    private Calendar    dateEnvoi;
    /**
     * Note associée au commentaire
     */
    private float       note;

    public int compareTo(final Commentaire o) {
        // Chaque utilisateur n'a le droit qu'à un seul commentaire
        // Le classement suviant est donc acceptable
        if (this.dateEnvoi != o.dateEnvoi) {
            return this.dateEnvoi.compareTo(o.dateEnvoi);
        } else {
            return this.auteur.getPseudo().compareTo(o.auteur.getPseudo());
        }
    }
}
