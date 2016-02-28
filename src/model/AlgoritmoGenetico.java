package model;

import cromossomo.ICromossomo;
import crossover.ICrossover;
import mutacao.IMutacao;
import selecao.ISelecao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public class AlgoritmoGenetico {

    private List<ICromossomo> populacao;
    private int numPopulacao;
    private ISelecao selecao;
    private IMutacao mutacao;
    private ICrossover crossover;

    private int numIteracao;
    private int interacao = 0;

    private ICromossomo theBest = null;

    private int tamBar;

    public AlgoritmoGenetico(List<ICromossomo> populacao, ISelecao selecao, IMutacao mutacao, ICrossover crossover, int tamBar, int numIteracao) {
        this.populacao = populacao;
        this.numIteracao = populacao.size();
        this.selecao = selecao;
        this.mutacao = mutacao;
        this.crossover = crossover;
        this.tamBar = tamBar;
        this.numIteracao = numIteracao;

        theBest = populacao.get(0);
    }

    public ICromossomo run() {
        while (!parada()) {
            avaliacao();
            novaPopulacao();
            interacao++;
        }
        return theBest;
    }

    public void avaliacao() {
        for (ICromossomo cromossomo : populacao) {
            if (cromossomo.getFunc(tamBar) < theBest.getFunc(tamBar)) {
                theBest = cromossomo;
            }
        }
    }

    public boolean parada() {
        return interacao > numIteracao ? true : false;
    }

    public void novaPopulacao() {
        List<ICromossomo> nPopulacao = new ArrayList<>();

        while (nPopulacao.size() < numPopulacao) {
            ICromossomo c1 = selecao.selecionar(populacao, tamBar);
            ICromossomo c2 = selecao.selecionar(populacao, tamBar);
            while (!c2.equals(c1)) {
                c2 = selecao.selecionar(populacao, tamBar);
            }

            List<ICromossomo> prole = crossover.crossover(c1, c2);

            mutacao.mutar(prole.get(0), 0.05);
            mutacao.mutar(prole.get(1), 0.05);

            nPopulacao.addAll(prole);
        }

    }


}
