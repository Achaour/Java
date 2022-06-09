import java.util.Scanner;

public class Exercice7 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Entrez un nombre entier : ");
        int nombre=input.nextInt();
/*
        boolean isPositive = nombre>0;
        boolean isEven= nombre%2==0;

        String estPostive=isPositive?"Positif":"Negatif";
        String estPair=isEven?"pair":"impair";

        System.out.println(" le nombre est %s  %s",estPos);
*/




        if(nombre>0){
            if (nombre % 2 == 0) {
                System.out.println("Le nombre est positif et pair");

            }else
                System.out.println("Le nombre est positif et impair");
        }else if (nombre<0) {
            if (nombre % 2 == 0) {
                System.out.println("Le nombre est negatif et pair");

            }else
                System.out.println("Le nombre est negatif et impair");



        }else
            System.out.println("Le nombre est zéro (et il est pair)");





    }


}
