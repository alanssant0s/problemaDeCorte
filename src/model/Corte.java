package model;

/**
 * Created by alanssantos on 2/27/16.
 */
public class Corte {

    public int tam;
    public int quant;
    public int numero;

    public Corte(int tam, int quant) {
        this.tam = tam;
        this.quant = quant;
    }

    public Corte(int tam, int quant, int numero) {
        this.tam = tam;
        this.quant = quant;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Corte{" +
                "tam=" + tam +
                ", quant=" + quant +
                ", numero=" + numero +
                '}';
    }
}

