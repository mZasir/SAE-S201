public class Nombre extends Expression{

    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARCISZ
     */

    private double valeurNombre;

    public Nombre(int nombre){
        this.valeurNombre = nombre;
    }

    public double valeur(){
        return this.valeurNombre;
    }

    public String toString(){
        return ("Le nombre est :" + this.valeurNombre);
    }

}
