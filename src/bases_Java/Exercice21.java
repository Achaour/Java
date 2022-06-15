package bases_Java;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercice21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> langagesDeProgrammation = new ArrayList<String>();
       // System.out.println("Taille du tableau : " + langagesDeProgrammation.size());


        while (true) {

            System.out.println("Entrer une langage de programmation :");
            String langage = input.nextLine();
            //Cette méthode permet de vérifier si la chaîne est vide ou si elle ne contient que des caractères d'espacements
            if (langage.isBlank() && !langagesDeProgrammation.isEmpty()) {
                break;
            } else {
                langagesDeProgrammation.add(langage);//0
            }
        }


        System.out.println("Avant suppresion ");
        System.out.println(langagesDeProgrammation);


        while (true) {

            System.out.println("Entrer une langage de programmation a supprimer:");
            String langageASupprimer = input.nextLine();
            if (langageASupprimer.isBlank()) {
                break;
            } else {
               // if (langagesDeProgrammation.contains(langageASupprimer)) {

                if ( langagesDeProgrammation.remove(langageASupprimer)) {
                    langagesDeProgrammation.remove(langageASupprimer);//0

                } else {
                    System.out.printf("le tableau ne contient pas le langage %s \n", langageASupprimer);
                }
            }

            System.out.println("Apres suppression");
            System.out.println(langagesDeProgrammation);


        }

    }
}
