package fr.dawan.formation.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDeuxDimensions {
    
    static List<Integer> clean(List<Integer> grades_dirty) {
        List<Integer> cleaned = new ArrayList<>();
        for(int g : grades_dirty) {
            if(g >= 0 && g <= 20) {
                cleaned.add(g);
            }
        }
        return cleaned;
    }
    
    static double average(List<Integer> grades) {
        double sum = 0;
        double good_grades = 0;
        for(int grade : grades) {
            sum += grade;
            good_grades++;
        } 
        return sum / good_grades;
    }
      
    
    static double average_all(List<Double> grades) {
        double sum = 0;
        double good_grades = 0;
        for(double grade : grades) {
            sum += grade;
            good_grades++;
        } 
        return sum / good_grades;
    }
    
    static int mediane(List<Integer> grades) {  
        java.util.Collections.sort(grades);
        if(grades.size() % 2 != 0) { // Impaire
            int index = (int) Math.floor(grades.size() / 2); 
            return grades.get(index);
        } else { // paire
            int indexUp = grades.size() /2;
            int indexDown = indexUp - 1;
            return (indexUp + indexDown) / 2;
        }  
    }
 
    

    public static void main(String[] args) {

        
        List<List<Integer>> classe= new ArrayList<>();
       classe.add(new ArrayList<>(Arrays.asList(0,10,20,22)));
       classe.add(new ArrayList<>(Arrays.asList(15,20,19,25)));
       classe.add(new ArrayList<>(Arrays.asList(9,8,15,-1)));
       classe.add(new ArrayList<>(Arrays.asList(14,16,18)));
       classe.add(new ArrayList<>(Arrays.asList(13,10,17)));
       
       List<Double> all_average= new ArrayList<>();

     for (List<Integer> list : classe) {
       List<Integer> cleaned = clean(list);
       double m=average(cleaned);
       double me=mediane(cleaned);
       System.out.println("Moyenne de l'élève:"+m);  
       System.out.println("Médiane de l'élève: "+me);
       System.out.println("-----------------------------------");
       
       all_average.add(m);
    }
     
     System.out.println("Moyenne de tous les élèves: "+ average_all(all_average));
     
    
     
        
    }
    
    }
    
    
