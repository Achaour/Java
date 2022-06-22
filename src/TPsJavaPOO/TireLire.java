package TPsJavaPOO;

import java.util.Scanner;

public class TireLire {

    double montant;

    double getMontant(){
        return montant;
    }
    public void afficher(){

        if (montant==0){
            System.out.println("Vous etes sans le sou! ");
        }else {
            System.out.printf("Vous avez : %.2f euros dans votre tirelire.\n",montant);
        }

    }

    public void secouer(){

        if (getMontant()>0){
            System.out.println("Bing bing \n");
        }else {
        }
    }

    public double remplir( double montantDonnee){

        double sommeTirelire=0;
        if (montantDonnee>0){
            sommeTirelire= montant+montantDonnee;
        }
            return sommeTirelire;
        }

    public double vider(){

        montant=0;

        return montant;
    }
    public void puiser(double puiserMontant){

        if (puiserMontant<0){

        } else if (puiserMontant>montant) {
            vider();
        }
    }
    public double calculSolde(double budget){

        if (budget<=0){
            return montant;

        } else  {
            return montant-budget;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        TireLire tireLire = new TireLire();

        tireLire.afficher();
        tireLire.afficher();

        tireLire.montant=550;
        tireLire.secouer();
        tireLire.afficher();

        System.out.println("Donnez le budget de vos vacances :");

        double budget= input.nextDouble();
        System.out.printf("le budget de vos vacances : %.2f \n",budget);

        double solde= tireLire.calculSolde(budget);

       if(solde>0) {

           System.out.printf(" Vous êtes assez riche pour partir en vacances ! il vous restera %.2f euros à la rentrée \n",solde);
       } else if (solde==0) {

           System.out.println(" Vous etes un genie");

       }else {
           System.out.printf("Il vous manque %.2f euros pour partir en vacances !",-solde);
       }


    }
}

