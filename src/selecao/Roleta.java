package selecao;

import cromossomo.ICromossomo;

import java.util.List;
import java.util.Random;

/**
 * Created by alanssantos on 2/27/16.
 */
public class Roleta implements ISelecao {

    public ICromossomo selecionar(List<ICromossomo> cromossomos, int tamBar) {
        Random gerador = new Random();
        double rand = gerador.nextDouble();

        int sum = 0;

        for (ICromossomo cromossomo : cromossomos) {
            sum += cromossomo.getFunc(tamBar);
        }

        float aux = 0;
        for (ICromossomo cromossomo : cromossomos) {
            double atual = cromossomo.getFunc(tamBar) / (double) sum;
            if (aux >= rand && rand <= (aux + atual))
                return cromossomo;
            aux += atual;
        }

        return null;
    }

}
