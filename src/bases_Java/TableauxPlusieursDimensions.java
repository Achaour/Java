package bases_Java;

import java.util.Arrays;

public class TableauxPlusieursDimensions {
    public static void main(String[] args) {
      //  int [] a= {1,2,3,4,5};
       // int a2= new int[5];


        int [][] nombres ={
                {1,2,6,5},
                {2,4,9},
                {7,3}
        };

        // premiere ligne (premier tableau)
        // bases_Java.Affichage sans boucle

        System.out.println("bases_Java.Affichage sans boucle\n========================");

        System.out.println("1er tableau \n ===============");
        System.out.println(nombres[0][0]);
        System.out.println(nombres[0][1]);
        System.out.println(nombres[0][2]);
        System.out.println(nombres[0][3]);

        System.out.println("2eme tableau \n ===============");
        System.out.println(nombres[1][0]);
        System.out.println(nombres[1][1]);
        System.out.println(nombres[1][2]);


        System.out.println("3eme tableau \n ===============");
        System.out.println(nombres[2][0]);
        System.out.println(nombres[2][1]);


        System.out.println("bases_Java.Affichage avec la boucle for"+"for\n ============");

        for (int i = 0; i < nombres.length; i++) {

            System.out.println(Arrays.toString(nombres[i]));

            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println(nombres[i][j]);

            }


            }

        }



    }

