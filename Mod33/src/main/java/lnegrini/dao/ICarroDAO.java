package main.java.lnegrini.dao;


import main.java.lnegrini.domain.Acessorio;
import main.java.lnegrini.domain.Carro;

import java.util.List;

public interface ICarroDAO {

    public Carro create(Carro carro);

    void excluir (Carro carro);

    List<Carro> buscarTodos();

}
