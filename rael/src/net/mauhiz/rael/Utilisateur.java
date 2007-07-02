package net.mauhiz.rael;

import java.io.File;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Représente un utilisateur inscrit sur RAEL
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
     * Date à laquelle s'est inscrit l'utilisateur
     */
    private Calendar dateInscription;
    /**
     * Dernière date a laquelle l'utilisateur a contacté le site
     */
    private Calendar dateLastConnexion;
    /**
     * Adresse email que l'utilisateur nous a fourni
     */
    private String   email;
    /**
     * Mot de passe de l'utilisateur, encrypté
     */
    private String   passwordEncrypte;
    /**
     * Pseudo (login) choisi par l'utilisateur
     */
    private String   pseudo;
    /**
     * Question secrète choisie par l'utilisateur lors de son inscription
     */
    private String   questionSecrete;
    /**
     * Réponse à la question secrète choisie par l'utilisateur lors de sont inscription, lui permettant de récupérer son
     * compte s'il a oublié le mot de passe
     */
    private String   reponseSecrete;
    /**
     * Site personnel de l'utilisateur, s'il veut le partager avec nous
     */
    private String   website;

    /**
     * Vérifie que l'utilisateur a des informations correcte (forme de l'adresse email, etc)
     * 
     * @return erreurs détectées par la fonction, sous la sort d'un Set
     */
    public TreeSet<UsersError> checkProfileForErrors() {
        Set<UsersError> erreurs = new TreeSet<UsersError>();
        // Test concernant l'adresse email
        if (this.email.length() == 0) {
            erreurs.add(UsersError.REG_ADRESSE_EMAIL_VIDE);
        } else if (!emailCorrect()) {
            erreurs.add(UsersError.REG_ADRESSE_EMAIL_INCORRECTE);
        }
        // Test concernant le pseudo
        if (this.email.length() == 0) {
            erreurs.add(UsersError.REG_LOGIN_VIDE);
        } else if (!pseudoCorrect()) {
        }
        // TODO: regarder si ce pseudo n'existe pas déjà dans la base sql
        if (true) {
            erreurs.add(UsersError.REG_LOGIN_ALREADY_EXIST);
        }
        return (TreeSet<UsersError>) erreurs;
    }

    /**
     * Vérifie que l'adresse email a bien la forme d'une adresse email
     * 
     * @return false si elle est malformée, true sinon
     */
    public boolean emailCorrect() {
        // TODO: Vérifier que le regex fonctionne. Peut etre utiliser un regex juste pour ca est un peu trop bourrin
        // INFO: inspiré de http://www.sitepoint.com/article/java-regex-api-explained
        // Compile the regex.
        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
        Pattern pattern = Pattern.compile(regex);
        // Get a Matcher based on the target string.
        Matcher matcher = pattern.matcher(this.email);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    /**
     * Génère un nouveau mot de passe aléatoire, lors de d'inscription et lors de "retry a lost account"
     */
    public String generatePassword() {
        String pw = new String();
        int i = 0;
        while (i++ < 8) {
            // pw +=
        }
        return pw;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    /**
     * Vérifie que la forme du pseudo est acceptable
     */
    public boolean pseudoCorrect() {
        // TODO: définir quels genres de pseudo on accepte
        return true;
    }

    /**
     * Inscrit l'utilisateur dans la base de registre, après
     */
    public void register() {
        this.dateInscription = Calendar.getInstance();
        // TODO : requete sql
    }
}
