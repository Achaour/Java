package bases_Java;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Scanner;

public class Tp21 {
    public static void main(String[] args) {
        var input =new Scanner(System.in);

        System.out.println("Combien de langages souhaitez-vous ajouter ?");
        int nombreDeLangages=input.nextInt();

        input.nextLine();
        HashMap<String,String> langages=new HashMap<>();

        for (int i = 1; i < nombreDeLangages; i++) {
            if(i==1){
                System.out.printf("inserer le %der:",i);

            }else {
                System.out.printf("inserer le %deme:",i);

            }

            String langage=input.nextLine();
            langages.put(langage,langage);

        }

        System.out.println(langages);

        System.out.println("quel langage souhaitez-vous supprimer ?");
        String langageASupprimer=input.nextLine();
        langages.remove(langageASupprimer);

        System.out.println("Apres la suppression");
        System.out.println(langages);

    }
}

