package br.com.lnegrini.tarefa_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TarefaStream {
    public static void main(String[] args) {

        List<Familiares> lista = new Familiares().familiaresList();

        System.out.println("*** Lista Familiares Completa ***");
        lista.stream().forEach(System.out::println);

        System.out.println("*--------*");

        System.out.println("*** Lista Familiares Femininas ***");

        lista.stream()
                .filter(familiares -> familiares.getSexo().equals("F"))
                .forEach(System.out::println);

    }
}