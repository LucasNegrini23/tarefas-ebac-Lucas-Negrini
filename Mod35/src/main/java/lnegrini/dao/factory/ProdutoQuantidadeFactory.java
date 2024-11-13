package main.java.lnegrini.dao.factory;

import main.java.lnegrini.domain.ProdutoJpa;
import main.java.lnegrini.domain.ProdutoQuantidadeJpa;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoQuantidadeFactory {

    public static ProdutoQuantidadeJpa convert(ResultSet rs) throws SQLException {
        ProdutoJpa prod = ProdutoFactory.convert(rs);
        ProdutoQuantidadeJpa prodQ = new ProdutoQuantidadeJpa();
        prodQ.setProduto(prod);
        prodQ.setId(rs.getLong("ID"));
        prodQ.setQuantidade(rs.getInt("QUANTIDADE"));
        prodQ.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
        return prodQ;
    }
}