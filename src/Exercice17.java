import java.util.Scanner;

public class Exercice17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Merci de saisir un text");
        String text = input.nextLine();
        String [] text1=new String[text.length()];
        String newText ="";



        for (int i = text.length()-1;i>= 0  ; i--) {



          //  text.replace(,text.charAt(text.length()-1));
           newText=newText+text.charAt(i);



        }


        System.out.println(newText);

    }
}
