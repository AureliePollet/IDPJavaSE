package fr.dawan.formation;

public class TypeBoolean {

    public static void main(String[] args) {

        /*
         * Boolean: true/false
         * 
         * valeur binaire, ne peut avoir que 2 valeurs possibles: vrai ou faux;
         */
        boolean bool =true;
        
        /*
         * Opérateurs conditionnels:
         * == égalité
         * != différence
         * > < supérieur à / inférieur à
         * >= supérieur ou égal
         * <= inférieur ou égal
         * || ou
         * && et
         * ! non logique
         * 
         * 
         */
        
        bool = !bool;
        bool = 4 < 10; //true
        bool =!false; //true
        bool = !(4<10); //false

        bool = 10 == 9 || 10<20; //true
        bool = 10 == 9 && 10< 20; // false

        bool = true == ! false ; // true
        bool = true == !false && !true; //false
        System.out.println(bool);



        String a = "hello world";
        String b = "hello ";

        b += "world";

        System.out.println(a==b); //false : verifie en mémoire


        System.out.println(a.equals(b)); //true  : verifie le contenu de la string
        
        
        
        
        
        
    }

}
