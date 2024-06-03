public class Division extends Operation{
    
    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARCISZ
     */
    
     public Division(Expression op1, Expression op2) throws ArithmeticException{
        super (op1, op2);
        if (op2.valeur() == 0){
            throw new ArithmeticException ("ERREUR : DIVISION PAR 0 !");
        }
     }

     public double valeur(){
        return this.getOperande1().valeur() / this.getOperande2().valeur();
     }

     public String toString(){
        return "(" + this.getOperande1() + "/" + this.getOperande2() + ")";
     }
}