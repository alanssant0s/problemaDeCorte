package populacaoinicial;

import cromossomo.ICromossomo;
import model.Corte;

import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public interface IPopulacaoInicial {

    public List<ICromossomo> make(int tamMax, List<Corte> cortes, int numPop);
}
