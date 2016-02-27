package populacaoinicial;

import cromossomo.Cromossomo;
import model.Bar;
import model.Corte;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by alanssantos on 2/27/16.
 */
public class PopulacaoInicial implements IPopulacaoInicial {

    public List<Cromossomo> make(int tamMax, List<Corte> cortes) {
        List<Cromossomo> cromossomos = new ArrayList<>();
        List<Corte> cortesI = new ArrayList<>();
        for (Corte corte : cortes) {
            for (int i = 0; i < corte.quant; i++) {
                cortesI.add(new Corte(corte.tam, 1, corte.numero));
            }
        }
        Random gerador = new Random();
        String genes = "";
        List<Bar> bar = new ArrayList<>();
        bar.add(new Bar(0));
        while (cortesI.size() > 0) {
            int numCorte = gerador.nextInt(cortesI.size());
            int numBar = gerador.nextInt(cortesI.size());
        }


        return cromossomos;
    }

}
