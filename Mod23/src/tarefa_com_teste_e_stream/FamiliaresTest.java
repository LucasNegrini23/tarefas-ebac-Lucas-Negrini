package tarefa_com_teste_e_stream;

import java.util.List;
import java.util.Objects;

public class FamiliaresTest {

    private String nome;
    private String sexo;

    public FamiliaresTest() {

    }

    public FamiliaresTest(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public FamiliaresTest(FamiliaresTest familiaresTest){
        this(familiaresTest.getNome(), familiaresTest.getSexo());
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

    public List<FamiliaresTest> familiaresList() {
        FamiliaresTest familia1 = new FamiliaresTest("Lucas Negrini", "M");
        FamiliaresTest familia2 = new FamiliaresTest("Larissa Prieto", "F");
        FamiliaresTest familia3 = new FamiliaresTest("João Negrini", "M");
        FamiliaresTest familia4 = new FamiliaresTest("Maria Moreira", "F");
        FamiliaresTest familia5 = new FamiliaresTest("Valentinna Prieto", "F");
        FamiliaresTest familia6 = new FamiliaresTest("Mateus Negrini", "M");
        return List.of(familia1,familia2,familia3,familia4,familia5,familia6);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamiliaresTest that = (FamiliaresTest) o;
        return sexo == that.sexo && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo);
    }
}
