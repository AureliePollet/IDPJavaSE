package fr.dawan.fomation.POO.models;

import fr.dawan.fomation.POO.interfaces.EstDomestique;

//final= ne pourra plus être hérité par la suite

public final class Chat extends Felin implements EstDomestique {
    
    private static int count=0;
    
    
    public Chat () {
      count++;
    }

    public Chat(String name,String color, int age) {
        super(name, age, color, true, true);
        count++;
    }

    @Override
    public void crier() {
        System.out.println("Miaou Miaou");
    }
    
    public void demanderCroquettes() {
        
        System.out.println("Nourris moi, humain-e !");
    }

    @Override
    public void demanderDesCaresses() {
        System.out.println("Tu approches ta main, je te bouffe!");        
    }

    @Override
    public void jouerALaBalle() {
        System.out.println("va chercher la balle humain!");
    }
 
    public static int getCount() {
        return count;
    }
    

}
