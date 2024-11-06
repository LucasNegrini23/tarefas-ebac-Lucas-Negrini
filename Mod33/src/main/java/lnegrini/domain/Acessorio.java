package main.java.lnegrini.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import main.java.lnegrini.domain.Carro;

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="acessorio_seq")
    @SequenceGenerator(name="acessorio_seq", sequenceName="sq_acessorio", initialValue = 1, allocationSize = 1)
    private int id;

    @Column(name = "CODIGO", length = 30, nullable = false)
    private String codigo;

    @Column(name = "TIPO", length = 30, nullable = false)
    private String tipo;

    @Column(name = "DESCRIÇÃO", length = 50, nullable = false)
    private String descricao;

    @Column(name = "VALOR", nullable = false)
    private double valor;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "TB_ACESSORIO_CARRO",
            joinColumns = { @JoinColumn(name = "id_acessorio_fk") },
            inverseJoinColumns = { @JoinColumn(name = "id_carro_fk") }
    )
    private List<Carro> carros;

    public Acessorio() {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void add(Carro carro){
        this.carros.add(carro);
    }
}
