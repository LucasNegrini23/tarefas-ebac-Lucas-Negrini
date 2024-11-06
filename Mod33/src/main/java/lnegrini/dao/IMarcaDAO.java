package main.java.lnegrini.dao;

import main.java.lnegrini.domain.Carro;
import main.java.lnegrini.domain.Marca;

import java.util.List;

public interface IMarcaDAO {

    public Marca create(Marca marca);

    void excluir (Marca marca);

    List<Marca> buscarTodos();
}
