package lucasnegrini.test;

import lucasnegrini.dao.IProdutoDAO;
import lucasnegrini.dao.ProdutoDAO;
import lucasnegrini.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class ProdutoTest {

    @Test
    public void cadastrarProdTest() throws SQLException {
        IProdutoDAO daoProduto = new ProdutoDAO();
        Produto produto = new Produto();
        produto.setTipo("Eletronico");
        produto.setCodigo("1");
        Integer qtd = daoProduto.cadastrar(produto);
        Assert.assertTrue(qtd == 1);

        Produto produtoDB = daoProduto.consultar(produto.getCodigo());
        Assert.assertNotNull(produtoDB);
        Assert.assertNotNull(produtoDB.getId());
        Assert.assertEquals(produto.getTipo(), produtoDB.getTipo());
        Assert.assertEquals(produto.getCodigo(), produtoDB.getCodigo());

        Integer produtoDel = daoProduto.deletar(produtoDB);
        Assert.assertNotNull(produtoDel);
    }

    @Test
    public void consultarProdTest() throws SQLException {
        IProdutoDAO daoProduto = new ProdutoDAO();
        Produto produto = new Produto();
        produto.setTipo("Eletronico");
        produto.setCodigo("1");
        Integer qtd = daoProduto.cadastrar(produto);
        Assert.assertTrue(qtd == 1);

        Produto produtoDB = daoProduto.consultar(produto.getCodigo());
        Assert.assertNotNull(produtoDB);
        Assert.assertNotNull(produtoDB.getId());
        Assert.assertEquals(produto.getTipo(), produtoDB.getTipo());
        Assert.assertEquals(produto.getCodigo(), produtoDB.getCodigo());

        Integer produtoDel = daoProduto.deletar(produtoDB);
        Assert.assertNotNull(produtoDel);
    }

    @Test
    public void deletarProdTest() throws SQLException {
        IProdutoDAO daoProduto = new ProdutoDAO();
        Produto produto = new Produto();
        produto.setTipo("Eletronico");
        produto.setCodigo("1");
        Integer qtd = daoProduto.cadastrar(produto);
        Assert.assertTrue(qtd == 1);

        Produto produtoDB = daoProduto.consultar(produto.getCodigo());
        Assert.assertNotNull(produtoDB);
        Assert.assertNotNull(produtoDB.getId());
        Assert.assertEquals(produto.getTipo(), produtoDB.getTipo());
        Assert.assertEquals(produto.getCodigo(), produtoDB.getCodigo());

        Integer produtoDel = daoProduto.deletar(produtoDB);
        Assert.assertNotNull(produtoDel);
    }

    @Test
    public void atualizarProdTest() throws SQLException {
        IProdutoDAO daoProduto = new ProdutoDAO();
        Produto produto = new Produto();
        produto.setTipo("Eletronico");
        produto.setCodigo("1");
        Integer qtd = daoProduto.cadastrar(produto);
        Assert.assertTrue(qtd == 1);

        Produto produtoDB = daoProduto.consultar("1");
        Assert.assertNotNull(produtoDB);
        Assert.assertEquals(produto.getTipo(), produtoDB.getTipo());
        Assert.assertEquals(produto.getCodigo(), produtoDB.getCodigo());

        produtoDB.setTipo("Perecível");
        produtoDB.setCodigo("2");
        Integer countUpdate = daoProduto.atualizar(produtoDB);
        Assert.assertTrue(countUpdate == 1);

        Produto produtoDB2 = daoProduto.consultar("2");
        Assert.assertNotNull(produtoDB2);
        Assert.assertEquals(produtoDB.getId(), produtoDB2.getId());
        Assert.assertEquals(produtoDB.getTipo(), produtoDB2.getTipo());
        Assert.assertEquals(produtoDB.getCodigo(), produtoDB2.getCodigo());

        List<Produto> listaProduto = daoProduto.buscarTodos();
        for (Produto produto1 : listaProduto){
            daoProduto.deletar(produto1);
        }
    }

    @Test
    public void buscarTodosTest() throws SQLException{
        IProdutoDAO daoProduto = new ProdutoDAO();
        Produto produto = new Produto();
        produto.setTipo("Eletronico");
        produto.setCodigo("1");
        Integer qtd = daoProduto.cadastrar(produto);
        Assert.assertTrue(qtd == 1);

        Produto produto2 = new Produto();
        produto2.setTipo("Perecivel");
        produto2.setCodigo("2");
        Integer qtd2 = daoProduto.cadastrar(produto2);
        Assert.assertTrue(qtd2 == 1);

        List<Produto> listaProduto = daoProduto.buscarTodos();
        Assert.assertNotNull(listaProduto);
        Assert.assertEquals(2, listaProduto.size());

        int countDeletar = 0;
        for (Produto produto1 : listaProduto){
            daoProduto.deletar(produto1);
            countDeletar++;
        }
        Assert.assertEquals(listaProduto.size(), countDeletar);

        listaProduto = daoProduto.buscarTodos();
        Assert.assertEquals(listaProduto.size(), 0);
    }
}
