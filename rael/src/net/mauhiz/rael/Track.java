package net.mauhiz.rael;

import java.io.File;

/**
 * Repr�sente une piste d'un album donn�
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
     * Num�ro de piste
     */
    private int  numTrack;
}
