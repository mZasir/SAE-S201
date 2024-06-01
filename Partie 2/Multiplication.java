import java.beans.Expression;

public class Multiplication extends Operation {

    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARCISZ
     */

    public Multiplication (Expression op1, Expression op2){
        super (op1, op2) ;
    }

    public int valeur (){
        return this.getOperande1().valeur() * this.getOperande2().valeur() ;
    }

    public String toString (){
        return "(" + this.getOperande1().valeur() + "*" + this.getOperande2().valeur() + ")";
    }
}
