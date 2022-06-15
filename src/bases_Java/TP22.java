package bases_Java;

import java.util.HashMap;
import java.util.Map;

public class TP22 {
    public static void main(String[] args) {

        HashMap<String,String> identite= new HashMap<>();
        identite.put("nom","Achaour");
        identite.put("prenom","Mansour");
        identite.put("pays","Maroc");
        for (Map.Entry<String,String> maVariable:identite.entrySet()) {

            System.out.println(maVariable.getKey()+"=>"+maVariable.getValue());

            
        }

        int[] nombres={1,2,3,4,5,6,7,8,9,10};

        for (int nombre:nombres ) {
            System.out.println(nombre);

        }


    }
}
