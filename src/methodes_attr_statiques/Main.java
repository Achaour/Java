package methodes_attr_statiques;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

class Configuration{
    public static final String DATABASE_URL="mysql://localhost:3306";
    public static final String DATABASE_USER="root";
    public static final String DATABASE_PASSWORD="";

    // ne sont pas des variables statiques

    // Password config
    public static final byte MIN_PASSWORD =5;
    public static final byte MAX_PASSWORD =18;

}

class Validator {
    public static boolean isEmail(String email){
        return  email.contains("@");
    }

    public static boolean minMax(String str, byte min,byte max) {

        return str.length()>=min && str.length()<=max;
    }

    }






public class Main {
    public static void main(String[] args) {
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(625));


        System.out.println("Url de la base de données :" + Configuration.DATABASE_URL);



        //Math m= new Math();

        // simuler un formulaire

        Scanner input=new Scanner(System.in);

        while (true){
            System.out.println("Email :");
            var email=input.nextLine();

            System.out.println("Mot de passe: ");
            var motDePasse =input.nextLine();

            if(!Validator.isEmail(email)){
                System.out.println("l'email saisi n'est pas vallide");
                continue;

            }

            if(!Validator.minMax(motDePasse,(byte) 8, (byte) 15)){

                System.out.println("Le mot doit etre entre 8 et 15 caracteres");


            }

            if(Validator.isEmail(email)&& Validator.minMax(motDePasse,Configuration.MIN_PASSWORD,Configuration.MAX_PASSWORD)){

                System.out.println("Welcome");

                break;


            }
        }
    }
}
