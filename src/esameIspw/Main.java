package esameIspw;

import java.text.Collator;
import java.util.*;

public class Main {

    public static List<String> lista = new ArrayList<String>();
    public static void main(String[] args) {
        lista.add("pluto");
        lista.add("ama");
        lista.add("ciccia");
        lista.add("pap");
        lista.add("ciccio");
        lista.add("Ciccia");
        Collections.sort(lista, Collator.getInstance(Locale.ENGLISH));
        System.out.println("ciao"+ lista);
    }
}
