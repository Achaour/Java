package Biblio;

import java.util.SplittableRandom;

public class Exemplaire extends Oeuvre {

    public Exemplaire(String titre, String auteur, String langue) {
        super(titre, auteur, langue);
        System.out.printf("Nouvel exemplaire->,%s ,%s, en %s . \n",titre,auteur,langue);
    }







    public String afficher() {
        return " Un exemplaire de " + getTitre() + ","+ getAuteur() +"," +getLangue();
    }

    public String getOeuvre(){
        return getTitre();
    }


}