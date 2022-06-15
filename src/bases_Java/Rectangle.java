package bases_Java;


public class Rectangle {

    double longueur;
    double largeur;
    double calculDeLasurface(){


        return longueur * largeur;
    }

    double claculDuPerimetre(){
        return 2*(longueur*largeur);
    }
}
