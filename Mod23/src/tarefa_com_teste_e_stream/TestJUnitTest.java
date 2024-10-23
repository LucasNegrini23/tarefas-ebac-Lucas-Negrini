package tarefa_com_teste_e_stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestJUnitTest {

    @Test
    public void testFamiliaresFemininas(){
        FamiliaresTest familiaTest = new FamiliaresTest();

        List<FamiliaresTest> lista = familiaTest.familiaresList();

        List<FamiliaresTest> listaFeminina = lista.stream()
                .filter(familiares -> familiares.getSexo().equals("F"))
                .toList();

        for (FamiliaresTest familiar : listaFeminina) {
            Assert.assertTrue("Um familiar não é feminino: " + familiar.getNome(),
                    familiar.getSexo().equals("F"));
        }
    }

}