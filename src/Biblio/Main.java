package Biblio;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {


        Bibliotheque biblio=new Bibliotheque("municipale");


        Exemplaire exemplaire1=new Exemplaire("Les Miserables","Victor Hugo","francais");
        Exemplaire exemplaire2=new Exemplaire("Les Miserables","Victor Hugo","francais");
        Exemplaire exemplaire3=new Exemplaire("L homme qui rit","Victor Hugo","francais");
        Exemplaire exemplaire4=new Exemplaire("Le Comte de Monte-Cristo","Alexandre Dumas","francais");
        Exemplaire exemplaire5=new Exemplaire("Le Comte de Monte-Cristo","Alexandre Dumas","francais");
        Exemplaire exemplaire6=new Exemplaire("Le Comte de Monte-Cristo","Alexandre Dumas","francais");
        Exemplaire exemplaire7=new Exemplaire("Zazie dans le metro"," Raymond Queneau","francais");
        Exemplaire exemplaire8=new Exemplaire("The count of Monte-Cristo","Alexandre Dumas","anglais");


        System.out.println();


        System.out.println("La bibliotheque municipale offre \n");

        System.out.println(exemplaire1.afficher());
        System.out.println(exemplaire2.afficher());
        System.out.println(exemplaire3.afficher());
        System.out.println(exemplaire4.afficher());
        System.out.println(exemplaire5.afficher());
        System.out.println(exemplaire6.afficher());
        System.out.println(exemplaire7.afficher());
        System.out.println(exemplaire8.afficher());


        System.out.println("******\n");

        biblio.stocker(exemplaire1);
        biblio.stocker(exemplaire2);
        biblio.stocker(exemplaire3);
        biblio.stocker(exemplaire4);
        biblio.stocker(exemplaire5);
        biblio.stocker(exemplaire6);
        biblio.stocker(exemplaire7);
        biblio.stocker(exemplaire8);

        System.out.println();


        System.out.println("Les exemplaires en anglais sont \n");

        

        if (biblio.getLangue()=="anglais") {
            biblio.listerExemplaires();
        }



    }
}
