package poo;

import java.util.Scanner;

public class MainPersonne {
    public static void main(String[] args) {
         // Personne donneesPerso = new Personne();

          Personne donneesPerso = new Personne("Mansour",
                  "Achaour","Maroc",false,(byte)0);

          var input =new Scanner(System.in);

          System.out.println("Merci de entrer vos donnees personnelles\n ");
          System.out.println("First name :");
          donneesPerso.setFirstName(input.nextLine());
          System.out.println("Last name :");
          donneesPerso.setLastName(input.nextLine());
          System.out.println("Pays :");
          donneesPerso.setPays(input.nextLine());
          System.out.println("etes vous marie :");
          donneesPerso.setMarried(input.nextBoolean());

         String etatMaritalAfficher=donneesPerso.getMarried()?"est marie":"n'etes pas marie";

          System.out.println("Nombre d'enfants :");
          donneesPerso.setNombreEnfants(input.nextByte());





          System.out.println(donneesPerso.nomComplet());

          System.out.println("Donnees personnelles :\n");
          System.out.print(" Vous vous appelez "+ donneesPerso.nomComplet());
          System.out.print(" Vous venez de "+ donneesPerso.getPays());
          System.out.println("vous etes  "+ etatMaritalAfficher);
          System.out.print(" Vous avez  "+ donneesPerso.getNombreEnfants() + " enfants");

          Personne human=new Personne();

        System.out.print(" Vous vous appelez "+ donneesPerso.nomComplet());
        System.out.print(" Vous venez de "+ donneesPerso.getPays());
        System.out.println("vous etes  "+ etatMaritalAfficher);
        System.out.print(" Vous avez  "+ donneesPerso.getNombreEnfants() + " enfants");


    }
}
