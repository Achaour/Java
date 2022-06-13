import java.lang.reflect.Array;
import java.lang.*;
import java.util.*;

public class ArrayStorage {
    public static void main(String[] args) {
//        int b;
//        System.out.println(b);
//
        // tableaus entiers java initialise toutes les cellules par 0;
        // tableaus floats java initialise toutes les cellules par 0.0;
        // tableaus boolean java initialise toutes les cellules par false;
        // tableaus string java initialise toutes les cellules par null (un objet qui point vers rien);

        int [] a= new int[5];
        System.out.println("affichage de l adresse stocke dans :");
        System.out.println(a);
        System.out.println();
        System.out.println("Affichage du tableau"+ Arrays.toString(a));
    }
}
