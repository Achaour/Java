package bases_Java;

public class ProgrammationProcedurale {

    static float calculDuPerimetre(float longueur, float largeur){

        float perimetre=(longueur +largeur)*2;
        return perimetre;

    }
    static float calculDuSurface(float longueur, float larguer){

        return (longueur*larguer);
    }



    public static void main(String[] args) {


    //Rectangle 1

    float longueur=500.5F;
    float largeur=250F;

    float surface=calculDuSurface(longueur,largeur);
    float perimetre=calculDuPerimetre(longueur,largeur);

        System.out.println(surface);
        System.out.println(perimetre);


//    Rectangle 1

        float longueur2=50.5F;
        float largeur2=25F;

        float surface1=calculDuSurface(longueur2,largeur2);
        float perimetre1=calculDuPerimetre(longueur2,largeur2);

        System.out.println(surface1);
        System.out.println(perimetre1);





    }


}
