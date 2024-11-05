package lnegrini.dao;

import lnegrini.domain.Curso;
import java.util.List;

public interface ICursoDao {

    public Curso cadastrar(Curso curso);

    public void excluir(Curso curso);

    public List<Curso> buscarTodos();
}
