package poo;

public class Rectangle3 {




        private double longueur;
        private double largeur;
// Surchage: La possibilité d'avoir au sein d'une classe plusieurs methodes//
// avec le meme nom, mais differentes,signatures
        public Rectangle3(double longueur, double largeur){
            this.longueur=longueur;
            this.largeur=largeur;

        }

        public Rectangle3(){
            longueur=10;
            largeur=5;
        }

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

        public String toString(){
            return  String.format("[ longueur : %f\nlargeur: %f\nSurface: " +
                    "%f\nPerimetre :]",this.longueur,this.largeur,
                    this.calculDeLaSurface(),this.calculDuPerimetre());

        }


    }

