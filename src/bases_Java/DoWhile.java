package bases_Java;

public class DoWhile {

    public static void main(String[] args) {
        int age =23;
        // On rentre jamais dans la boucle parce que le test qui s'excute en premier
        //while
        while(age<18){
            System.out.println("inferieur:--- while(condition){....}");
        }


        // la boucle va toujours s'excuter au moins une fois meme si la condition n'est pas evaluee

        do {
            System.out.println("inferieur:--- do {.........} while(condition)");

        } while(age<18);
    }
}
