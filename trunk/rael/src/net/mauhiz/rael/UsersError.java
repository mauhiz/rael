package net.mauhiz.rael;

/**
 * Différentes erreurs pouvant être générée par l'utilisateur (meme si il est pas débile) Les erreurs débutant par Reg
 * Les erreurs débutant par REG sont liées à l'inscription, celle par LOG au login.
 * 
 * @author All Users
 */
public enum UsersError {
    /**
     * Adresse email n'est pas de la forme xxx@xxx.xxx
     */
    REG_ADRESSE_EMAIL_INCORRECTE,
    /**
     * Le champ adresse email n'a pas été renseigné
     */
    REG_ADRESSE_EMAIL_VIDE,
    /**
     * Un utilisateur avec le meme login est déjà inscrit sur rael
     */
    REG_LOGIN_ALREADY_EXIST,
    /**
     * Le login choisi contient des espaces ou des caractères spéciaux
     */
    REG_LOGIN_INCORRECT,
    /**
     * Le champ login n'a pas été renseigné
     */
    REG_LOGIN_VIDE;
}
