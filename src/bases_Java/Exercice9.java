package bases_Java;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Saisir la valeur du mois : ");
        byte mois= input.nextByte();


        switch (mois){
            case 1:
                System.out.println("Janvier");
                break;
            case 2:
                System.out.println("Fevrier");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("Avril");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juin ");
                break;
            case 7:
                System.out.println("Juillet");
                break;
            case 8:
                System.out.println("Aout");
                break;
            case 9:
                System.out.println("Septembre");
            case 10:
                System.out.println("Octobre");
                break;

            case 11:
                System.out.println("Novembre");
                break;

            case 12:
                System.out.println("Decembre");
                break;

            default:
                System.out.println("Erreur");

        }

    }
}