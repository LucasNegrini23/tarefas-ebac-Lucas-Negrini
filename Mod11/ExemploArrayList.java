import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *  @authoe lucas.negrini
 */

public class ExemploArrayList {
    
    public static void main (String arg[]) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();

    }

    private static void exemploNumeros() {
        System.out.println("***** exemploNumeros *****");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(29);
        numeros.add(23);
        numeros.add(1);
        numeros.add(11);
        numeros.add(30);
        System.out.println(numeros);
        
    }

    private static void exemploListaSimples() {
        System.out.println("***** exemploListaSimples *****");
        List<String> lista = new ArrayList<String>();
        lista.add("Lucas Negrini");
        lista.add("João Negrini");
        lista.add("Larissa Prieto");
        lista.add("Maria Moreira");
        lista.add("Todi Italia");
        System.out.println(lista);
        System.out.println("");

    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("***** exemploListaSimplesAscendente *****");
        List<String> lista = new ArrayList<String>();
        lista.add("Lucas Negrini");
        lista.add("João Negrini");
        lista.add("Larissa Prieto");
        lista.add("Maria Moreira");
        lista.add("Todi Italia");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");

    }

}
