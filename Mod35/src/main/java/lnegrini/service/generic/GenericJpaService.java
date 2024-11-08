package lnegrini.service.generic;

import main.java.lnegrini.dao.Persistente;
import main.java.lnegrini.dao.generic.IGenericJpaDao;
import main.java.lnegrini.exceptions.DAOException;
import main.java.lnegrini.exceptions.MaisDeUmRegistroException;
import main.java.lnegrini.exceptions.TabelaException;
import main.java.lnegrini.exceptions.TipoChaveNaoEncontradaException;
import main.java.lnegrini.service.generic.IGenericJpaService;

import java.io.Serializable;
import java.util.Collection;

public abstract class GenericJpaService<T extends Persistente, E extends Serializable>
        implements IGenericJpaService<T, E> {

    protected IGenericJpaDao<T, E> dao;

    public GenericJpaService(IGenericJpaDao<T, E> dao) {
        this.dao = dao;
    }


    @Override
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(T entity) throws DAOException {
        this.dao.excluir(entity);
    }

    @Override
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws MaisDeUmRegistroException, TabelaException, DAOException {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }


}