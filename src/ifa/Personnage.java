package ifa;

public class Personnage {



    private String nom;
    private  String prenom;

    public Personnage(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}

class SuperHero extends Personnage{

    public SuperHero(String nom, String prenom) {
        super(nom, prenom);
    }
}


interface Voler {
    public void voler ();
}
class SuperHerosVolant extends SuperHero implements Voler{

    public SuperHerosVolant(String nom, String prenom) {
        super(nom, prenom);


    }


        @Override
    public void voler (){
        System.out.println("Je peux voler comme un superman");
    }




}

class InsectGeantVolant implements Voler {

    public void voler(){

        System.out.println("Je peux voler comme insect");

    }
}
