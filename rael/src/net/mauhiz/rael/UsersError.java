package net.mauhiz.rael;

/**
 * Diff�rentes erreurs pouvant �tre g�n�r�e par l'utilisateur (meme si il est pas d�bile) Les erreurs d�butant par Reg
 * Les erreurs d�butant par REG sont li�es � l'inscription, celle par LOG au login.
 * 
 * @author All Users
 */
public enum UsersError {
    /**
     * Adresse email n'est pas de la forme xxx@xxx.xxx
     */
    REG_ADRESSE_EMAIL_INCORRECTE("Votre adresse e-mail est incorrecte"),
    /**
     * Le champ adresse email n'a pas �t� renseign�
     */
    REG_ADRESSE_EMAIL_VIDE("votre adresse e-mail est vide"),
    /**
     * Un utilisateur avec le meme login est d�j� inscrit sur rael
     */
    REG_LOGIN_ALREADY_EXIST("Ce nom d'utilisateur est d�j� pris"),
    /**
     * Le login choisi contient des espaces ou des caract�res sp�ciaux
     */
    REG_LOGIN_INCORRECT("Ce nom d'utilisateur est incorrect"),
    /**
     * Le champ login n'a pas �t� renseign�
     */
    REG_LOGIN_VIDE("Ce login est vide");
    /**
     * 
     */
    private String fr;

    /**
     * @param fr1
     */
    private UsersError(String fr1) {
        this.fr = fr1;
    }

    /**
     * @return {@link #fr}.
     */
    public String getFr() {
        return this.fr;
    }
}
