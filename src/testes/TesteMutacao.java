package testes;

import cromossomo.Cromossomo;
import model.Corte;
import mutacao.Mutacao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public class TesteMutacao {

    public static void main(String args[]) {

        List<Corte> bars = new ArrayList<>();

        bars.add(new Corte(40, 3));
        bars.add(new Corte(20, 4));
        bars.add(new Corte(55, 1));
        bars.add(new Corte(48, 2));
        bars.add(new Corte(5, 5));

        String s1 = "1;1;1;1;1;1;1;1;1;1;1;1;1";
        String s2 = "2;2;2;2;2;2;2;2;2;2;2;2;2";

        Cromossomo cromossomo1 = new Cromossomo(s1, bars);
        Cromossomo cromossomo2 = new Cromossomo(s2, bars);

        Mutacao mutacao = new Mutacao();
        System.out.println(cromossomo1.genes);
        mutacao.mutar(cromossomo1, 1.0);
        System.out.println(cromossomo1.genes);

    }
}
