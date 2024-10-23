package tarefa_com_teste_e_stream;

import java.util.List;
import java.util.stream.Stream;

public class TarefaStreamTest {
    public static void main(String[] args) {

        List<FamiliaresTest> lista = new FamiliaresTest().familiaresList();

          List<FamiliaresTest> listaFeminina = lista.stream()
                  .filter(familiaresTest -> familiaresTest.getSexo().equals("F"))
                  .toList();

          System.out.println("*** Lista Familiares Femininas ***");
          listaFeminina.forEach(System.out::println);

          System.out.println("*--------*");
  
          boolean result = listaFeminina.stream()
                  .allMatch(familiaresTest -> familiaresTest.getSexo().equals("F"));
          System.out.println("*** Todos os nomes são femininos? ***");
          System.out.println(result);
      }
}
