package main.java.lnegrini.dao;

import main.java.lnegrini.dao.generic.IGenericDAO;
import main.java.lnegrini.domain.Produto;
import main.java.lnegrini.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public interface IProdutoDA extends IGenericDAO<Produto, String> {

    Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException;

    void excluir(String valor);

    void alterar(Produto entity) throws TipoChaveNaoEncontradaException;

    Produto consultar(String valor);

    Collection<Produto> buscarTodos();
}