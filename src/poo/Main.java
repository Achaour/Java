package poo;

public class Main {
    public static void main(String[] args) {

        System.out.println("**********");
        System.out.println("**Objet1**");
        System.out.println("**********");

        Rectangle terrain = new Rectangle();

        System.out.println("etat initial de l'objet apres "+
                "Creation\n=================");
        System.out.println("la longueur :"+terrain.longueur);
        System.out.println("la largeur:"+terrain.largeur);

        System.out.println("etat de l'objet apres avoir fourni des valeurs "+
                "Creation\n=================");
        terrain.largeur=350;
        terrain.longueur=500;
        System.out.println("la longueur :"+terrain.longueur);
        System.out.println("la largeur:"+terrain.largeur);

        System.out.println("Surface:"+terrain.calculDeLaSurface());
        System.out.println("Perimetre:"+terrain.calculDuPerimetre());


        System.out.println("**********");
        System.out.println("**Objet2**");
        System.out.println("**********");

        Rectangle parcelle =new Rectangle();

        System.out.println("la longueur :"+parcelle.longueur);
        System.out.println("la largeur:"+parcelle.largeur);



    }
}