package main.java.lnegrini.service;

import main.java.lnegrini.dao.IClienteDAO;
import main.java.lnegrini.domain.Cliente;
import main.java.lnegrini.exceptions.DAOException;
import main.java.lnegrini.exceptions.MaisDeUmRegistroException;
import main.java.lnegrini.exceptions.TabelaException;
import main.java.lnegrini.service.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TabelaException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
