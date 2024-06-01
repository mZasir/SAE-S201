public abstract class Operation extends Expression{
    
    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARCISZ
     */

    private Expression operande_1;
    private Expression operande_2;

    public Operation(Expression op1, Expression op2){
        this.operande_1 = op1;
        this.operande_2 = op2;
    }

    public abstract double valeur();

    public Expression getOperande1(){
        return this.operande_1;
    }

    public Expression getOperande2(){
        return this.operande_2;
    }
}