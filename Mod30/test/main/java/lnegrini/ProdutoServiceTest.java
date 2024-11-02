package main.java.lnegrini;

import main.java.lnegrini.dao.IProdutoDAO;
import main.java.lnegrini.domain.Produto;
import main.java.lnegrini.exceptions.DAOException;
import main.java.lnegrini.exceptions.TipoChaveNaoEncontradaException;
import main.java.lnegrini.mock.ProdutoDAOMock;
import main.java.lnegrini.service.IProdutoService;
import main.java.lnegrini.service.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ProdutoServiceTest {

    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDAOMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto 1");
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
        produto.setCor("White");
    }

    @Test
    public void pesquisar() throws DAOException {
        Produto produtor = this.produtoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtor);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = produtoService.cadastrar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() throws DAOException {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        produto.setNome("Lucas Negrini");
        produtoService.alterar(produto);

        Assert.assertEquals("Lucas Negrini", produto.getNome());
    }
}

