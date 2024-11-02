package main.java.lnegrini.service;

import main.java.lnegrini.domain.Cliente;
import main.java.lnegrini.exceptions.DAOException;
import main.java.lnegrini.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    Cliente buscarPorCPF(Long cpf) throws DAOException;

}