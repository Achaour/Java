package TPsJavaPOO;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.Struct;
import java.util.Scanner;

import java.io.*;
import java.util.*;

public class TP3 {

    public static void main(String[] args) {

        System.out.println("Veuillez tester vos anagrammes :\n");


        Scanner input= new Scanner(System.in);

        System.out.println("Chaine 1: \n");
        var str1= (input.nextLine()).toLowerCase();
        System.out.println("Chaine 2: \n");
        var str2 =(input.nextLine()).toLowerCase();

        HashMap<Character, Integer> hmapStr1
                = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmapStr2
                = new HashMap<Character, Integer>();




        for (int i = 0; i <str1.length() ; i++) {
            var cara= str1.charAt(i);
            int nombreDeFois=0;
            if(hmapStr1.get(cara)==null){
                hmapStr1.put(cara,1);
            }else {
                hmapStr1.put(cara,++nombreDeFois);
            }

        }

        for (int i = 0; i <str2.length() ; i++) {
            var cara= str2.charAt(i);
            int nombreDeFois=0;
            if(hmapStr2.get(cara)==null){
                hmapStr2.put(cara,1);
            }else {
                hmapStr2.put(cara,++nombreDeFois);
            }

        }

        if(hmapStr1.equals(hmapStr2)) {
            System.out.printf("les 2 chaines de caracteres %s  et %s  sont des anagrammes", str1, str2);

        }else{

            System.out.printf("les 2 chaines de caractères %s  et %s ne sont des anagrammes", str1, str2);

            }







//        Scanner input=new Scanner(System.in);
//
////        var chaine1=input.nextLine();
////        var chaine2= input.nextLine();
////
//        String chaine1= "rage";
//        String chaine2="gare";
//
//        for (int i = 0; i <chaine1.length() ; i++) {
//
//            for (int j = 0; j < chaine2.length(); j++) {
//
//                if(chaine1.charAt(i)==chaine2.charAt(j)){
//
//
//
//                }
//
//                }
//
//            }
//
//
//        }





    }
}
