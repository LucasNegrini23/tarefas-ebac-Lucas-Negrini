package main.java.lnegrini;

import main.java.lnegrini.dao.IClienteDAO;
import main.java.lnegrini.domain.Cliente;
import main.java.lnegrini.exceptions.DAOException;
import main.java.lnegrini.exceptions.TipoChaveNaoEncontradaException;
import main.java.lnegrini.mock.ClienteDAOMock;
import main.java.lnegrini.service.ClienteService;
import main.java.lnegrini.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Lucas");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");

    }

    @Test
    public void pesquisarCliente() throws DAOException {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() throws DAOException {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        cliente.setNome("Lucas Negrini");
        clienteService.alterar(cliente);

        Assert.assertEquals("Lucas Negrini", cliente.getNome());
    }
}
