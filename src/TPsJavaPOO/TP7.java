package TPsJavaPOO;

import java.util.ArrayList;

public class TP7 {




        public static ArrayList<Character> table(char [] table){

            ArrayList<Character> newTable  =new ArrayList<>();

            for (int i = 0; i < table.length; i++) {
                if (i%2==0){
                    newTable.add(Character.toUpperCase(table[i]));
                }else {
                    newTable.add(Character.toLowerCase((table[i])));

                }
            }
            return newTable;}

    public static void main(String[] args) {

        char [] table={'a', 'b', 'c', 'd', 'e'};

        System.out.println(table);

        System.out.println(TP7.table(table));

    }







}
