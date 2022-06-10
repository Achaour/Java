import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        var input = new Scanner(System.in);
        System.out.println("Veuillez definir un code PIN :");
        var codePin=input.nextInt();
        System.out.println("*************************");
        System.out.println("** telephone verrouille ** ");
        System.out.println("*************************");

        int codeATester=0;

        while (codeATester!=codePin){

            System.out.println("Entrez votre code pin pour verrouiller votre telephone ");
            codeATester=input.nextInt();

        }
    }
}
