package bases_Java;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class Exercice18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println(" Merci de saisir un text");
        String text = input.nextLine();
       
        String newText ="";


        for (int i = text.length()-1;i>= 0  ; i--) {
            //  text.replace(,text.charAt(text.length()-1));
            newText=newText+text.charAt(i);
        }
        //System.out.println(newText);


            if(newText.equals(newText)){
                System.out.printf(" %s est un palindrome\n ",text);

            }else{
                System.out.printf("%s n est pas un palindrome",text);
            }



    }
}
