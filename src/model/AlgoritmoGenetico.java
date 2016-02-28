package model;

import avaliacao.IAvaliacao;
import cromossomo.Cromossomo;
import cromossomo.ICromossomo;
import mutacao.IMutacao;
import selecao.ISelecao;

import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public class AlgoritmoGenetico {

    private List<Cromossomo> populacao;
    private ISelecao selecao;
    private IMutacao mutacao;
    private ICromossomo cromossomo;
    private IAvaliacao avaliacao;

    public AlgoritmoGenetico(List<Cromossomo> populacao, ISelecao selecao, IMutacao mutacao, ICromossomo cromossomo, IAvaliacao avaliacao) {
        this.populacao = populacao;
        this.selecao = selecao;
        this.mutacao = mutacao;
        this.cromossomo = cromossomo;
        this.avaliacao = avaliacao;
    }

    
}
