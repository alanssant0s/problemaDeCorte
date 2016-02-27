package config;

/**
 * Created by alanssantos on 2/27/16.
 */
public class Utils {

    public static String mount(String[] genes) {
        String g = "";
        int i = 0;
        for (String gene : genes) {
            g += gene + ((i < genes.length-1) ? ";" : "");
            i++;
        }

        return g;

    }
}
