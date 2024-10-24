package DAO.Mock;

import DAO.IContratoDao;

public class ContratoDaoMock implements IContratoDao {
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Erro ao Salva");
    }
}
