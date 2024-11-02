package main.java.lnegrini;

import main.java.lnegrini.dao.ClienteDAO;
import main.java.lnegrini.dao.IClienteDAO;
import main.java.lnegrini.domain.Cliente;
import main.java.lnegrini.exceptions.DAOException;
import main.java.lnegrini.exceptions.MaisDeUmRegistroException;
import main.java.lnegrini.exceptions.TabelaException;
import main.java.lnegrini.exceptions.TipoChaveNaoEncontradaException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    public ClienteDAOTest() {
        clienteDao = new ClienteDAO();
    }

    @After
    public void end() throws DAOException {
        Collection<Cliente> list = clienteDao.buscarTodos();
        list.forEach(cli -> {
            try {
                clienteDao.excluir(cli.getCpf());
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }

    @Test
    public void pesquisarCliente() throws MaisDeUmRegistroException, TabelaException, TipoChaveNaoEncontradaException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(12312312344L);
        cliente.setNome("Lucas");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");
        clienteDao.cadastrar(cliente);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TabelaException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(56565650065L);
        cliente.setNome("Lucas");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");
        Boolean retorno = clienteDao.cadastrar(cliente);
        assertTrue(retorno);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

        clienteDao.excluir(cliente.getCpf());
    }


    @Test
    public void excluirCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TabelaException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(56565656565L);
        cliente.setNome("Lucas");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");
        Boolean retorno = clienteDao.cadastrar(cliente);
        assertTrue(retorno);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

        clienteDao.excluir(cliente.getCpf());
        clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNull(clienteConsultado);
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TabelaException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(565651246565L);
        cliente.setNome("Lucas");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");
        Boolean retorno = clienteDao.cadastrar(cliente);
        assertTrue(retorno);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

        clienteConsultado.setNome("Lucas Negrini");
        clienteDao.alterar(clienteConsultado);

        Cliente clienteAlterado = clienteDao.consultar(clienteConsultado.getCpf());
        Assert.assertNotNull(clienteAlterado);
        Assert.assertEquals("Lucas Negrini", clienteAlterado.getNome());

        clienteDao.excluir(cliente.getCpf());
        clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNull(clienteConsultado);
    }

    @Test
    public void buscarTodos() throws TipoChaveNaoEncontradaException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(56565656500L);
        cliente.setNome("Lucas");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");
        Boolean retorno = clienteDao.cadastrar(cliente);
        assertTrue(retorno);

        Cliente cliente1 = new Cliente();
        cliente1.setCpf(56565656569L);
        cliente1.setNome("Lucas Negrini");
        cliente1.setCidade("São Paulo");
        cliente1.setEnd("End");
        cliente1.setEstado("SP");
        cliente1.setNumero(10);
        cliente1.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");
        Boolean retorno1 = clienteDao.cadastrar(cliente1);
        assertTrue(retorno1);

        Collection<Cliente> list = clienteDao.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 2);

        list.forEach(cli -> {
            try {
                clienteDao.excluir(cli.getCpf());
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        Collection<Cliente> list1 = clienteDao.buscarTodos();
        assertTrue(list1 != null);
        assertTrue(list1.size() == 0);
    }

    @Test
    public void testTarefa()  throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TabelaException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(043440L);
        cliente.setNome("Lucas Moreira");
        cliente.setCidade("Campo Grande");
        cliente.setEnd("End");
        cliente.setEstado("MS");
        cliente.setNumero(80);
        cliente.setTel(1194566899L);
        cliente.setEstadoCivil("Casado");
        clienteDao.cadastrar(cliente);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
        Assert.assertFalse(clienteConsultado.getEstadoCivil() == "Solteiro");

        clienteDao.excluir(cliente.getCpf());
    }
}

