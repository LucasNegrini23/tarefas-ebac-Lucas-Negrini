package lucasnegrini.test;

import org.junit.Assert;
import org.junit.Test;

import lucasnegrini.dao.ClienteDAO;
import lucasnegrini.dao.IClienteDAO;
import lucasnegrini.domain.Cliente;
import java.sql.SQLException;
import java.util.List;

public class ClienteTest {

    @Test
    public void cadastrarTest() throws SQLException {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setNome("Lucas Negrini");
        cliente.setCodigo("13");

        Integer qtd = dao.cadastrar(cliente);
        Assert.assertTrue(qtd == 1);

        Cliente clienteDB = dao.consultar(cliente.getCodigo());
        Assert.assertNotNull(clienteDB);
        Assert.assertNotNull(clienteDB.getId());
        Assert.assertEquals(cliente.getNome(), clienteDB.getNome());
        Assert.assertEquals(cliente.getCodigo(), clienteDB.getCodigo());

        Integer clienteDel = dao.deletar(clienteDB);
            Assert.assertNotNull(clienteDel);
    }

    @Test
    public void consultarTest() throws SQLException {
        IClienteDAO dao = new ClienteDAO();
        Cliente cliente = new Cliente();
        cliente.setNome("Lucas Negrini");
        cliente.setCodigo("13");

        Integer qtd = dao.cadastrar(cliente);
        Assert.assertTrue(qtd == 1);

        Cliente clienteDB = dao.consultar(cliente.getCodigo());
        Assert.assertNotNull(clienteDB);
        Assert.assertNotNull(clienteDB.getId());
        Assert.assertEquals(cliente.getNome(), clienteDB.getNome());
        Assert.assertEquals(cliente.getCodigo(), clienteDB.getCodigo());

        Integer clienteDel = dao.deletar(clienteDB);
        Assert.assertNotNull(clienteDel);
    }


    @Test
    public void deletarTest() throws SQLException {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setNome("Lucas M. Negrini");
        cliente.setCodigo("15");

        Integer qtd = dao.cadastrar(cliente);
        Assert.assertTrue(qtd == 1);

        Cliente clienteDB = dao.consultar(cliente.getCodigo());
        Assert.assertNotNull(clienteDB);
        Assert.assertNotNull(clienteDB.getId());
        Assert.assertEquals(cliente.getNome(), clienteDB.getNome());
        Assert.assertEquals(cliente.getCodigo(), clienteDB.getCodigo());

        Integer clienteDel = dao.deletar(clienteDB);
        Assert.assertNotNull(clienteDel);
    }

    @Test
    public void atualizarTest() throws SQLException {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setNome("Lucas Negrini");
        cliente.setCodigo("19");

        Integer qtd = dao.cadastrar(cliente);
        Assert.assertTrue(qtd == 1);

        Cliente clienteDB = dao.consultar("19");
        Assert.assertNotNull(clienteDB);
        Assert.assertEquals(cliente.getNome(), clienteDB.getNome());
        Assert.assertEquals(cliente.getCodigo(), clienteDB.getCodigo());

        clienteDB.setNome("Lucas Moreira Negrini");
        clienteDB.setCodigo("29");
        Integer countUpdate = dao.atualizar(clienteDB);
        Assert.assertTrue(countUpdate == 1);

        Cliente clienteDB2 = dao.consultar("29");
        Assert.assertNotNull(clienteDB2);
        Assert.assertEquals(clienteDB.getId(), clienteDB2.getId());
        Assert.assertEquals(clienteDB.getNome(), clienteDB2.getNome());
        Assert.assertEquals(clienteDB.getCodigo(), clienteDB2.getCodigo());

        List<Cliente> listaCliente = dao.buscarTodos();
        for (Cliente clienteDB3 : listaCliente) {
            dao.deletar(clienteDB3);
        }

    }

    @Test
    public void buscarTodosTest() throws SQLException {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setNome("Lucas Negrini");
        cliente.setCodigo("15");
        Integer countCliente = dao.cadastrar(cliente);
        Assert.assertTrue(countCliente == 1);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Larissa Figueiredo");
        cliente2.setCodigo("30");
        Integer countCliente2 = dao.cadastrar(cliente2);
        Assert.assertTrue(countCliente2 == 1);

        List<Cliente> listaClientes = dao.buscarTodos();
        Assert.assertNotNull(listaClientes);
        Assert.assertEquals(2, listaClientes.size());

        int countDeletar = 0;
        for (Cliente clienteDB : listaClientes) {
            dao.deletar(clienteDB);
            countDeletar++;
        }
        Assert.assertEquals(listaClientes.size(), countDeletar);

        listaClientes = dao.buscarTodos();
        Assert.assertEquals(listaClientes.size(), 0);

    }

}


