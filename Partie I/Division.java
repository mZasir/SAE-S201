public class Division extends Operation{
    
    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARICSZ
     * Date de dernière modification : 2024-05-19
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
        return "(" + this.getOperande1() + "/" + this.getOperande2() + ")"
                + "=" + this.valeur();
     }
}