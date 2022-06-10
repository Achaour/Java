import java.util.Scanner;

public class Exercice12 {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var input = new Scanner(System.in);
        System.out.println(" Choisissez une valeur ");
        var nombre = input.nextInt();
        System.out.printf("les dix nombres suivants de %d\n sont ",nombre);

        for (int i=1;i<=10;i++){
            System.out.println(i+1);
        }

    }

}
