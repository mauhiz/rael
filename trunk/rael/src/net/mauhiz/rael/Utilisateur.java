package net.mauhiz.rael;

import java.io.File;
import java.util.Calendar;

/**
 * Repr�sente un utilisateur inscrit sur RAEL
 * 
 * @author All Users
 */
public class Utilisateur extends Humain {
    /**
     * Adresse MSN de l'utilisateur
     */
    private String   adresseMSN;
    // TODO : Level administrateur
    /**
     * Contient le chemin vers l'image (avatar) de l'utilisateur
     */
    private File     avatar;
    /**
     * Date � laquelle s'est inscrit l'utilisateur
     */
    private Calendar dateInscription;
    /**
     * Derni�re date a laquelle l'utilisateur a contact� le site
     */
    private Calendar dateLastConnexion;
    /**
     * Adresse email que l'utilisateur nous a fourni
     */
    private String   email;
    /**
     * Mot de passe de l'utilisateur, encrypt�
     */
    private String   passwordEncrypte;
    /**
     * Pseudo (login) choisi par l'utilisateur
     */
    private String   pseudo;
    /**
     * Question secr�te choisie par l'utilisateur lors de son inscription
     */
    private String   questionSecrete;
    /**
     * R�ponse � la question secr�te choisie par l'utilisateur lors de sont inscription, lui permettant de r�cup�rer son
     * compte s'il a oubli� le mot de passe
     */
    private String   reponseSecrete;
    /**
     * Site personnel de l'utilisateur, s'il veut le partager avec nous
     */
    private String   website;
}
