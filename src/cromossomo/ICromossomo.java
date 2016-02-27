package cromossomo;

import model.Corte;

import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public interface ICromossomo {

    public double getFunc(int tamBar);

    public String getGenes();

    public List<Corte> getCortes();

    public void setGenes(String genes);

}

