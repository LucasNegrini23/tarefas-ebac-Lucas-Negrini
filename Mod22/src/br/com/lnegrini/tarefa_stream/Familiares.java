package br.com.lnegrini.tarefa_stream;

import java.util.List;
import java.util.Objects;

public class Familiares {

    private String nome;
    private String sexo;

    public Familiares() {

    }

    public Familiares(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Familiares(Familiares familiares){
        this(familiares.getNome(), familiares.getSexo());
    }

    @Override
    public String toString() {
        return nome + " - " + sexo  + ", ";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Familiares> familiaresList() {
        Familiares familia1 = new Familiares("Lucas Negrini", "M");
        Familiares familia2 = new Familiares("Larissa Prieto", "F");
        Familiares familia3 = new Familiares("João Negrini", "M");
        Familiares familia4 = new Familiares("Maria Moreira", "F");
        Familiares familia5 = new Familiares("Valentinna Prieto", "F");
        Familiares familia6 = new Familiares("Mateus Negrini", "M");
        return List.of(familia1,familia2,familia3,familia4,familia5,familia6);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Familiares that = (Familiares) o;
        return sexo == that.sexo && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo);
    }
}
