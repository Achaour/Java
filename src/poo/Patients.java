package poo;

import java.nio.channels.FileLock;

public class Patients {

    private String firstName;
    private String lastName;
    private float taille;
    private  float poids ;

    public Patients(String firstName, String lastName, float taille, float poids){
        this.firstName=firstName;
        this.lastName=lastName;
        this.taille=taille;
        this.poids=poids;
    }

    public Patients(){
        this.firstName="";
        this.lastName="";
        this.taille=0.0F;
        this.poids=0.0F;
    }

    public String getFirstName() { return firstName;}
    public String getLastName() { return lastName;}
    public float getTaille() {return taille;}
    public float getPoids() {return poids;}


    public void setFirstName( String firstName) {this.firstName=firstName;}
    public void setLastName( String lastName) {this.lastName=lastName;}
    public void setTaille( float taille) {this.taille=taille;}
    public void setPoids( float poids) {this.poids=poids;}



    public float iMC(){
        return poids/(taille*taille);

    }

    public String toString() {

        return String.format("Fiche patient : \n nom: %s\n nom: %s\nTaille: %s\nPoids: ",this.firstName,
                this.lastName,this.taille,this.poids);

    }
}
