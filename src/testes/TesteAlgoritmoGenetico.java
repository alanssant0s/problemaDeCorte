package testes;

import crossover.Crossover;
import model.AlgoritmoGenetico;
import model.Corte;
import mutacao.Mutacao;
import populacaoinicial.PopulacaoInicial;
import selecao.Roleta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public class TesteAlgoritmoGenetico {

    public static void main(String args[]) {

        List<Corte> bars = new ArrayList<>();

        bars.add(new Corte(50, 5, 1));
        bars.add(new Corte(10, 10, 2));
        bars.add(new Corte(25, 2, 3));
        bars.add(new Corte(15, 4, 4));
        bars.add(new Corte(60, 1, 5));

        PopulacaoInicial populacaoInicial = new PopulacaoInicial();

        AlgoritmoGenetico algoritmoGenetico = new AlgoritmoGenetico(populacaoInicial.make(100, bars, 50), new Roleta(), new Mutacao(), new Crossover(), 100, 500);

        System.out.println(algoritmoGenetico.run());

    }
}
