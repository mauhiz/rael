package net.mauhiz.rael;

import java.util.Calendar;

/**
 * @author viper
 */
public class Commentaire implements Comparable<Commentaire> {
    /**
     * Album concern� par le commentaire
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
     * Date � laquelle ce commentaire a �t� modifi� pour la derni�re fois
     */
    private Calendar    dateDeDerniereModif;
    /**
     * Date � laquelle le commentaire a �t� envoy�
     */
    private Calendar    dateEnvoi;
    /**
     * Note associ�e au commentaire
     */
    private float       note;

    public int compareTo(final Commentaire o) {
        // Chaque utilisateur n'a le droit qu'� un seul commentaire
        // Le classement suviant est donc acceptable
        if (this.dateEnvoi != o.dateEnvoi) {
            return this.dateEnvoi.compareTo(o.dateEnvoi);
        } else {
            return this.auteur.getPseudo().compareTo(o.auteur.getPseudo());
        }
    }
}
