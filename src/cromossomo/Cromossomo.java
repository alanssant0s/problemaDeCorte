package cromossomo;

import model.Bar;
import model.Corte;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public class Cromossomo implements ICromossomo {

    public String genes;
    public double func = 0;
    public List<Corte> cortes;

    public Cromossomo(String genes, List<Corte> cortes) {
        this.genes = genes;
        this.cortes = cortes;
    }

    public String getGenes() {
        return genes;
    }

    public List<Corte> getCortes() {
        return cortes;
    }

    public void setGenes(String genes) {
        this.genes = genes;
    }

    public double getFunc(int tamBar) {
        if (func == 0) {
            String[] order = genes.split(";");
            double func = 0;
            List<Bar> bars = new ArrayList<>();
            List<Integer> cortes = new ArrayList<>();

            for (Corte corte : this.cortes) {
                for (int i = 0; i < corte.quant; i++) {
                    cortes.add(corte.tam);
                }
            }

            int num = 0;
            for (String corte : order) {
                int vCorte = Integer.valueOf(corte) - 1;
                System.out.println(bars.size() + " ||| " + vCorte);
                if (bars.size() <= vCorte) {
                    int aux = bars.size();
                    for (int i = 0; i <= vCorte - aux; i++) {
                        System.out.println(bars.size() + " ||| " + vCorte);
                        bars.add(new Bar(0));
                    }
                }

                bars.get(vCorte).consumo += cortes.get(num);

                num++;
            }

            for (Bar bar : bars) {
                double aux = ((double) bar.consumo / (double) tamBar);
                func += ((aux * aux) / (double) bars.size());
            }

            this.func = func;
        }
        return this.func;
    }

    @Override
    public String toString() {
        return "Cromossomo{" +
                "genes='" + genes + '\'' +
                ", func=" + func +
                ", cortes=" + cortes +
                '}';
    }
}
