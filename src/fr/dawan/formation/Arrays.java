package fr.dawan.formation;

public class Arrays {

    public static void main(String[] args) {

        double [] tab = new double [3];

        System.out.println(tab[0]);

        /* Initialisations par défaut : 
         * double : 0.0
         * int : 0
         * char : \u0000 (null en char)
         * boolean : false
         * référence : null
         */


        tab[0] = 1.5;

        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab de "+i+" = "+tab[i]); 
        }

        //for each, nous pouvons donner des variables locales qui ne modifient pas le tableau

        for(double el : tab) {
            System.out.println("Foreach : "+el);
            el++; //ne modifie pas dans le tableau : "el" est une varaiable locale
        }



        int entiers[] = {1,2,3};  //int[] entiers = int entiers[]

       // System.out.println( entiers[3]); ==> souleve une exception Out of range



        int tablo [][] = new int[3][3];
        // un tableau de 3 lignes, contenant chacune un tableau de 3 zéros



        int tablooo[][] = {{1,2,3},{4},{5,6},{7,8,9,10}}; //les tableaux peuvent avoir différents tailles
        int cinq = tablooo [2][0];
        int sept = tablooo [3][0];

        for (int[] subtablo : tablooo) {  //pour chaque ligne de mon tableau je recupere un tableau
            for (int value : subtablo) {    //pour chaque itération je recupere un entier
                System.out.println(value);
            }
        }





    }

}