import java.util.Arrays;
import java.util.Scanner;

public class Remplissage {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Nombre de lignes:");
        int taille=input.nextInt();
        int [][] matrice= new int[taille][];
        //

        for (int i = 0; i <matrice.length ; i++) {
            System.out.printf("Donnez le nombre de colonne pour la ligne[%d] :\n",i);
            int nombreDeColonne=input.nextInt();
            matrice[i]=new int [nombreDeColonne];
            for (int j = 0; j<matrice[i].length ; j++) {
                System.out.printf("matrice[%d][%d]: \n",i,j);
                matrice[i][j]= input.nextInt();


            }




        }

      //  System.out.println(Arrays.toString(matrice));


        for (int i = 0; i <matrice.length ; i++) {
            for (int j = 0; j <matrice[i].length ; j++) {

                System.out.print(matrice[i][j]+ " ");

            }
            System.out.println();

        }

    }
}
