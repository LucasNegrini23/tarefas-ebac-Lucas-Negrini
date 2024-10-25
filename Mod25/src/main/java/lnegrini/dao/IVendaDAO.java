package main.java.lnegrini.dao;

import main.java.lnegrini.dao.generic.IGenericDAO;
import main.java.lnegrini.domain.Venda;
import main.java.lnegrini.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}