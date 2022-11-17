package fr.dawan.formation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.dawan.formation.exercices.TableauNoteCollection;

public class Collections {

    public static void maMethode (int value) {
        
        value*=1000;
        System.out.println(value);
        
    }
   
        
        public static void main(String[] args) {
        
        /*
         * Les collections: des classe qui permettent de gérer des listes/tableaux
         * 
         */
        
        int[] arr= {20,30,40};
        Integer [] arr2= new Integer[arr.length];
        
        Arrays.setAll(arr2, i ->arr[i]); // permet de caster un tableau de int en Integer;
        
        List<Integer> collection=  Arrays.asList(arr2);
        
        List<Integer> notes = new ArrayList<>(Arrays.asList(20,15,19));
        
        notes.add(80);
        
        System.out.println("Taille du tableau "+ notes.size());
        
        notes.remove(0);
        
        int index=notes.indexOf(15);
        notes.remove(index);
        
        notes.forEach(note -> {
            System.out.println("Voici la note:" +note);
        });
        
        notes.forEach(System.out::println); // permet d'afficher les note du tableau
        
        notes.forEach(Collections::maMethode);// permet d'afficher une methode de la classe
        
        for(int i=0; i<notes.size();i++) {
            maMethode(notes.get(i));
        }
        
        
    }

}
