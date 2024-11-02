package main.java.lnegrini.service;

import main.java.lnegrini.dao.IProdutoDAO;
import main.java.lnegrini.domain.Produto;
import main.java.lnegrini.service.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}