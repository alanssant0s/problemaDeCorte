package selecao;

import cromossomo.ICromossomo;

import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public interface ISelecao {

    public ICromossomo selecionar(List<ICromossomo> cromossomos, int tamBar);
}
