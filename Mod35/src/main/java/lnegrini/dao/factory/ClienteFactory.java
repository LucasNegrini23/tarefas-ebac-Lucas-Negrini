package main.java.lnegrini.dao.factory;

import main.java.lnegrini.domain.ClienteJpa;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteFactory {
    public static ClienteJpa convert(ResultSet rs) throws SQLException {
        ClienteJpa clienteJPA = new ClienteJpa();
        clienteJPA.setId(rs.getLong("ID_CLIENTE"));
        clienteJPA.setNome(rs.getString(("NOME")));
        clienteJPA.setCpf(rs.getLong(("CPF")));
        clienteJPA.setTel(rs.getLong(("TEL")));
        clienteJPA.setEnd(rs.getString(("ENDERECO")));
        clienteJPA.setNumero(rs.getInt(("NUMERO")));
        clienteJPA.setCidade(rs.getString(("CIDADE")));
        clienteJPA.setEstado(rs.getString(("ESTADO")));
        return clienteJPA;
    }
}
