package fr.dawan.fomation.POO.models;

import fr.dawan.fomation.POO.interfaces.EstDomestique;
// on peut implémenter plusieurs interfaces, dans ce cas, niveau syntaxe:
//implements premiereInterface, deuxiemeInterface...
public class Chien extends Animal implements EstDomestique {
    
    @Override
    public void crier() {
        System.out.println("Wouaf Wouaf");
    }

    @Override
    public void demanderDesCaresses() {
        System.out.println("Yeah");        
    }

    @Override
    public void jouerALaBalle() {
        System.out.println("Youpi!");
    }

}
