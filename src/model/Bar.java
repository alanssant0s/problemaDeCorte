package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alanssantos on 2/27/16.
 */
public class Bar {
    public int consumo = 0;
    public List<Corte> cortes = new ArrayList<>();

    public Bar(int consumo) {
        this.consumo = consumo;
    }


    @Override
    public String toString() {
        return "Bar{" +
                "consumo=" + consumo +
                '}';
    }
}
