package TPsJavaPOO;

import java.util.Scanner;

public class TP4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez votre phrase : ");
        var str = input.nextLine();
        char[] charStr = str.toCharArray();

        for (int i = 0; i < str.length() - 1; i++) {
            if (charStr[i] == ' ') {
                charStr[i + 1] = Character.toUpperCase(charStr[i + 1]);
            } else if (i == 0) {
                charStr[i] = Character.toUpperCase(charStr[i]);
            }
        }

        System.out.println(charStr);

    }
}