package mutacao;

import config.Utils;
import cromossomo.ICromossomo;

import java.util.Random;

/**
 * Created by alanssantos on 2/27/16.
 */
public class Mutacao implements IMutacao {

    public void mutar(ICromossomo cromossomo, double taxa) {
        Random gerador = new Random();
        double rand = gerador.nextDouble();

        if (rand <= taxa) {
            String[] split = cromossomo.getGenes().split(";");
            int pos = gerador.nextInt(split.length);
            split[pos] = (Integer.valueOf(split[pos]) + 1) + "";
            cromossomo.setGenes(Utils.mount(split));
        }
    }
}
