package br.com.lnegrini;

import main.java.lnegrini.dao.IAcessorioDAO;
import main.java.lnegrini.dao.ICarroDAO;
import main.java.lnegrini.dao.IMarcaDAO;
import main.java.lnegrini.dao.MarcaDAO;
import main.java.lnegrini.domain.Acessorio;
import main.java.lnegrini.domain.Carro;
import main.java.lnegrini.domain.Marca;
import main.java.lnegrini.dao.CarroDAO;
import main.java.lnegrini.dao.AcessorioDAO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestFinal {

    private IMarcaDAO marcaDAO;
    private ICarroDAO carroDAO;
    private IAcessorioDAO accessorioDAO;

    public TestFinal() {
        this.marcaDAO = new MarcaDAO();
        this.carroDAO = new CarroDAO();
        this.accessorioDAO = new AcessorioDAO();
    }

    @After
    public void end() {
        List<Acessorio> listAcessorios = accessorioDAO.buscarTodos();
        listAcessorios.forEach(acessorio -> accessorioDAO.excluir(acessorio));

        List<Carro> listCarros = carroDAO.buscarTodos();
        listCarros.forEach(carro -> carroDAO.excluir(carro));

        List<Marca> listMarcas = marcaDAO.buscarTodos();
        listMarcas.forEach(marca -> marcaDAO.excluir(marca));
    }

    @Test
    public void createTest() {
        Carro carro = createCarro("G1");

        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo("P7");
        acessorio.setTipo("Acessorio");
        acessorio.setDescricao("Cambio Automatico");
        acessorio.setValor(5000d);
        acessorio.setCarros(List.of(carro));

        carro.setMarca(createMarca("F1"));

        Assert.assertNotNull(acessorio);
        Assert.assertNotNull(acessorio.getId());

    }

    private Marca createMarca(String codigo){
        Marca marca = new Marca();
        marca.setCodigo(codigo);
        marca.setNome("WV");
        marca.setDescricao("Esportivo");
        return marcaDAO.create(marca);
    }

    private Acessorio createAcessorio(String codigo){
        Carro carro = createCarro("G1");
        Carro carro2 = createCarro("P1");
        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo(codigo);
        acessorio.setTipo("Rodas");
        acessorio.setDescricao("Esportivas");
        acessorio.setValor(500d);
        acessorio.add(carro);
        acessorio.add(carro2);
        return accessorioDAO.create(acessorio);

    }

    private Carro createCarro(String codigo){
        Carro carro = new Carro();
        carro.setCodigo(codigo);
        carro.setNome("Golf");
        carro.setAno(2024);
        carro.setValor(15000d);
        return carro;
    }
}
