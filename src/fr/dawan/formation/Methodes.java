package fr.dawan.formation;

public class Methodes {

    public static void main(String[] args) {

        multiply(1);
        multiply(30,20,79,9);

    }

    // public: portée de la méthode (défaut protected)
    // int : type de retour. Si pas de retour void
    public int sum(int a, int b) {
        return a + b;
    }

    // pour mettre autant des parametres qu'on voudrait
    public static int multiply( int ...values) {
        // values = int[], ...values transforme les types des données dans des tableaux (int, String, double,...)
        return 0;
    }

    public void sayHello() {
        System.out.println("Hello World ! ");
    }


    //le premier return s'arrete et continue a faire les autres
    public boolean checkSomething (int truc) {
        if(truc < 0) {
            System.out.println("Nombre invalide");
            return false;
        }
        return true;
    }




}