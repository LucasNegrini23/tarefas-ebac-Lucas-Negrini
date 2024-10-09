package br.com.lucasnegrini.projeto1.dao;

import br.com.lucasnegrini.projeto1.domain.Cliente;

import java.util.Collection;

/**
 * @author lucas.negrini
 */

public interface IClienteDAO {

    public Boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}