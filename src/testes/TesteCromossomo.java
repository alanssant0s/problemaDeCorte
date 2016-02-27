package testes;

import cromossomo.Cromossomo;
import model.Corte;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public class TesteCromossomo {

    public static void main(String args[]) {

        List<Corte> bars = new ArrayList<>();

        bars.add(new Corte(40, 3));
        bars.add(new Corte(20, 4));
        bars.add(new Corte(55, 1));
        bars.add(new Corte(48, 2));
        bars.add(new Corte(5, 5));

        String s1 = "3;4;2;1;1;2;2;3;1;4;1;1;2;2;3";

        Cromossomo cromossomo1 = new Cromossomo(s1, bars);

        System.out.println(cromossomo1.getFunc(100));

    }
}
