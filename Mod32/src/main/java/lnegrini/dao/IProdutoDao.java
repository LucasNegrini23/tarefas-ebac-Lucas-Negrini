package lnegrini.dao;

import lnegrini.domain.Produto;

import java.util.List;

public interface IProdutoDao {

    public Produto create(Produto produto);

    List<Produto> buscarTodos();

    void excluir(Produto produto);
}
