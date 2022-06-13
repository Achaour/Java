import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEquality {

    public static void main(String[] args) {
        int [] nombres =new int [3];
        nombres[0]=12;
        nombres[1]=15;
        nombres[2]=20;
        System.out.println("Affichage nombre1:"+ Arrays.toString(nombres));
        int [] nombres2=nombres;
        nombres2[0]=33;
        System.out.println("Affichage tableau nombre1 apres creation de 2:"+ Arrays.toString(nombres));

        if(nombres==nombres2){
            System.out.println("les 2 tableau pointnet vers meme tableau");
        }

        int [] nombres3= new int [3];
        nombres3[0]=33;
        nombres3[1]=15;
        nombres3[2]=20;

        System.out.println("Affichage nombre 3:"+ Arrays.toString(nombres3));

        if(nombres==nombres3){
            System.out.println(" meme adresse ");
        } else {
            System.out.println(" pas meme adresse");
        }

    }
}
