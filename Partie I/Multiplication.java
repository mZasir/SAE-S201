public class Multiplication extends Operation {

    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARCISZ
     */

    public Multiplication (Nombre  nombre1, Nombre nombre2){
        super (nombre1, nombre2) ;
    }

    public int valeur (){
        return this.getOperande1().valeur() * this.getOperande2().valeur() ;
    }

    public String toString (){
        return "(" + this.getOperande1().valeur() + "*" + this.getOperande2().valeur() + ")";
    }
}
