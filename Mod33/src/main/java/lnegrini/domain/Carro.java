package main.java.lnegrini.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import main.java.lnegrini.domain.Marca;
import main.java.lnegrini.domain.Acessorio;



@Entity
@Table(name = "TB_CARRO")
public class Carro {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="carro_seq")
    @SequenceGenerator(name="carro_seq", sequenceName="sq_carro", initialValue = 1, allocationSize = 1)
    private int id;

    @Column(name = "CODIGO", length = 30, nullable = false)
    private String codigo;

    @Column(name = "NOME", length = 30, nullable = false)
    private String nome;

    @Column(name = "ANO", nullable = false)
    private int ano;

    @Column(name = "VALOR", nullable = false)
    private double valor;

    @ManyToOne
    @JoinColumn(name = "id_marca_fk",
            foreignKey = @ForeignKey(name = "fk_marca_carro"),
            referencedColumnName = "id", nullable = false)
    private Marca marca;

    @ManyToMany(mappedBy = "carros")
    private List<Acessorio> acessorios;

    public Carro() {
        this.acessorios = new ArrayList<Acessorio>();
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }

    public void add(Acessorio acessorio) {
        this.acessorios.add(acessorio);
    }

}
