package test.java.br.com.lnegrini;

import main.java.lnegrini.dao.IProdutoDA;
import main.java.lnegrini.domain.Produto;
import main.java.lnegrini.exceptions.TipoChaveNaoEncontradaException;
import main.java.lnegrini.services.IProdutoService;
import main.java.lnegrini.services.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.br.com.lnegrini.dao.ProdutoDaoMock;

import java.math.BigDecimal;

public class ProdutoServiceTest {

    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDA dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto 1");
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
    }

    @Test
    public void pesquisar() {
        Produto produtor = this.produtoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtor);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        Boolean retorno = produtoService.cadastrar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        produto.setNome("Rodrigo Pires");
        produtoService.alterar(produto);

        Assert.assertEquals("Rodrigo Pires", produto.getNome());
    }
}