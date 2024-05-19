public abstract class Operation {
    
    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARICSZ
     * Date de dernière modification : 2024-05-18
     */

    private Nombre operande_1;
    private Nombre operande_2;

    public Operation(Nombre nombre1, Nombre nombre2){
        this.operande_1 = nombre1;
        this.operande_2 = nombre2;
    }

    public abstract int valeur();

    public Nombre getOperande1(){
        return this.operande_1;
    }

    public Nombre getOperande2(){
        return this.operande_2;
    }
}