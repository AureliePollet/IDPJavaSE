package fr.dawan.formation.exercices;
import java.util.Arrays;

public class TableauDeuxDimensions {
    
    static double average(int[] grades) {
        int sum = 0;
        int good_grades = 0;
        for(int grade : grades) {
            if(grade >= 0 && grade <= 20) {
                sum += grade;
                good_grades++;
            }
            
        } 
        return sum / good_grades;
    }
    
    static double average(double[] grades) {
        int sum = 0;
        int good_grades = 0;
        for(double grade : grades) {
            if(grade >= 0 && grade <= 20) {
                sum += grade;
                good_grades++;
            }
            
        } 
        return sum / good_grades;
    }
    
    
    
    static double mediane(int[] grades) {  
        Arrays.sort(grades);
        if(grades.length % 2 != 0) { // Impaire
            int index = (int) Math.floor(grades.length / 2); 
            return grades[index];
        } else { // paire
            int indexUp = grades.length /2;
            int indexDown = indexUp - 1;
            return (grades[indexUp] + grades[indexDown]) / 2;
        }  
    }
    

    public static void main(String[] args) {
        int[] notes = {  -1, 0, 2, 15, 18, 20, 25,};   
        System.out.println( "Moyenne : " + average(notes) );
        System.out.println("Mediane : " + mediane(notes));
        System.out.println("------------");

        int[][] group = {
                {10, 12, 8, 13, 7},
                {17, 18, 19, 16},
                {0, 2, 1, 4, 2}
            };
        
        
        double[] all_moyennes = new double[group.length];
        
        for(int i = 0; i < group.length; i++) {
            double mo = average(group[i]);
            all_moyennes[i] = mo;
            System.out.println("Eléve " + i + " moyenne:" + mo + ", mediane : " + mediane(group[i]));
            System.out.println("------------");
        }
        
        System.out.println("Moyenne de classe : " + average(all_moyennes));
        
    }

}













