package main.java.lnegrini.dao.factory;

import main.java.lnegrini.domain.ClienteJpa;
import main.java.lnegrini.domain.VendaJpa;
import main.java.lnegrini.dao.factory.ClienteFactory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VendaFactory {
    public static VendaJpa convert(ResultSet rs) throws SQLException {
        ClienteJpa clienteJpa = ClienteFactory.convert(rs);
        VendaJpa vendaJpa = new VendaJpa();
        vendaJpa.setCliente(clienteJpa);
        vendaJpa.setId(rs.getLong("ID_VENDA"));
        vendaJpa.setCodigo(rs.getString("CODIGO"));
        vendaJpa.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
        vendaJpa.setDataVenda(rs.getTimestamp("DATA_VENDA").toInstant());
        vendaJpa.setStatus(VendaJpa.Status.getByName(rs.getString("STATUS_VENDA")));
        return vendaJpa;
    }
}
