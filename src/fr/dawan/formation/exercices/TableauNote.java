package fr.dawan.formation.exercices;


import java.util.Arrays;


public class TableauNote {






    public static void main(String[] args) {

        double[] notes = {15, 10, 9, 19.5, 17,-1,22};

        System.out.println( "La moyenne est: " + moyenne(notes))  ;
       System.out.println("La médiane est :" +mediane(notes)) ;

    }

    public static double moyenne (double [] notes) {


        double somme= 0;
        int compteur=0;

        for (int i = 0; i < notes.length; i++) {
            if(notes[i]>=0 && notes[i]<=20) {
                somme=somme+ notes[i];
                compteur++;
            }  

        }

        return  somme / compteur;
    }


    public static double mediane(double [] notes) {
        
        Arrays.sort(notes); //  Arrays.sort permet de classer dans l'ordre le tableau
        System.out.println(Arrays.toString(notes));
        
        if(notes.length%2!=0) { //impair
            
            int index = (int) Math.floor(notes.length/2); // math.floor arrondit à l'inférieur
            System.out.println("Index "+ index);
            return notes[index];
        }
        else { //pair
            
            int indexUp=notes.length/2;
            int indexDown= indexUp-1;
            
            
            return (indexUp+indexDown)/2;
        }
        

    }

}