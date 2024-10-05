import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  @author lucas.negrini
 */

class Familiares {
    String nome;
    char sexo;

    Familiares(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome + " - " + sexo;
    }
}

public class Tarefa_Collections {

    public static void main(String args[]) {
        TarefaListaSimples();
        TarefaListaSimplesOrdemAlfabetica();
        TarefaListaSeparadaPorSexo();
    }

    private static void TarefaListaSimples() {
        System.out.println("****** TarefaListaSimples ******");
        List<String> lista = new ArrayList<>();
        lista.add("Lucas Negrini");
        lista.add("Larissa Prieto");
        lista.add("Valentinna Prieto");
        lista.add("Maria Moreira");
        lista.add("Edgar Maidana");
        lista.add("Mateus Negrini");
        lista.add("Suelen Moreira");
        System.out.println(lista);
        System.out.println("");
    }

    private static void TarefaListaSimplesOrdemAlfabetica() {
        System.out.println("****** TarefaListaSimplesOrdemAlfabetica ******");
        List<String> lista = new ArrayList<>();
        lista.add("Lucas Negrini");
        lista.add("Larissa Prieto");
        lista.add("Valentinna Prieto");
        lista.add("Maria Moreira");
        lista.add("Edgar Maidana");
        lista.add("Mateus Negrini");
        lista.add("Suelen Moreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void TarefaListaSeparadaPorSexo() {
        System.out.println("****** TarefaListaSeparadaPorSexo ******");
        List<Familiares> listaFamiliares = new ArrayList<>();
        listaFamiliares.add(new Familiares("Lucas Negrini", 'M'));
        listaFamiliares.add(new Familiares("Larissa Prieto", 'F'));
        listaFamiliares.add(new Familiares("Valentinna Prieto", 'F'));
        listaFamiliares.add(new Familiares("Maria Moreira", 'F'));
        listaFamiliares.add(new Familiares("Edgar Maidana", 'M'));
        listaFamiliares.add(new Familiares("Mateus Negrini", 'M'));
        listaFamiliares.add(new Familiares("Suelen Moreira", 'F'));

       
        Collections.sort(listaFamiliares, (f1, f2) -> f1.nome.compareTo(f2.nome));

        System.out.println(listaFamiliares);
        System.out.println("");

        System.out.println("Familiares do sexo Masculino:");
        for (Familiares f : listaFamiliares) {
            if (f.sexo == 'M') {
                System.out.println(f);
            }
        }

        System.out.println(); //Break

        System.out.println("Familiares do sexo Feminino:");
        for (Familiares f : listaFamiliares) {
            if (f.sexo == 'F') {
                System.out.println(f);
            }
        }
    }
}
