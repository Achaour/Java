package bases_Java;

import java.util.Scanner;
import java.lang.*;
import java.util.*;


public class Exercice15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int [] taille= new int[3];

        for(int i=0;i<= taille.length-1;i++){
            System.out.printf("Quelle est la taille de  tableau numero %d ?\n",i+1);
            taille[i]=input.nextInt();
        }

        int[] table1=new int[taille[0]];
        int[] table2=new int[taille[1]];
        int[] table3=new int[taille[2]];

        System.out.printf("Remplir svp le 1er tableau ? \n");
        for(int i=0;i<= taille[0]-1;i++){
            table1[i]=input.nextInt();
        }

        System.out.printf("Remplir svp le 2eme tableau ? \n");
        for(int i=0;i<= taille[1]-1;i++){

            table2[i]=input.nextInt();
        }


        System.out.printf("Remplir svp le 3eme tableau ? \n");
        for(int i=0;i<= taille[2]-1;i++){
            table3[i]=input.nextInt();
        }

        System.out.println( Arrays.toString(table1));
        System.out.println( Arrays.toString(table2));
        System.out.println( Arrays.toString(table3));
        int somme1=0;
        int somme2=0;
        int somme3=0;

        for (int i = 0; i <= table1.length-1 ; i++) {
            if (table1[i]%3==0) {
                somme1=somme1+table1[i];
            }else {
                somme1=somme1;
            }
        }
       System.out.println(somme1);


        for (int i = 0; i <= table2.length-1 ; i++) {
            if (table2[i] % 3 == 0) {
                somme2 = somme2 + table2[i];
            } else {
                somme2 = somme2;
            }
        }
        System.out.println(somme2);

        for (int i = 0; i <= table3.length-1 ; i++) {
            if (table3[i] % 3 == 0) {
                somme3 = somme3 + table3[i];
            } else {
                somme3=somme3;
            }
        }
        System.out.println(somme3);


        System.out.println(somme1+somme2+somme3);

        //var taille2=input.nextInt();
        //var taille3=input.nextInt();
    }
}
