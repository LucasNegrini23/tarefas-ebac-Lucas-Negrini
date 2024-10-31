package lucasnegrini.dao;

import lucasnegrini.dao.jdbc.ConnectionFactory;
import lucasnegrini.domain.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO {

    @Override
    public Integer cadastrar(Cliente cliente) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "INSERT INTO TB_CLIENTE (ID, NOME, CODIGO) VALUES (NEXTVAL('SQ_CLIENTE'),?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCodigo());
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return null;
    }

    @Override
    public Cliente consultar(String codigo) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Cliente cliente = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_CLIENTE WHERE CODIGO = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, codigo);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                cliente = new Cliente();
                cliente.setId(resultSet.getLong("ID"));
                cliente.setNome(resultSet.getString("NOME"));
                cliente.setCodigo(resultSet.getString("CODIGO"));
            }
            return cliente;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
            return cliente;
        }
    }

    @Override
    public Integer deletar(Cliente cliente) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "DELETE FROM TB_CLIENTE WHERE CODIGO = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cliente.getCodigo());
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return null;
    }

    @Override
    public Integer atualizar(Cliente cliente) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "UPDATE TB_CLIENTE SET NOME = ?, CODIGO = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCodigo());
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return 0;
    }

    @Override
    public List<Cliente> buscarTodos() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_CLIENTE";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                cliente = new Cliente();
                Long id = resultSet.getLong("ID");
                String nome = resultSet.getString("NOME");
                String codigo = resultSet.getString("CODIGO");
                cliente.setId(id);
                cliente.setNome(nome);
                cliente.setCodigo(codigo);
                clientes.add(cliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
            return clientes;
        }
    }
}
