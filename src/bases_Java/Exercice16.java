package bases_Java;

import java.util.Arrays;
import java.util.Scanner;



public class Exercice16 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Entrer la taille du table a creer");
        int taille=input.nextInt();
        int[] tableau=new int[taille];
        if(taille <=0){
            System.out.println("Merci de entrer une valeur strictement positive\n ");
        }else {
            System.out.println("\"Remplir svp le tableau n\"");
            for (int i = 0; i <=tableau.length-1; i++) {

                tableau[i]=input.nextInt();

            }
        }
        System.out.println( Arrays.toString(tableau));

        System.out.println("Entrer un nombre a rechercher dans le tableau ci dessous \n");
        int nombreAChercher=input.nextInt();

        int nombreDeFois=0;

        for (int i = 0; i <=tableau.length-1 ; i++) {
            if(tableau[i]==nombreAChercher){
                nombreDeFois=nombreDeFois+1;
            }else {
                nombreDeFois=nombreDeFois;
            }
        }

        if (nombreDeFois==0){
            System.out.println(" le nombre recherche n'existe pas dans le tableau \n");
        }else {
            System.out.printf("%d existe et se retrouve %d fois dans le tableau",nombreAChercher,nombreDeFois);
        }




    }
}
