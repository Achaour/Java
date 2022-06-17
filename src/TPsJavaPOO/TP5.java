package TPsJavaPOO;

import java.util.*;

public class TP5 {


    public static void main(String[] args) {
        System.out.println("Veuillez Entrer une phrase:\n");


        Scanner input = new Scanner(System.in);

      //  var str = (input.nextLine()).toLowerCase();

        String str="mansour achaour mansour achaour achaour mansour ";

        String[] words = str.split(" ");



        System.out.println(Arrays.toString(words));


        LinkedHashMap<String, Integer> hmapStr = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            String key = words[i];
            if (hmapStr.containsKey(key)) {
                int previousValue = hmapStr.get(key);
                hmapStr.replace(key, previousValue + 1);

            } else {
                hmapStr.put(key, 1);
            }
        }



        System.out.println(hmapStr);


       ;
        ArrayList<String> newPhrase  =new ArrayList<>();


        Set<String> keys = hmapStr.keySet();
        for ( String key : keys ) {
            newPhrase.add(key);
        }



        String newPhrase2 = String.join(" ",newPhrase);
        System.out.println(newPhrase2);


    }
}