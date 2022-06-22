package TPsJavaPOO;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class TP9 {

    public static boolean isTwoCara(String chaine) {

        boolean etat=false;

        for (int i = 0; i < chaine.length()-1; i++) {
            if(chaine.charAt(i) == chaine.charAt(i+1)){
                etat=true;
                break;


            }else {
                continue;

            }

        }

        return etat;
    }

    public static void main(String[] args) {
        String chaine="t!!";

        System.out.println(isTwoCara(chaine));
    }
}
