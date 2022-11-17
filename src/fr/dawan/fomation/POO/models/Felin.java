package fr.dawan.fomation.POO.models;

import fr.dawan.fomation.POO.enums.Peau;

public class Felin extends Animal {
    
    private boolean sociable;
    private boolean hasGriffesRetractiles;
    
    
    public Felin() {
        super();
        this.setPelage(Peau.FOURRURE);
    }
    
    public Felin(String name,String color,int age) {
        super(name,color,age,4); 
        this.setPelage(Peau.FOURRURE);
    } 
    
    public Felin(String name,int age, String color,boolean sociable,boolean griffes) {
        super(name,color,age);      
        this.sociable=sociable;
        this.hasGriffesRetractiles=griffes;
        this.setPelage(Peau.FOURRURE);

    }
    
    @Override
    public void crier() {
        System.out.println("Graou Graou");
    }

    public boolean isSociable() {
        return sociable;
    }

    public void setSociable(boolean sociable) {
        this.sociable = sociable;
    }

    public boolean isHasGriffesRetractiles() {
        return hasGriffesRetractiles;
    }

    public void setHasGriffesRetractiles(boolean hasGriffesRetractiles) {
        this.hasGriffesRetractiles = hasGriffesRetractiles;
    }
    
    
    
    

}
