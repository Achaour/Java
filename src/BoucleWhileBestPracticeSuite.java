import java.util.Scanner;

public class BoucleWhileBestPracticeSuite {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        var codePIN="";
        System.out.println("Saisissez un code pin");
        while(true){
            System.out.println("Code pin :");
            codePIN=input.nextLine();
            if(!(codePIN.length()!=4)){
                System.out.println("Code PIN avec succes");
                break;

            }
            System.out.println("Erreur code pin doit etre compose de 4 caracteres");


        }



        System.out.println("Veuillez definir un code PIN :");
        var codePin=input.nextLine();
        System.out.println("*************************");
        System.out.println("** telephone verrouille ** ");
        System.out.println("*************************");

        String codeATester="";

        while (true){

            System.out.println("Entrez votre code pin pour verrouiller votre telephone ");
            codeATester=input.nextLine();
            if (codeATester.equals(codePIN)){
                System.out.println("Bravo, appareil a été verrouillé ");
                break;
            }
            System.out.println("Code Pin erroné veuillez recommnencer");


        }


    }
}
