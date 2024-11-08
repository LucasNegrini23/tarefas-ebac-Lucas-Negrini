package main.java.lnegrini.dao;

import main.java.lnegrini.dao.generic.GenericJpaDao;
import main.java.lnegrini.domain.ProdutoJpa;
import main.java.lnegrini.dao.IProdutoJpaDAO;

public class ProdutoJpaDAO extends GenericJpaDao<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}
