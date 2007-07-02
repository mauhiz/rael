package net.mauhiz.rael;

import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

/**
 * Repr�sente un artiste par rapport � un groupe donn�
 * 
 * @author All Users
 */
public class Membre extends Humain {
    /**
     * Le membre joue-t-il encore dans ce groupe ?
     */
    private boolean   actif;
    /**
     * Date d'entr�e de cet artiste dans le groupe
     */
    private Calendar  dateArrive;
    /**
     * Date ou l'artiste a quitt� le groupe, si il l'a quitt�
     */
    private Calendar  dateLeft;
    /**
     * Quelles sont les diff�rents instruments jou�s par ce membre dans ce groupe ?
     */
    private Set<Role> roles = new TreeSet<Role>();
}
