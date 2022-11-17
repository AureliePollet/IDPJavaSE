package fr.dawan.formation.exercices;

import java.util.Scanner;

public class GuessTheNumber {

        public static void main(String[] args) {

            Scanner scan= new Scanner(System.in);
            int nombreATrouver= (int) (Math.random() * 100 - 1) ;
            int nombreCherche;

            System.out.println("On joue ? Y : yes || N: no");
            String choix= scan.next();

            while (choix.equals("Y")) {
                do {
                    System.out.println("Devinez un nombre entre 1 et 100: ");
                    nombreCherche= scan.nextInt();

                    if (nombreCherche>nombreATrouver) {

                        System.out.println("Trop haut");

                        if(nombreCherche<=nombreATrouver+10 && nombreCherche>=nombreATrouver+5 ) {
                            System.out.println("On se rapproche...");
                        }
                        if(nombreCherche<=nombreATrouver+5 && nombreCherche>=nombreATrouver+1 ) {
                            System.out.println("ça brule!!!");
                        }

                    }

                    if (nombreCherche<nombreATrouver) {

                        System.out.println("Trop bas");

                        if(nombreCherche>=nombreATrouver-10 && nombreCherche<=nombreATrouver-5 ) {
                            System.out.println("On se rapproche...");
                        }
                        if(nombreCherche>=nombreATrouver-5 && nombreCherche<=nombreATrouver-1 ) {
                            System.out.println("ça brule!!!");
                        }


                    }

                    if (nombreATrouver==nombreCherche) {

                        System.out.println("gagné! ");
                    }





                }
                while(nombreATrouver!=nombreCherche) ;

                System.out.println("On joue ? Y : yes || N: no");
                choix= scan.next().toLowerCase();
            }


}
}