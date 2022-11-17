package fr.dawan.formation;

public class Numbers {

    public static void main(String[] args) {

        /*
         * Numbers: type primitifs:
         * 
         * 
         * Nom:                  Taille:                     valeur                  défaut
         * 
         * Entiers: 
         *
         * byte                  8 bits/ 1 octet           -128 à 127                  0
         * short                16 bits/ 2 octets          -2(15) à +2(15)-1           0
         * int                  32 bits/ 4 octets          -2(31) à 2(31)-1            0
         * long                 64 bits/ 8 octets          -2(63) à +2(63)-1           0L
         * 
         * 
         * Flottants (virgule)  
         * float                32 bits/ 4 octets       -1.4*10(-45) à 3.5*10(38)      0.0f
         * double               64 bits/ 8 octets       -4.9*10(-324) à 1.7*10(308)    0.0d        
         *        
         * 
         */


        byte by=125;
        int a=10;
        int b= by; //caste automatiquement la valeur de by en integer

        System.out.println(b);

        //    byte b3=b;  impossible car potentiellement b est plus grand qu'un byte
        // on peut caster vers un type plus grand mais pas le contraire
        // on peut caster un entier en double
        //on dit alors que le castage est implicite
        
        double db=b;
        System.out.println(db);

        float f= 123.589f;
        int c= (int) f; // possible si on caste mais perte de précision, enlève les chiffres apres virgule
        System.out.println(c);
        
        
        /*
         * Opérateurs de calculs:
         * + addition
         * - soustraction
         * * multiplication
         * / division
         * % modulo 
         * 
         * 
         * Le résultat d'une opération est considérée comme une valeur
         * => on enregistre non pas l'opération mais son résultat.
         * 
         */
        
        System.out.println(1+1); // affiche 2
        
        int d = 321+12 / 78*3-1;
        System.out.println(d);
        
        d=(1+1) * 3; 
        System.out.println(d);
        
        // les calculs fonctionnent comme avec une calculatrice, même ordre de priorité
        
        d=10;
        d=d+1;
        d++; // incrémentation
        d= d-1;
        d--; // décrémentation
        
        d=d*1;
        d*=1;
        d+=2;
        d-=2;
        d/=1;
        d%=1;
        d=10;
        
        System.out.println(d++); //10 affiche d puis fait d+1
        System.out.println(d); // 11
        
        System.out.println(++d); // 12, incrémente d, puis l'affiche
        
      
        /*
         * On peut faire des opérations entre les types, cependant:
         * 
         *Il faut caster le résultat vers le type le plus grand et précis
         *
         *Dans le cas contraire, il faudra le faire explicitement et on prend le risque de perdre en précision
         *
         * 
         */
        
        double encoreUnDouble= d+ 1.5; // ok: castage implicite
        int encoreUnInt= (int) (d+ 1.5);// ok mais a ne pas faire car perte de données: castage explicite
        
       
        
        int z=3;
        int y=z;
        z=2;
        
        System.out.println(y); // 3
        
        
    }

}
