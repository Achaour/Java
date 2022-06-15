package bases_Java;

import java.util.HashMap;
import java.util.Scanner;

public class Set {

    public static void main(String[] args) {



//        String[] jours={"lundi","mardi","mercredi","jeudi","vendredi","samedi","dimanche"};
//        int [] numeros= {1,2,3,4,5,6,7};
        var input =new Scanner(System.in);
        String [] jours =new String[7];
        int [] numeros= new int[7];
        System.out.println(" Veuillez entrer les jours et les numeros ");

        for (int i = 0; i <7 ; i++) {

            System.out.println("Jour :\n");
            String jour=input.nextLine();
            jours[i]=jour;

            System.out.println("numero du jour :\n");
            int numero=input.nextInt();
            numeros[i]=numero;
        }
//        for (int i = 0; i <7 ; i++) {
//
//            System.out.println("numero du jour :\n");
//            int numero=input.nextInt();
//            numeros[i]=numero;
//        }



        HashMap<Integer,String> joursDeSemaine=new HashMap<>();
        //   System.out.println(joursDeSemaine);

        for (int i = 0; i <jours.length ; i++) {
//            System.out.println(phrase.charAt(i));


            String jour=jours[i];
            int numero=numeros[i];
            joursDeSemaine.put(numero,jour);
//            if(joursDeSemaine.containsKey(key)){
//                int previousValue=occurenceLettres.get(key);
//                occurenceLettres.replace(key,previousValue+1);
//
//            }else {
//                occurenceLettres.put(key,1);
//            }

        }
        // c'est quoi un set et son utilisation

        System.out.println(joursDeSemaine);


    }
}
