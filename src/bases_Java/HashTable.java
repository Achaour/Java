package bases_Java;

import java.util.ArrayList;
import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {


        HashMap<String,String> identite=new HashMap<>();

        identite.put("nom","achaour");
        identite.put("prenom","mansour");

        System.out.println(identite.get("nom"));

        String phrase="je suis dans une joie immense";

        HashMap<Character,Integer> occurenceLettres=new HashMap<>();
                //{J:1,B:3}
        System.out.println(occurenceLettres);

       // occurenceLettres.put("a",5);
        System.out.println(occurenceLettres);


        for (int i = 0; i <phrase.length() ; i++) {
//            System.out.println(phrase.charAt(i));
            char key=phrase.charAt(i);
            if(occurenceLettres.containsKey(key)){
                int previousValue=occurenceLettres.get(key);
                occurenceLettres.replace(key,previousValue+1);

            }else {
                occurenceLettres.put(key,1);
            }

        }
        System.out.println(occurenceLettres);
        System.out.println("Occurence de s:"+occurenceLettres.get("s"));

    }

}
