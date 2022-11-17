package fr.dawan.fomation.POO.models;

import fr.dawan.fomation.POO.enums.Peau;

// abstract= on ne peut pas créer de classe animal
abstract public class Animal {
    // POJO: Plain Old Java Object -> Classe sans restriction
    // Java Beans (type de POJO) -> classe qui contient un constructor, attributs en privé, getters/setters, serializable(envoyer les objets plus facilement)
    // Bonne pratique, convention d'écriture

    /*
     * Les portées:
     * Public -> utilisable dans tous les projet
     * Private-> utilisable dans la classe
     * Protected-> utilisable dans le package
     * par défaut: protected
     */


    private int nbLegs, age;
    private String color, name;
    private Peau pelage;
    private static int count=0;
    //tout ce qui est static se refere à la classe et non au objet

    public Animal() {
        count++;

    }

    public Animal (String name, String color, int age) {
        this.name=name;
        this.color=color;
        this.age=age;
        count++;
    }
    
    


    public Animal( String name, String color,int age, int nbLegs) {
        
        this.name = name;
        this.color = color;
        this.age = age;
        this.nbLegs = nbLegs;
        count++;
    }
    
    

    public void manger() {

        System.out.println(this.name+ " dit Miam Miam");
    }
    
    
    public void switchPelage() {
        
        switch(this.pelage) {
        
        case FOURRURE:
            System.out.println("perd ses poils partouts");
            break;
        case ECAILLES:
            System.out.println("Pas agréable à caresser");
            break;
        case CARAPACES:
            System.out.println("Change de carapace tous les 4 matins!");
            break;
            
        default:
            System.out.println("plus d'idées");
            break;
        }
    }
    
    public abstract void crier(); // abstract quand on a pas trop de détail sur la méthode
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0) {
            this.age=age;
        } 
    }

    public int getNbLegs() {
        return nbLegs;
    }

    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Peau getPelage() {
        return pelage;
    }

    public void setPelage(Peau pelage) {
        this.pelage = pelage;
    }

    public static int getCount() {
        return count;
    }

  


}
