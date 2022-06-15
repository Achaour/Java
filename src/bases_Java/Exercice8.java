package bases_Java;

import java.util.Scanner;
public class Exercice8 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        double a=input.nextDouble();

        System.out.print("Entrez la valeur de b : ");
        double b=input.nextDouble();

        System.out.print("Entrez la valeur de c : ");
        double c=input.nextDouble();

        double delta=(b*b-4*a*c);
        System.out.printf("La valeur de delta est %.2f ",delta);

        if (a==0){
            System.out.println("il s'agit pas d'une  equation de degré 2");
        }else if (delta<0){
            System.out.printf("l'equation %.2f X^2+%.2f X+%.2f n'a pas de solution réelle",a,b,c);
        } else if (delta==0) {
            System.out.printf("l'equation %.2fX^2+%.2fX+%.2f  a une solution unique %.2f ",a,b,c,-b/(2*a));
        }else
            System.out.printf("l'equation %.2fX^2+%.2fX+%.2f a deux solutions distncts %.2f %.2f ",a,b,c,(-b-Math.sqrt(delta))/(2*a),(-b+Math.sqrt(delta))/(2*a));

    }
}
