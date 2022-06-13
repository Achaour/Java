public class StringMethodes {
    public static void main(String[] args) {
        String nom="Meava";
        System.out.println(nom.charAt(2));// acceder à un caracetre du tableau

        // CharAT retourne
        // parcourir un string caractere par carectere

        System.out.println("iteration sur les caracteres\n ===========");

        for (int i = 0; i <=nom.length()-1; i++) {
            System.out.println(nom.charAt(i));

        }
            System.out.println(nom.indexOf('a'));
    //retourne la premiere occurence de l'index du caractere passe en arguement

    // remplacement des caracteres
        String nom2="abracadabra";
        System.out.println(nom2.replace('a','*'));


    // Extraire une sous chaine
    String chaine="Christian Lisangola";
    String chaine2= chaine.substring(2,8);//[2,8[
    System.out.println(chaine2);

    }
}


