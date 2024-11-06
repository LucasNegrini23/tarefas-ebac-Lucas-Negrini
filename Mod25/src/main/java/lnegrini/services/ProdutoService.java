package main.java.lnegrini.services;

import main.java.lnegrini.dao.IProdutoDA;
import main.java.lnegrini.domain.Produto;
import main.java.lnegrini.services.generics.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDA dao) {
        super(dao);
    }

}
