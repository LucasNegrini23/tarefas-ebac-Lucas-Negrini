package main.java.lnegrini.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import main.java.lnegrini.domain.Carro;
import main.java.lnegrini.domain.Acessorio;

@Entity
@Table(name = "TB_MARCA")
public class Marca {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="marca_seq")
    @SequenceGenerator(name="marca_seq", sequenceName="sq_marca", initialValue = 1, allocationSize = 1)
    private int id;

    @Column(name = "CODIGO", length = 30, nullable = false)
    private String codigo;

    @Column(name = "NOME", length = 30, nullable = false)
    private String nome;

    @Column(name = "DESCRIÇÃO", length = 50, nullable = false)
    private String descricao;

    @OneToMany(mappedBy = "marca")
    private List<Carro> carros;

    public Marca() {
        this.carros = new ArrayList<Carro>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void addCarro(Carro carro) {
        this.carros.add(carro);
    }
}
