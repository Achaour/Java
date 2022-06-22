package Biblio;

public class Oeuvre extends Auteur {

    private String titre;
    private String auteur;
    private String langue;

    public Oeuvre(String titre, String auteur, String langue) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = langue;
    }



    public Oeuvre() {

    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getLangue() {
        return langue;
    }

   // public abstract String afficher();

}

