package bases_Java;

import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        var codePIN="";
       // var email="";

//        System.out.println("Saisissez un email");
//        System.out.println("Saisissez un code pin");

//        while(true){
//            System.out.println("Code pin :");
//            codePIN=input.nextLine();
//            if(!(codePIN.length()!=4)){
//                System.out.println("Code PIN avec succes");
//                break;
//
//            }
//            System.out.println("Erreur code pin doit etre compose de 4 caracteres");
//
//
//        }



        System.out.println("Veuillez definir un email et un mot de passe  :");
        System.out.println("email :");
        var email=input.nextLine();
        System.out.println("Mot de passe");
        var codePin=input.nextLine();


        System.out.println("*************************");
        System.out.println("** espace candidat ** ");
        System.out.println("*************************");

        String codeATester="";
        String emailATester="";


        while (true){

            System.out.println("Entrez vos identifiants pour acceder a votre espace personnel verrouiller votre telephone ");

            System.out.println("votre email :");
            emailATester=input.nextLine();
            System.out.println("votre mot de passe :");

            codeATester=input.nextLine();
            if (codeATester.equals(codePin) && emailATester.equals(email) ){
                System.out.println("Bienvenu dans votre espace client   ");
                break;
            }
            System.out.println(" Identifiants incorrect, veuillez recommnencer");


        }


    }
}
