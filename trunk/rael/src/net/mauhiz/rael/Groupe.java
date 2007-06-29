package net.mauhiz.rael;
import java.util.Calendar;
import java.util.TreeSet;
public class Groupe {
    private Biographie      bio;
    private Calendar        date_de_formation;
    private Discographie    discographie;
    private TreeSet<Membre> membres;
    public Groupe() {
        this.membres = new TreeSet<Membre>();
        // TODO : remplir this.membres avec les artistes.
    }
}
