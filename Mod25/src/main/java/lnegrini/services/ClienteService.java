package main.java.lnegrini.services;

import main.java.lnegrini.dao.IClienteDAO;
import main.java.lnegrini.domain.Cliente;
import main.java.lnegrini.services.generics.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }

}
