import java.util.Scanner;

public class Exercice20 {
    public static void main(String[] args) {

            Scanner input=new Scanner(System.in);


            int [][] matrice= new int[4][4];
            var sommeDeuxDiagonale=0;
            //

            for (int i = 0; i <matrice.length ; i++) {
                for (int j = 0; j<matrice[i].length ; j++) {
                    System.out.printf("matrice[%d][%d]: \n",i,j);
                    matrice[i][j]= input.nextInt();

                }
            }
            for (int i = 0; i <matrice.length ; i++) {
                sommeDeuxDiagonale=sommeDeuxDiagonale+ (matrice[i][i]) +(matrice[matrice.length-i-1][i]);
                for (int j = 0; j <matrice[i].length ; j++) {

                    System.out.print(matrice[i][j]+ " ");

                }
                System.out.println();

            }



            System.out.printf("la somme de la diagonale %d",sommeDeuxDiagonale);

        }
}
