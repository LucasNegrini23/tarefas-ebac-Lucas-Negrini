package br.com.lnegrini.annotation;

import java.util.ArrayList;
import java.util.List;

@TabelaAnnotation(nome = "Lucas", idade = "29", sexo = "M")
public class TabelaTest01 {
    public static void main(String[] args) {

        String nome = "Lucas";
        String idade = "29";
        String sexo = "M";

        List<String> dados = new ArrayList<>();
        dados.add(nome);
        dados.add(idade);
        dados.add(sexo);
        for (String dado : dados) {
            System.out.println(dado);
        }
    }
}
