import java.sql.SQLOutput;

public class Conditions {
    public static void main(String[] args) {
        // Declaration de la variable
        byte age=19;

        //Test condition
        //Si age >=18 alors
        //Afficher "vous etes majeur, et pouvez donc participer
        //fin si
        //sinon
        //Afficher " vous etes mineur, et vous pouvez pas
        //Fin sin
        if (age>=18){
            System.out.println("vous etes majeur et vous pouvez participer");
        }else {
            System.out.println("Vous etes pas majeur");
        }

        String pays="Maroc";
        if(pays=="France"){
            System.out.println("Bonjour");

        } else if (pays=="Allemagne") {
            System.out.println("Guten Tag");


        } else if (pays=="Espagne") {
            System.out.println("Hola");

        } else if (pays=="Chine") {
            System.out.println("Ninhau");


        } else  {
            System.out.println("le pays fourni n'est pas supporte");

        }

        System.out.println("élève");
    }
}
