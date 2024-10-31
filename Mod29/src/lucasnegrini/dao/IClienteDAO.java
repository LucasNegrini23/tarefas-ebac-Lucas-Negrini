package lucasnegrini.dao;

import lucasnegrini.domain.Cliente;

import java.sql.SQLException;
import java.util.List;

public interface IClienteDAO {


    Integer cadastrar(Cliente cliente) throws SQLException;

    Cliente consultar(String codigo)throws SQLException;

    Integer deletar(Cliente cliente) throws SQLException;

    Integer atualizar(Cliente cliente)throws SQLException;

    List<Cliente> buscarTodos()throws SQLException;
}
