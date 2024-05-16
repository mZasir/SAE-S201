public class Nombre {
    private int valeurNombre;

    public Nombre(int nbr){
        this.valeurNombre=nbr;
    }

    public int Valeur(){
        return this.valeurNombre;
    }

    public String toString(){
        return ("Le nombre est :" + this.nbr);
    }
}
