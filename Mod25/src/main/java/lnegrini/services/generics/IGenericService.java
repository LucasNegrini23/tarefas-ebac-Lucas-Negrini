package main.java.lnegrini.services.generics;

import main.java.lnegrini.dao.IPersistente;
import main.java.lnegrini.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericService <T extends IPersistente, E extends Serializable> {

    /**
     * Método para cadastrar novos registro no banco de dados
     */
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

    /**
     * Método para excluir um registro do banco de dados
     */
    public void excluir(E valor);

    /**
     *Método para alterar um registro no bando de dados.
     */
    public void alterar(T entity) throws TipoChaveNaoEncontradaException;

    /**
     * Método para consultar um registro no banco de dados
     */
    public T consultar(E valor);

    /**
     * Método que irá retornar todos os registros do banco de dados de uma determinado dado ou tabela
     */
    public Collection<T> buscarTodos();

}
