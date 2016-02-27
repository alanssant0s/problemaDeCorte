package crossover;

import config.Utils;
import cromossomo.Cromossomo;
import cromossomo.ICromossomo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by alanssantos on 2/27/16.
 */
public class Crossover implements ICrossover {

    public List<ICromossomo> crossover(ICromossomo cromossomo1, ICromossomo cromossomo2) {
        List<ICromossomo> cromossomos = new ArrayList<>();
        String[] cromo1 = cromossomo1.getGenes().split(";");
        String[] cromo2 = cromossomo2.getGenes().split(";");

        int length = 0;

        if (cromo1.length < cromo2.length)
            length = cromo1.length;
        else
            length = cromo2.length;

        int pcross = 1;


        if (length > 2) {
            Random gerador = new Random();
            pcross = gerador.nextInt(length - 2) + 1;
        }

        for (int i = 0; i < length; i++) {
            if (i >= pcross) {
                String aux = cromo1[i];
                cromo1[i] = cromo2[i];
                cromo2[i] = aux;
            }
        }

        cromossomos.add(new Cromossomo(Utils.mount(cromo1), cromossomo1.getCortes()));
        cromossomos.add(new Cromossomo(Utils.mount(cromo2), cromossomo1.getCortes()));


        return cromossomos;
    }
}
