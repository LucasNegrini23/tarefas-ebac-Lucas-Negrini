package lucasnegrini.dao;

import lucasnegrini.domain.Produto;

import java.sql.SQLException;
import java.util.List;

public interface IProdutoDAO {


    Integer cadastrar(Produto produto)  throws SQLException;

    Produto consultar(String codigo)throws SQLException;

    Integer deletar(Produto produtoDB)throws SQLException;

    Integer atualizar(Produto produtoDB)throws SQLException;

    List<Produto> buscarTodos()throws SQLException;
}


