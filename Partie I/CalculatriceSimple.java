public class CalculatriceSimple {
    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARCISZ
     */
    public static void main (String args[]){
        try {
        Nombre six = new Nombre(6) ;
        Nombre dix = new Nombre(10) ;
        Operation s = new Soustraction(dix, six) ;
        System.out.println(s + " = " + s.valeur()) ; // doit afficher : (10 – 6) = 4

        Nombre vingt_cinq = new Nombre(25) ;
        Nombre vingt_huit = new Nombre(28) ;
        Operation add = new Addition(vingt_cinq, vingt_huit) ;
        System.out.println(add + " = " + add.valeur()) ; // doit afficher : (25 + 28) = 53

        Nombre neuf = new Nombre(9) ;
        Multiplication mult = new Multiplication(neuf, neuf) ;
        System.out.println(mult + " = " + mult.valeur()) ; // doit afficher : (9 * 9) = 81

        Nombre zero = new Nombre(0) ;
        Nombre sept = new Nombre(7) ;

        try {
            Operation div2 = new Division(sept, zero) ;
            System.out.println(div2 + " = " + div2.valeur()) ; 
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
        Operation div = new Division(zero, sept) ;
        System.out.println(div + " = " + div.valeur()) ; // doit afficher : (0 / 7) = 0

        } catch (Exception e) {
            System.out.println("Il y a eu une erreur : " + e) ;
        }

    }
}
