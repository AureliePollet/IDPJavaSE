package fr.dawan.formation;

import java.util.Scanner;

public class TypeString {

    public static void main(String[] args) {

        /*
         * Les caractères: type primitif
         * 
         * type char:
         *      16 bits/ 2 octets
         *      accepte 1 lettre (un caractere)
         *      caractère unicode
         *      caractère hexadecimal
         *      valeur par défaut: 'a'
         *      
         * 
         */
        
        char a= 'a'; // on utilise des simples quotes
        
        System.out.println(a);
        
        a=0x00061; // 'a' en hexadecimal
        a='\u0061'; // 'a' en unicode
        
        System.out.println(a); // a
        a++;
        System.out.println(a); // b
        
        /* Caractères d'échappement
         * 
         * Certains caractères servent à passer des instructions particulières au compiler
         * Ces caractères sont précédes d'un backslash \ qui sert à les échapper
         * Echapper: modifier son sens classique
         * 
         * 
         */
        char quote= '\''; // le caractère '
        String guillemet = "\""; // le caractère "
        char backslash= '\\'; // le caractère \
        
        char esc='n'; // caractère n
        esc= '\n'; // saut de ligne
        
        /*
         * \n :new line
         * \t : tabulation
         * ...
         * 
         */
        
        
        
        /*
         * Les Strings: chaîne de caractères
         * 
         * 
         * 
         * 
         */
        
        String name="Jane Doe";
        String greetings="Bonjour";
        
        //concaténation
        System.out.println(greetings+ " "+name);// 3 strings collés
        
        int age= 121;
        
        System.out.println(name + " a "+age+ " ans ");
        //le caste d'un int vers une String est implicite donc ok
        
        // int nope = (int) name;
        // on ne peut pas caster une string en int
        
        /* String est une classe
         * Elle nous offre différentes méthodes:
         * 
         * 
         */
         
        System.out.println(name.toUpperCase()); // MAJUSCULES
        System.out.println(name); // non modifié
        System.out.println(name.toLowerCase());// minuscules
        System.out.println(name.length()); // taille de la string
        System.out.println(name.equals(greetings)); // retourne true ou false
        System.out.println(name.compareTo("Jane Doe ! "));//-2 name a 2 caractère différents de la chaine comparée
        System.out.println(name.compareToIgnoreCase("Jane doe")); // 0 ne prend pas en compte majuscule, minuscule
        
        String [] splitted= name.split(" "); // ["Jane", "Doe"]
        splitted=name.split(""); // coupe caractère par caractère ["J","a","n",...]
        
        String sub= name.substring(5); // va chercher a partir du caractère 5 tout le reste de la chaine
        System.out.println(sub); // Doe
        
        System.out.println(name.charAt(0)); // J
        System.out.println(name.indexOf("e"));// va chercher l'index du 1er char trouvé correspondant
        
        Scanner scan= new Scanner (System.in);
        System.out.println("Entrez votre prénom");
        
        String firstname=scan.next();
        String lastname=scan.next();
        
        scan.nextLine(); // retour à la ligne
        
        System.out.println("Bonjour "+ firstname+ " "+lastname);
        
        System.out.println("Entrez votre prénom (again)");
        
        String username=scan.nextLine();
        
        System.out.println("Vous êtes "+ username);
        
        System.out.println("Age?");
        int userage=scan.nextInt();
        
        System.out.println("Vous avez "+ userage+ " ans");

        
        
        
    }

}
