package fr.dawan.fomation.POO;

import java.util.ArrayList;
import java.util.List;

import fr.dawan.fomation.POO.interfaces.EstDomestique;
import fr.dawan.fomation.POO.models.Animal;
import fr.dawan.fomation.POO.models.Chat;
import fr.dawan.fomation.POO.models.Chien;
import fr.dawan.fomation.POO.models.Felin;

public class Main {

    public static void main(String[] args) {

        Chien chien= new Chien();
        chien.setName("Medor");
        
        Chat chat=new Chat("Cactus","tabby",10);
        System.out.println(chat.getName());
        
        chat.manger();
        chat.crier();
        chien.crier();
        
        Felin felin=new Felin("Jean Michel","roux",103);
        felin.crier();
        chien.demanderDesCaresses();
        chat.demanderCroquettes();
        
        System.out.println(chat.getPelage());
        
        
        System.out.println(Animal.getCount());
        System.out.println(Chat.getCount());
        System.out.println(Felin.getCount());

        chat.switchPelage();
        
        
        //Polymorphisme
        // de type animal mais passe par les constructeur chat et felin pour définir l'objet de type animal
        Animal cat1= new Chat();
        Animal felin1=new Felin();
       
        
        System.out.println(cat1.getPelage());
        System.out.println(felin1.getPelage());
        cat1.crier();
       /*
        * Pas acces aux attributs et méthodes qui ne sont pas
        * de la classe animal
        */
        
        List<Animal> mes_animaux=new ArrayList<>();
        
        mes_animaux.add(felin1);
        mes_animaux.add(cat1);
        mes_animaux.add(chien);// le chien sera caster en animal
        
        EstDomestique chien2= new Chien();
        EstDomestique chat2= new Chat();
        chien2.demanderDesCaresses();
        chat2.jouerALaBalle();
        
        /*
         * C'est le typage de la variable qui défini son type et pas le
         * constructor utilisé
         * Les Objets sont des instances de leur classe mais aussi des classes et
         * interfaces dont ils héritents
         */
      
        System.out.println("Chien est un animal? " +(chien instanceof Animal));
        System.out.println("Chien est un chien? " +(chien instanceof Chien));
        System.out.println("Chien estDomestique? "+ (chien instanceof EstDomestique));
        
        System.out.println("Chien2 est un animal? " +(chien2 instanceof Animal));
        System.out.println("Chien2 est un chien? " +(chien2 instanceof Chien));
        System.out.println("Chien2 estDomestique? "+ (chien2 instanceof EstDomestique));
        

        
        }

}
