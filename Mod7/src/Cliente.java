/**
 * @author Lucas.Negrini
 *
 * @see Venda
 */

public class Cliente {

    private int codigo;

    private String nome;

    private String endereco;

    private String telefone;

    private String email;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void cadastrarEndereco(String endereco) {
        setEndereco(endereco);
    }

    public String retornarNomeCliente() {
        return "Endereco do Lucas";
    }

    public int getValorTotal() {
        return 20;
    }
}
