package poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        System.out.println("**********");
//        System.out.println("**Objet1**");
//        System.out.println("**********");
//
//        Rectangle terrain = new Rectangle();
//
//        System.out.println("etat initial de l'objet apres "+
//                "Creation\n=================");
//        System.out.println("la longueur :"+terrain.longueur);
//        System.out.println("la largeur:"+terrain.largeur);
//
//        System.out.println("etat de l'objet apres avoir fourni des valeurs "+
//                "Creation\n=================");
//        terrain.largeur=350;
//        terrain.longueur=500;
//        System.out.println("la longueur :"+terrain.longueur);
//        System.out.println("la largeur:"+terrain.largeur);
//
//        System.out.println("Surface:"+terrain.calculDeLaSurface());
//        System.out.println("Perimetre:"+terrain.calculDuPerimetre());
//
//
//        System.out.println("**********");
//        System.out.println("**Objet2**");
//        System.out.println("**********");
//
//        Rectangle parcelle =new Rectangle();
//
//        System.out.println("la longueur :"+parcelle.longueur);
//        System.out.println("la largeur:"+parcelle.largeur);
//
//
//
//    }
//}

//        System.out.println("**********");
//        System.out.println("**Objet1**");
//        System.out.println("**********");
//
//        Rectangle2 terrain = new Rectangle2();
////
//        System.out.println("etat initial de l'objet apres "+
//                "Creation\n=================");
//        System.out.println("la longueur :"+terrain.getLongueur());
//        System.out.println("la largeur:"+terrain.getLargeur());
//
//        System.out.println("etat de l'objet apres avoir fourni des valeurs "+
//                "Creation\n=================");
//        terrain.setLargeur(350);
//        terrain.setLongueur(500);
//        System.out.println("la longueur :"+terrain.getLongueur());
//        System.out.println("la largeur:"+terrain.getLargeur());
//
//        System.out.println("Surface:"+terrain.calculDeLaSurface());
//        System.out.println("Perimetre:"+terrain.calculDuPerimetre());
//
//
//        System.out.println("**********");
//        System.out.println("**Objet2**");
//        System.out.println("**********");
//
//        Rectangle2 parcelle =new Rectangle2();
//
//        System.out.println("la longueur :"+parcelle.getLongueur());
//        System.out.println("la largeur:"+parcelle.getLargeur());
//
//
//
//    }
//}

        System.out.println("**********");
        System.out.println("**Objet1**");
        System.out.println("**********");

        Rectangle3 terrain = new Rectangle3(500,350);
//
        System.out.println("etat initial de l'objet apres "+
                "Creation\n=================");
        System.out.println("la longueur :"+terrain.getLongueur());
        System.out.println("la largeur:"+terrain.getLargeur());

        System.out.println("etat de l'objet apres avoir fourni des valeurs "+
                "Creation\n=================");
//        terrain.setLargeur(350);
//        terrain.setLongueur(500);
//        System.out.println("la longueur :"+terrain.getLongueur());
//        System.out.println("la largeur:"+terrain.getLargeur());
//
//        System.out.println("Surface:"+terrain.calculDeLaSurface());
//        System.out.println("Perimetre:"+terrain.calculDuPerimetre());

//
//        System.out.println("**********");
//        System.out.println("**Objet2**");
//        System.out.println("**********");
//
//        Rectangle2 parcelle =new Rectangle2();
//
//        System.out.println("la longueur :"+parcelle.getLongueur());
//        System.out.println("la largeur:"+parcelle.getLargeur());


        Rectangle3 rec=new Rectangle3();
        System.out.println(rec.getLargeur());
        System.out.println(rec.getLongueur());
        System.out.println(terrain.getLargeur());
        System.out.println(terrain.getLongueur());

      //  System.out.println(rect);


        ArrayList<String> fruits =new ArrayList<>(Arrays.asList("Pomme","Mangue","Orange"));


    }
}