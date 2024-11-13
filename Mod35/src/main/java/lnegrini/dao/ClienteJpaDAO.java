package main.java.lnegrini.dao;

import main.java.lnegrini.dao.generic.GenericJpaDao;
import main.java.lnegrini.domain.ClienteJpa;
import main.java.lnegrini.dao.IClienteJpaDAO;

public class ClienteJpaDAO extends GenericJpaDao<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}