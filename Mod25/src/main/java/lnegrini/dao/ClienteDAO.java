package main.java.lnegrini.dao;

import main.java.lnegrini.dao.generic.GenericDAO;
import main.java.lnegrini.domain.Cliente;
import main.java.lnegrini.domain.Venda;
import main.java.lnegrini.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super();
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setTel(entity.getTel());

    }



}