public class Nombre {
    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARICSZ
     * Date de dernière modification : 2024-05-18
     */

    private int valeurNombre;

    public Nombre(int nombre){
        this.valeurNombre=nombre;
    }

    public int valeur(){
        return this.valeurNombre;
    }

    public String toString(){
        return ("Le nombre est :" + this.valeurNombre);
    }
}
