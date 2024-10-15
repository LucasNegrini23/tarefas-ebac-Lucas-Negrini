package br.com.lnegrini.tarefamod17.app;

import br.com.lnegrini.tarefamod17.domain.Carro;
import br.com.lnegrini.tarefamod17.domain.Ferrari;
import br.com.lnegrini.tarefamod17.domain.Jeep;
import br.com.lnegrini.tarefamod17.domain.Tesla;

import java.util.ArrayList;
import java.util.List;

public class CarroTest {
    public static void main(String[] args) {
        Carro ferrari = new Ferrari("Ferrari", "SF90 XX", "Vermelha", 2024);
        Carro jeep = new Jeep("Jeep", "4x4", "Preto", 2023);
        Carro tesla = new Tesla("Tesla", "Model X", "Cinza", 2025);

        List<Carro> listaDeCarros = new ArrayList<Carro>();
        listaDeCarros.add(ferrari);
        listaDeCarros.add(jeep);
        listaDeCarros.add(tesla);
        for (Carro carro : listaDeCarros) {
            System.out.println(carro);
        }
    }
}
