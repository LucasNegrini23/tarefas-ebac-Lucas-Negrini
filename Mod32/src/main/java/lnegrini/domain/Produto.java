package lnegrini.domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="prod_seq")
    @SequenceGenerator(name="prod_seq", sequenceName="sq_produto", initialValue = 1, allocationSize = 1)
    private int id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "DESCRIÇÃO", nullable = false)
    private String descricao;

    @Column(name = "PRECO", nullable = false)
    private Double preco;

    public Produto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
