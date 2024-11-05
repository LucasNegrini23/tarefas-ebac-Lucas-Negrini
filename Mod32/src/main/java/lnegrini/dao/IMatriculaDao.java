package lnegrini.dao;

import lnegrini.domain.Curso;
import lnegrini.domain.Matricula;

import java.util.List;

public interface IMatriculaDao {

    Matricula cadastrar(Matricula matricula);

    List<Matricula> buscarTodos();

    void excluir(Matricula matricula);

    Matricula buscarPorCurso(Curso curso);
}
