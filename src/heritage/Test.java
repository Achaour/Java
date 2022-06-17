package heritage;

import inheritance.Guerrier;
import jdk.swing.interop.SwingInterOpUtils;

public class Test {
    public static void main(String[] args) {

        Voiture renault1=new Voiture(1998,18000);
        Voiture renault2=new Voiture(1999,16000);

        Camion camion1=new Camion(2002,30000);
        Camion camion2=new Camion(2003,30000);




        System.out.println("les info de Renault 1 : ");
        System.out.println(renault1);

        renault1.demarrer();
        renault2.demarrer();

        System.out.println("les info de Renault 2 : ");
        System.out.println(renault2);

        renault1.accelerer();
        renault2.accelerer();

        System.out.println("les info de camion1 : ");
        System.out.println(camion1);

        camion1.demarrer();
        camion2.demarrer();

        System.out.println("les info de camion1 : ");
        System.out.println(camion2);

        camion1.accelerer();
        camion2.accelerer();




    }
}
