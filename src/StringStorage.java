import java.util.Scanner;

public class StringStorage {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        String nom="achaour";
        String nom2="achaour";


        if(nom==nom2){
            System.out.println("nom pointe vers le meme string que nom2");
        }else {
            System.out.println("nom ne pointe pas vers le meme string que nom2");
        }

        System.out.println("Entrer un nom");

        String nom3=input.nextLine();
//       ce test va etre evalué à false
        // parce que les strings fournis à partir du clavier ne sont pas stockes dans le pool des litteraux.

        System.out.println("avant d'avoir ajouté les litteraux\n============================== ");
        if(nom==nom3){
            System.out.println("nom pointe vers le meme string que nom2");
        }else {
            System.out.println("nom ne pointe pas vers le meme string que nom2");
        }


        System.out.println("avant d'avoir ajouté les litteraux\n============================== ");
        if(nom.equals(nom3)){
            System.out.println("nom contient le meme string que nom3");
        }else {
            System.out.println("nom ne contient pas  le meme string que nom2");
        }

        // mettre le string stockes
        System.out.println("apres avoir ajouté les litteraux\n============================== ");
        nom3=nom3.intern();
        if(nom==nom3){
            System.out.println("nom pointe vers le meme string que nom2");
        }else {
            System.out.println("nom ne pointe pas vers le meme string que nom2");
        }

    }
}
