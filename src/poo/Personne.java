package poo;

public class Personne {

    private String firstName;
    private String lastName;
    private String pays;
    private boolean married;
    private byte nombreEnfants;

    public Personne(String firstName, String lastName,String pays,boolean married,byte nombreEnfants){
        this.firstName=firstName;
        this.lastName=lastName;
        this.pays=pays;
        this.married=married;
        this.nombreEnfants=nombreEnfants;
    }

    public Personne(){
        this.firstName="";
        this.lastName="";
        this.pays="Maroc";
        this.married=false;
        this.nombreEnfants=0;


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getPays() {
        return pays;
    }
    public boolean getMarried() {
        return married;
    }
    public byte getNombreEnfants() {
        return nombreEnfants;
    }

    public void setFirstName( String firstName) {
        this.firstName=firstName;
    }
    public void setLastName( String lastName) {
        this.lastName=lastName;
    }

    public void setPays( String pays) {
        this.pays=pays;
    }

    public void setMarried( boolean married) {
        this.married=married;
    }

    public void setNombreEnfants( Byte nombreEnfants) {
        this.nombreEnfants=nombreEnfants;
    }







    public String nomComplet(){
        return (firstName +" " + lastName);
    }
}
