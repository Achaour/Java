import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercice22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> adressesMail = new ArrayList<String>();



//        while (true) {
//
//            System.out.println("Adresse mail :");
//            String AdresseMailAEntrer = input.nextLine();
//            if (AdresseMailAEntrer.isBlank()) {
//                break;
//            } else {
//                adressesMail.add(AdresseMailAEntrer);//0
//            }
//        }

        adressesMail.add("christian.lisangola@gmail.com");//0
        adressesMail.add("jean.paul@gmail.com");//1
        adressesMail.add("alain@gmail.com");//2
        adressesMail.add("lydie@yahoo.fr");//3
        adressesMail.add("josephine.lajoie@yahoo.com");//4
        adressesMail.add("luise@hotmail.fr");//5
        adressesMail.add("philemon.turion@gmail.com");//6
        adressesMail.add("jules.cesar@hotmail.fr");//7



        String hotmail = "hotmail.fr";
        String gmail = "gmail.com";
        String yahoo= "yahoo.com";
       // String adressesMail1="philemon.turion@gmail.com";
       // String[] words=new String[2];
       // String[] word=new String[2];
      //  System.out.println(Arrays.toString(words));

        int sommeHotmail=0;
        int sommeGmail=0;
        int sommeYahoo=0;

        for (int i = 0; i <adressesMail.size() ; i++) {
            var splitAdresse = (adressesMail.get(i)).split("@");


            if (splitAdresse[1].equals(hotmail)) {
                sommeHotmail = sommeHotmail + 1;

            } else if (splitAdresse[1].equals(gmail)){
                sommeGmail=sommeGmail+1;

            } else if (splitAdresse[1].equals(yahoo)) {
                sommeYahoo=sommeYahoo+1;

            }


            }


        System.out.println(hotmail +"=" +100*sommeHotmail/(sommeGmail+sommeYahoo+sommeHotmail)+"%");
        System.out.println(gmail +"=" + 100*sommeGmail/(sommeGmail+sommeYahoo+sommeHotmail)+"%");
        System.out.println(yahoo +"=" +100*sommeYahoo/(sommeGmail+sommeYahoo+sommeHotmail)+"%");


//        String str = "J'aime le Java";
//        String[] words2 = str.split(" ");
//        System.out.println(""+words2);
//        for (String word : words2) {
//            System.out.println(word);
//        }



    }


}





