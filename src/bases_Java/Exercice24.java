package bases_Java;

import java.util.Scanner;

public class Exercice24 {




//    static boolean isPrefix(String chaine1, String chaine2){
//
//            int taille = chaine2.length();
//            String chaine = chaine1.substring(0,taille);
//            if (chaine2.equals(chaine)) {
//                return true;
//
//            } else {
//                return false;
//            }
//        }

    static boolean isPrefix(String chaine1, String chaine2) {

        int taille = chaine2.length();
        String chaine = chaine1.substring(0, taille);
        return chaine2.equals(chaine);
    }


    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);

        System.out.println(" Chaine 1 :");


        String chaine1= input.nextLine();

        System.out.println(" Chaine 2 :");
        String chaine2= input.nextLine();

//        String chaine1="hugging";
//        String chaine2="hug";

        boolean resultat=isPrefix(chaine1, chaine2);
        System.out.println(resultat);


    }

}
