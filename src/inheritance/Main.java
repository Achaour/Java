package inheritance;

import jdk.swing.interop.SwingInterOpUtils;

// Surcharge ou overloading : avoir plusieurs methodes de meme nom, mais avec
//differentes signature

// la redefinition ou overriding: le fait de fournir une implemenation

public class Main {
    public static void main(String[] args) {



    Guerrier chris = new Guerrier("Christian",400,"M16 a4");
    Guerrier mansour=new Guerrier("Mansour",900,"Lance-pierre");

    Voleur jean=new Voleur("Jean",1000,"Mains");

    Magicien nouha=new Magicien("Nouha",100,"Baguette mystique");

    Sorcier morgane=new Sorcier("Morgane",200,"baguette Morganienne","baton Morganienne");

   chris.rencontrer();
   mansour.rencontrer();
   nouha.rencontrer();
   morgane.rencontrer();
   jean.rencontrer();

  // Personnage p=new Personnage(); on peut pas de creer une instance pour une classe
             //   abstraite



    Guerrier g=new Guerrier("Chris",200,"AK 47");
    System.out.println("Arme du guerrier "+g.getArme());
    g.setArme("AK 47");
    System.out.println("Arme du guerrier "+g.getArme());
    g.rencontrer();

    }
}
