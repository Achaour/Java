package bases_Java;

import java.util.Scanner;

public class Exercice10 {

    public static void main(String[] args) {

        var Scanner=new Scanner(System.in);
        var input=new Scanner(System.in);

        System.out.println("Debut");
        var nombreDebut=input.nextInt();
        System.out.println("Fin");
        var nombreFin=input.nextInt();
      //  var nombre=input.nextInt();

        for (int i=1; i<=10;i++) {
            for (int j = nombreDebut; j <= nombreFin; j++) {
                System.out.printf("%d * %d = %d\n ", i, j, i * j);
            }
            System.out.printf("table %d :: debut %d fin %d  ",i,nombreDebut,nombreFin);
        }
    }
}
