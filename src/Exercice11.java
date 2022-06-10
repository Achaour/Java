import java.math.BigInteger;
import java.util.Scanner;

public class Exercice11 {

    public static void main(String[] args) {
       // BigInteger

        var scanner = new Scanner(System.in);
        var input = new Scanner(System.in);
        System.out.println(" Choisissez une valeur ");
        var nombre = input.nextInt();
        //var nombre = input.nextInt();

        int facto = 1;
        //int facto=1;
        if (nombre == 0) {
            System.out.printf("Factorielle de %d est %d", nombre, 1);

        } else if (nombre <0) {
            System.out.printf("Factorielle de %d n'est pas definie",nombre);
        } else {
            for (int i = 1; i <= nombre; i++) {
                facto = facto * i;
                if (i==nombre){
                    System.out.printf("%d  ",i);
                } else
                    System.out.printf("%d * ",i);
            }

            System.out.printf("\n Factorielle de %d est %d ", nombre, facto);
        }
    }
}

