package bases_Java;

import java.util.ArrayList;

public class TableauxDynamique {

    public static void main(String[] args) {

        ArrayList<Integer> notes =new ArrayList<>();
        // la taille peut evoluer
        ArrayList<String> langagesDeProgramation=new ArrayList<>();
        System.out.println("Taille du tableau : "+langagesDeProgramation.size());

        langagesDeProgramation.add("Java");//0
        langagesDeProgramation.add("Python");//1
        langagesDeProgramation.add("C++");//2
        langagesDeProgramation.add("Fortran");//3;
        langagesDeProgramation.add("Visual Basic 6.0");//4

        System.out.printf("langageDeProgrammation [%d]: %s",
                0,langagesDeProgramation.get(0));
        System.out.printf("langageDeProgrammation [%d]: %s",
                1,langagesDeProgramation.get(1));
        System.out.printf("langageDeProgrammation [%d]: %s",
                2,langagesDeProgramation.get(2));

        System.out.println("Tableau avant suppression");
        System.out.println(langagesDeProgramation);

        langagesDeProgramation.remove(4);


        System.out.println("Tableau apres suppression");
        System.out.println(langagesDeProgramation);

        System.out.println("Renommer Python en Python 3.7");

        langagesDeProgramation.set(1,"Python 3.7");

        System.out.println("bases_Java.Affichage apres le renommage ");

        System.out.println(langagesDeProgramation);

        // Tester si le Tableau est vide
        if(langagesDeProgramation.isEmpty()){
            System.out.println("Le tableau est vide ");

        }else {
            System.out.println("Le tableau n est pas vide");


//  Vider le tableau
        }


        // Parcourir un tableau dynamique
        for (int i = 0; i <langagesDeProgramation.size() ; i++) {
            System.out.printf("elemnet[%d]: %s \n" ,i,langagesDeProgramation.get(i));

        }
        langagesDeProgramation.clear();
        if(langagesDeProgramation.size()==0){
            System.out.println("le tableau est vide");

        }else {
            System.out.println("le tableau n'est pas vide");
        }



    }


}
