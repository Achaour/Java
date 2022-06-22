package Biblio;

import java.util.ArrayList;

public  class Bibliotheque extends Oeuvre {
    private String nomBibliotheque;
   // private ArrayList exemplaires;


   //private static ArrayList<Exemplaire> exemplairesArrayList = new ArrayList<>();

    private static ArrayList<Exemplaire> exemplairesArrayList = new ArrayList<>();



    public Bibliotheque(String nomBibliotheque) {
        this.nomBibliotheque = nomBibliotheque;
        System.out.println("La bibliotheque " +nomBibliotheque + " est ouverte !");
    }
    public Bibliotheque(String titre, String auteur, String langue) {
        super(titre, auteur, langue);
    }
    public Bibliotheque() {


    }

    public void listerExemplaires() {
        for (int i = 0; i < exemplairesArrayList.size(); i++) {

            String titre = (exemplairesArrayList.get(i).getTitre());
            String nomAuteur = (exemplairesArrayList.get(i).getAuteur());
            String langue = (exemplairesArrayList.get(i).getLangue());

            System.out.println("titre: " + titre + "nom auteur: " + nomAuteur + "langue: " + langue);
        }
    }

    public ArrayList getExemplaires() {
        return exemplairesArrayList;
    }

    public String getNomBibliotheque() {
        return nomBibliotheque;
    }

    public int getNbExemplaires() {
        return exemplairesArrayList.size();
    }




    public ArrayList stocker(Exemplaire exemplaire){

        exemplairesArrayList.add(exemplaire);

        return exemplairesArrayList    ;
    }


//    public ArrayList listerExemplaires(String langue){
//        String oeuvre=getTitre() +"," + getAuteur() + "," +getLangue();
//
//        ArrayList<String> listeExemplaires=new ArrayList<>();
//
//        for (int i = 0; i <exemplaires.size() ; i++) {
//            if (getLangue()==langue) {
//                listeExemplaires.add(oeuvre);
//
//            }
//        }
//        return listeExemplaires;
//    }

    public int compterExemplaires(ArrayList oeuvre){
        int somme=0;
        for (int i = 0; i <exemplairesArrayList.size(); i++) {

            if (exemplairesArrayList.contains(oeuvre)){
                somme=somme+1;
            }
        }
        return somme;
    }

    public void afficherAuteur(){

        for (int i = 0; i < exemplairesArrayList.size(); i++) {
            if(getPrix()){
                System.out.println(exemplairesArrayList.get(i));
            }
            }

    }






}
