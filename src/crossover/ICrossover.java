package crossover;

import cromossomo.ICromossomo;

import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public interface ICrossover {

    public List<ICromossomo> crossover(ICromossomo cromossomo1, ICromossomo cromossomo2);

}
