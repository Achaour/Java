package poo;

import java.util.Scanner;

public class MainPatients {
    public static void main(String[] args) {


        Patients patients1 = new Patients();
        Patients patients2 = new Patients("Mansour","Achaour",1.86F,83.00F);

        var input = new Scanner(System.in);

        System.out.println("*************Merci de entrer vos donnees personnelles*************\n ");


        System.out.println("First name :");
        patients1.setFirstName(input.nextLine());

        System.out.println("Last name :");
        patients1.setLastName(input.nextLine());

        System.out.println("Taille :");
        patients1.setTaille(input.nextFloat());

        System.out.println("Poids :");
        patients1.setPoids(input.nextFloat());

        System.out.println("L'IMC du patient :" + patients1.iMC());


       // Affichage

        System.out.println("Affichage : Donnees personnelles :"+ patients1.getFirstName()+ "\n");
        System.out.print(" Vous vous appelez "+ patients1.getFirstName()+" " +patients1.getLastName() + " \n");
        System.out.print(" votre taille est "+ patients1.getTaille() + " \n");
        System.out.println(" votre poids  "+  patients1.getPoids()+ " \n");
        System.out.print("L'IMC du patient :" + patients1.iMC()+"\n");


        System.out.println("Affichage : Donnees personnelles :"+ patients2.getFirstName() + "\n");
        System.out.print(" Vous vous appelez "+ patients2.getFirstName()+" " +patients2.getLastName() + " \n");
        System.out.print(" votre taille est "+ patients2.getTaille() + " \n");
        System.out.println(" votre poids  "+  patients2.getPoids()+ " \n");
        System.out.print("L'IMC du patient :" + patients2.iMC());




    }
}