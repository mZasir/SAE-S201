public class Nombre {

    /**
     * Nom du projet : Calculatrice SAE R201
     * Auteurs : Zasir MOINOOTHEEN et Inès MARCISZ
     */

    private int valeurNombre;

    public Nombre(int nombre){
        this.valeurNombre = nombre;
    }

    public int valeur(){
        return this.valeurNombre;
    }

    public String toString(){
        return ("Le nombre est :" + this.valeurNombre);
    }

}
