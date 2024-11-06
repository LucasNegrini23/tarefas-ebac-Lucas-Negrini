package main.java.lnegrini.dao;

import main.java.lnegrini.domain.Acessorio;

import java.util.List;

public interface IAcessorioDAO {

    public Acessorio create(Acessorio acessorio);

    void excluir(Acessorio acessorio);

    List<Acessorio> buscarTodos();
}
