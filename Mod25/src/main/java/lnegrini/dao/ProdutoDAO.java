package main.java.lnegrini.dao;

import main.java.lnegrini.dao.generic.GenericDAO;
import main.java.lnegrini.domain.Produto;
import main.java.lnegrini.domain.Venda;
import main.java.lnegrini.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

    public ProdutoDAO() {
        super();
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualiarDados(Produto entity, Produto entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setDescricao(entity.getDescricao());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setValor(entity.getValor());
    }

}