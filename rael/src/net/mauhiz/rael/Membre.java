package net.mauhiz.rael;

import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

/**
 * Représente un artiste par rapport à un groupe donné
 * 
 * @author All Users
 */
public class Membre extends Humain {
    /**
     * Le membre joue-t-il encore dans ce groupe ?
     */
    private boolean   actif;
    /**
     * Date d'entrée de cet artiste dans le groupe
     */
    private Calendar  dateArrive;
    /**
     * Date ou l'artiste a quitté le groupe, si il l'a quitté
     */
    private Calendar  dateLeft;
    /**
     * Quelles sont les différents instruments joués par ce membre dans ce groupe ?
     */
    private Set<Role> roles = new TreeSet<Role>();
}
