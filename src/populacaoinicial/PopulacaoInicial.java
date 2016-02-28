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

    public List<Cromossomo> make(int tamMax, List<Corte> cortes, int numPop) {
        List<Cromossomo> cromossomos = new ArrayList<>();
        for (int quant = 0; quant < numPop; quant++) {
            List<Corte> cortesI = new ArrayList<>();
            for (Corte corte : cortes) {
                for (int i = 0; i < corte.quant; i++) {
                    cortesI.add(new Corte(corte.tam, 1, corte.numero));
                }
            }
            System.out.println(cortesI);
            Random gerador = new Random();

            String genes = "";
            List<Bar> bar = new ArrayList<>();
            bar.add(new Bar(0));
            while (cortesI.size() > 0) {
                int numCorte = gerador.nextInt(cortesI.size());
                if ((bar.get(bar.size() - 1).consumo + cortesI.get(numCorte).tam) > tamMax) {
                    bar.add(new Bar(0));
                }

                bar.get(bar.size() - 1).consumo += cortesI.get(numCorte).tam;
                bar.get(bar.size() - 1).cortes.add(cortesI.get(numCorte));
                cortesI.remove(numCorte);
            }

            System.out.println(bar);

            for (int i = 0; i < cortes.size(); i++) {
                for (int j = 0; j < bar.size(); j++) {
                    for (int k = 0; k < bar.get(j).cortes.size(); k++) {
                        if (cortes.get(i).numero == bar.get(j).cortes.get(k).numero)
                            genes += j + 1 + ";";
                    }
                }
            }

            genes = genes.substring(0, genes.length() - 1);

            Cromossomo cromossomo = new Cromossomo(genes, cortes);
            cromossomos.add(cromossomo);

        }
        return cromossomos;
    }

}
