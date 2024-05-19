public class CalculatriceSimple {
    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès Marcisz
     */
    public static void main (String args[]){
        Nombre six = new Nombre(6) ;
        Nombre dix = new Nombre(10) ;
        Operation s = new Soustraction(dix, six) ;
        System.out.println(s + " = " + s.valeur()) ; // doit afficher : (10 – 6) = 4

        Nombre a = new Nombre(25) ;
        Nombre b = new Nombre(28) ;
        Operation add = new Addition(a, b) ;
        System.out.println(add + " = " + add.valeur()) ;

        Nombre neuf = new Nombre(9) ;
        Multiplication mult = new Multiplication(neuf, neuf) ;
        System.out.println(mult + " = " + mult.valeur()) ;

        Nombre z = new Nombre(0) ;
        Nombre sept = new Nombre(7) ;
        Operation div = new Division(z, sept) ;
        System.out.println(div + " = " + div.valeur()) ;

    }
}
