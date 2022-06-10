import java.util.Scanner;

public class BoucleWhile {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        var codePIN="";
        System.out.println("Saisissez un code pin");
        while(codePIN.length()!=4){
            System.out.println("Code pin :");

            codePIN=input.nextLine();
            if(codePIN.length()!=4){
                System.out.println("Erreur code pin doit etre compose de 4 caracteres");
            }else {
                System.out.println("Code PIN avec succes");
            }
        }



        System.out.println("Veuillez definir un code PIN :");
        var codePin=input.nextLine();
        System.out.println("*************************");
        System.out.println("** telephone verrouille ** ");
        System.out.println("*************************");

        String codeATester="";

        while (codeATester!=codePin){

            System.out.println("Entrez votre code pin pour verrouiller votre telephone ");
            codeATester=input.nextLine();
            if (codeATester.equals(codePIN)){
                System.out.println("Bravo, appareil a été verrouillé ");
            }else {
                System.out.println("Code Pin erroné veuillez recommnencer");
            }

        }


   }
}
