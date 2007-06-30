package net.mauhiz.rael;

import java.io.File;

/**
 * Représente une piste d'un album donné
 * 
 * @author All Users
 */
public class Track extends Chanson {
    /**
     * Duree de la chanson
     */
    private int  duree;
    /**
     * Lien vers un extrait de musique
     */
    private File extraitMusique;
    /**
     * Numéro de piste
     */
    private int  numTrack;
}
