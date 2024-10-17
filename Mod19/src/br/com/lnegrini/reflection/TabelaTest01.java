package br.com.lnegrini.reflection;

import br.com.lnegrini.annotation.TabelaAnnotation;

import java.util.ArrayList;
import java.util.List;

@TabelaAnnotation(nome = "Lucas", idade = "29", sexo = "M")
public class TabelaTest01 {

        @TabelaAnnotation(nome = "Lucas", idade = "29", sexo = "M")
        String nome = "Lucas";
        String idade = "29";
        String sexo = "M";

    public TabelaTest01() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
