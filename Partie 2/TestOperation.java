public class TestOperation {
    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARCISZ
     */
    public static void main (String args[]){
        try { 
        Expression huit = new Nombre(8) ;
        Expression onze = new Nombre(11) ;
        Expression cinq = new Nombre(15 ;
        Expression m = new Multiplication(huit, onze) ;
        Expression m2 = new Multiplication (m, cinq) ;
        System.out.println(m2 + "=" + m2.valeur()); // affiche (8 * 11) * 5 = 440

        Expression deux = new Nombre(2) ;
        Expression trois = new Nombre(3) ;
        Expression dixSept = new Nombre(17) ;
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;
        Expression d = new Division(s, a) ;
        System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3 

        Expression zero = new Nombre (0) ;
        Expression d = new Division (m, zero) ;
        System.out.println(d + "=" + d.valeur()) ; 

    } catch (Exception e) {
        System.out.println("Il y a eu une erreur : " + e) ;
        }
    }

    
}
