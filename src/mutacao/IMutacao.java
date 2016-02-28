package mutacao;

import cromossomo.ICromossomo;

/**
 * Created by alanssantos on 2/27/16.
 */
public interface IMutacao {

    public void mutar(ICromossomo cromossomo, double taxa);
}
