package main.java.lnegrini.dao;

import main.java.lnegrini.dao.generic.IGenericDAO;
import main.java.lnegrini.domain.Cliente;
import main.java.lnegrini.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {


    Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException;

    void excluir(Long valor);

    void alterar(Cliente entity) throws TipoChaveNaoEncontradaException;

    Cliente consultar(Long valor);

    Collection<Cliente> buscarTodos();
}
