package bases_Java;

import java.util.Scanner;
public class Lecture {
    public static void main(String[] args) {
      //  System.out.println("Bonjour");
       // Scanner input=new Scanner(System.in);

      //  System.out.println("Votre nom: ");
       // String nom= input.nextLine();

        //System.out.println("Votre prenom: ");
        //String prenom= input.nextLine();

        //String prenom= input.next();
        //System.out.println(prenom);

        //System.out.println("Votre genre");
        //char genre=input.next().charAt(0);
        //System.out.println(genre);
        //String prenom="Mansour";
        //char genre='M';
        //byte age=12;
        //float poids=75.25F;
        //boolean estMarie=false;


        Scanner input=new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom=input.nextLine();

        System.out.print("Votre prenom : ");
        String prenom=input.next();

        System.out.print("Votre genre : ");
        char genre=input.next().charAt(0);

        System.out.print("Votre age : ");
        byte age=input.nextByte();

        System.out.print("Votre poids : ");
        float poids=input.nextFloat();

        System.out.printf("Nom : %s\nPrenom : %s\nGenre : %c\nAge : %d\nPoids : %.2f\n",prenom,nom,genre,age,poids);
    }
}
