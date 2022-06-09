import java.util.Scanner;

public class ConstantesEtVar {
    public static void main(String[] args) {

        var input= new Scanner(System.in);

        // constante : une fois declaree la valeur ne peut plus chnager
        final double g=9.8;

        // declaration par inference
        var age1=22;

        //pays="France";
        int age=89; // 1 - declaration sans initialisation
        age=17;

        double poids=85.5; // declaration avec initialisation

    }
}
