package bases_Java;

public class Exercice4 {
    public static void main(String[] args) {

        // Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
        //

        int a=75;
        int b=876;
        int c=235;
        int d;
        System.out.println("Avant la permutation");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        d=c;
        c=b;
        b=a;
        a=d;
        System.out.println("Apres la permutation");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}
