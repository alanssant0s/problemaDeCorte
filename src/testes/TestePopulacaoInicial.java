package testes;

import cromossomo.Cromossomo;
import model.Corte;
import mutacao.Mutacao;
import populacaoinicial.PopulacaoInicial;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public class TestePopulacaoInicial {

    public static void main(String args[]) {

        List<Corte> bars = new ArrayList<>();

        bars.add(new Corte(40, 3, 1));
        bars.add(new Corte(20, 4, 2));
        bars.add(new Corte(55, 1, 3));
        bars.add(new Corte(48, 2, 4));
        bars.add(new Corte(5, 5, 5));

        PopulacaoInicial populacaoInicial = new PopulacaoInicial();

        System.out.println(populacaoInicial.make(100, bars, 10));

    }
}
