public class Division extends Operation{
    
    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARCISZ
     */
    
     public Division(Nombre nombre1, Nombre nombre2) throws ArithmeticException{
        super(nombre1, nombre2);
        if (nombre2.valeur() == 0){
            throw new ArithmeticException ("ERREUR : DIVISION PAR 0 !");
        }
     }

     public int valeur(){
        return this.getOperande1().valeur() / this.getOperande2().valeur();
     }

     public String toString(){
<<<<<<< HEAD
        return "(" + this.getOperande1().valeur() + "/" + this.getOperande2().valeur() + ")";
=======
        return "(" + this.getOperande1().valeur() + "/" + this.getOperande2().valeur() + ")" ;
>>>>>>> bafdff805a20311d2ce4446c2d4b3b06c0b0d138
     }
}