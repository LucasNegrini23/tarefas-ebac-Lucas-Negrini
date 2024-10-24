package Service;

import DAO.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao dao;

    public ContratoService(IContratoDao dao) {
        this.dao = dao;
    }

    @Override
    public String salvar() {
        dao.salvar();
        return "Salvando";
    }

    @Override
    public String buscar() {
        return "Buscando";
    }

    @Override
    public String atualizar() {
        return "Atualizando";
    }

    @Override
    public String excluir() {
        return "Excluindo";
    }
}
