package poo;

// Quand on ne fournit pas un constructeur
// le constructeur Java invoque un constructeur spécial appelé
// "Le constructeur
public class Rectangle2 {


        private double longueur;
        private double largeur;

        // Accesseurs ou Getter: ce sont des methodes qui nous donnent un accès en lecture
//      // aux membres ou attributs privés

        public double getLongueur() {
            return longueur;

        }

        public double getLargeur(){
            return largeur;
        }
       // Manipulateurs ou setters: Ce sont des methodes qui nous donnent la possibilité
     // de modifier des attributs privés

        public void setLongueur(double longueur){
            this.longueur=longueur;
        }

        // this dans cette situation nous permet d'eviter la shadowing (masquage)
        // le shadowing est fait qu'un parametre de fonction empeche la fonction ou methode
       // de voir l'attribut avant le meme nom.
        public void setLargeur(double largeur ){
            this.largeur=largeur;

        }


        double calculDeLaSurface(){
            return longueur*largeur;
        }

        double calculDuPerimetre(){
            return 2*(longueur+largeur);
        }


    }

