package poo;

import java.util.Scanner;

public class MainPersonne {
    public static void main(String[] args) {

          Personne donneesPerso = new Personne();

          var input =new Scanner(System.in);

          System.out.println("Merci de entrer vos donnees personnelles\n ");
          System.out.println("First name :");
          donneesPerso.firstName=input.nextLine();
          System.out.println("Last name :");
          donneesPerso.lastName=input.nextLine();
          System.out.println("Pays :");
          donneesPerso.pays=input.nextLine();
          System.out.println("etes vous marie :");
          donneesPerso.married=input.nextBoolean();

          String etatMaritalAfficher=donneesPerso.married?"est marie":"n'etes pas marie";

          System.out.println("Nombre d'enfants :");
          donneesPerso.nombreEnfants=input.nextByte();

          System.out.println(donneesPerso.nomComplet());

          System.out.println("Donnees personnelles :\n");
          System.out.print(" Vous vous appelez "+ donneesPerso.nomComplet());
          System.out.print(" Vous venez de "+ donneesPerso.pays);
          System.out.println("vous etes  "+ etatMaritalAfficher);
          System.out.print(" Vous avez  "+ donneesPerso.nombreEnfants + " enfants");





    }
}
