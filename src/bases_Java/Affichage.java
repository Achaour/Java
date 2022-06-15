package bases_Java;

public class Affichage {
    public static void main(String[] args) {
        String nom="Achaour";
        String prenom="Mansour";
        char genre='M';
        byte age=12;
        float poids=75.25F;
        boolean estMarie=false;
       // System.out.println("Vous vous appelez "+ nom+ ",vous avez "+age +" ans. Poids " +poids+ "Kg");

       // System.out.printf("Vous vous appelez %s  %s   %c, vous avez %d ans.Poids: %.3f\n",nom,prenom,genre,age,poids);
        //System.out.printf("Vous vous appelez %s, vous avez %d ans.Poids: %f",nom,age,poids);
       // System.out.printf("Nom: %s\nPrenom: %s\nAge: %d\nPoids: %.3f\n",nom,prenom,age,poids);

        //Avec operateur ternaire:

        //System.out.printf("Vous vous appelez %s %s, vous avez %d ans et vous %s\n",nom,prenom,age,estMarie?"etes marie":"n'etes pas marie");

        //Sans operateur ternaire:
        String etatMaritalAfficher=estMarie?"est marie":"n'etes pas marie";
        System.out.printf("Vous vous appelez %s %s, vous avez %d ans et vous %s\n",nom,prenom,age,etatMaritalAfficher);

    }
}
