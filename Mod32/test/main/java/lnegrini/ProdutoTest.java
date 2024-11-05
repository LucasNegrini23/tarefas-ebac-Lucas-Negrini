package main.java.lnegrini;

import lnegrini.dao.IProdutoDao;
import lnegrini.dao.ProdutoDao;
import lnegrini.domain.Curso;
import lnegrini.domain.Matricula;
import lnegrini.domain.Produto;
import org.junit.After;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;


public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @After
    public void end() {
        List<Produto> listProdutos = produtoDao.buscarTodos();
        listProdutos.forEach(produto -> produtoDao.excluir(produto));
    }

    @Test
    public void createTest(){
        Produto produto = new Produto();
        produto.setNome("PC");
        produto.setDescricao("Gamer");
        produto.setPreco(3000d);
        produto = produtoDao.create(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
