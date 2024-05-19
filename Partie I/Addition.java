public class Addition extends Operation {
    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès Marcisz
     * Date de dernière modification : 2024-05-18
     */

    public Addition (Nombre  nombre1, Nombre nombre2){
        super (nombre1, nombre2) ;
    }

    public int Valeur (){
        return this.getOperande1() + this.getOperande2() ;
    }

    public String toString (){
        return "(" + this.getOperande1() + " + " + this.getOperande2() + ")" + "=";
    }
}
