package TPsJavaPOO;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class TP8 {


    public static ArrayList<Integer> pointFinalXY(String[] directions) {

        ArrayList<Integer> pointFinal = new ArrayList<>();
        LinkedHashMap<String, Integer> hmapStr = new LinkedHashMap<>();
        int[] tab = new int[2];

        for (int i = 0; i < directions.length; i++) {
            String key = directions[i];
            if (hmapStr.containsKey(key)) {
                int previousValue = hmapStr.get(key);
                hmapStr.replace(key, previousValue + 1);

            } else {
                hmapStr.put(key, 1);
            }
        }

            pointFinal.add(hmapStr.get("droite") - hmapStr.get("gauche"));
            pointFinal.add(hmapStr.get("haut") - hmapStr.get("bas"));


            return pointFinal;

        }

    public static void main(String[] args) {



        String [] table= {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};

        System.out.println(TP8.pointFinalXY(table));

    }

}