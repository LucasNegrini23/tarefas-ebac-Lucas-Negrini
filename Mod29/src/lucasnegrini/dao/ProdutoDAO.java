package lucasnegrini.dao;

import lucasnegrini.dao.jdbc.ConnectionFactory;
import lucasnegrini.domain.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {

    @Override
    public Integer cadastrar(Produto produto) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "INSERT INTO TB_PRODUTO (ID, TIPO, CODIGO) VALUES (NEXTVAL('SQ_PRODUTO'),?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, produto.getTipo());
            ps.setString(2, produto.getCodigo());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
            if (con != null && !con.isClosed()) {
                con.close();
            }
        }
    }

    @Override
    public Produto consultar(String codigo) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Produto produto = null;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PRODUTO WHERE CODIGO = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getLong("ID"));
                produto.setTipo(rs.getString("TIPO"));
                produto.setCodigo(rs.getString("CODIGO"));
            }
            return produto;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
        }
    }

    @Override
    public Integer deletar(Produto produtoDB) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "DELETE FROM TB_PRODUTO WHERE ID = ?";
            ps = con.prepareStatement(sql);
            ps.setLong(1, produtoDB.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
            if (con != null && !con.isClosed()) {
                con.close();
            }
        }
    }

    @Override
    public Integer atualizar(Produto produtoDB) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "UPDATE TB_PRODUTO SET TIPO = ?, CODIGO = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, produtoDB.getTipo());
            ps.setString(2, produtoDB.getCodigo());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
            if (con != null && !con.isClosed()) {
                con.close();
            }
        }
    }

    @Override
    public List<Produto> buscarTodos() throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<Produto>();
        Produto produto = null;
        try {
            con = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PRODUTO";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                produto = new Produto();
                Long id = rs.getLong("ID");
                String tipo = rs.getString("TIPO");
                String codigo = rs.getString("CODIGO");
                produto.setId(id);
                produto.setTipo(tipo);
                produto.setCodigo(codigo);
                produtos.add(produto);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (ps != null && !ps.isClosed()) {
                ps.close();
            }
        }
        return produtos;
    }
}

