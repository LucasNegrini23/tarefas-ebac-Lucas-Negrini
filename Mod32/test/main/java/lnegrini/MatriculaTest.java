package main.java.lnegrini;

import lnegrini.dao.CursoDao;
import lnegrini.dao.ICursoDao;
import lnegrini.dao.IMatriculaDao;
import lnegrini.dao.MatriculaDao;
import lnegrini.domain.Curso;
import lnegrini.domain.Matricula;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MatriculaTest {

    private IMatriculaDao matriculaDao;

    private ICursoDao cursoDao;

    public MatriculaTest() {
        matriculaDao = new MatriculaDao();
        cursoDao = new CursoDao();
    }

    @After
    public void end() {
        List<Matricula> list = matriculaDao.buscarTodos();
        list.forEach(matricula -> matriculaDao.excluir(matricula));

        List<Curso> listCursos = cursoDao.buscarTodos();
        listCursos.forEach(curso -> cursoDao.excluir(curso));
    }

    @Test
    public void cadastraMatricula() {
        Curso curso = criarCurso("C2");
        Matricula matricula = new Matricula();
        matricula.setCodigo("A2");
        matricula.setDataMatricula(Instant.now());
        matricula.setStatus("ATIVA");
        matricula.setValor(8000d);
        matricula.setCurso(curso);
        matricula = matriculaDao.cadastrar(matricula);

        assertNotNull(matricula);
        assertNotNull(matricula.getId());
    }

    @Test
    public void pesquisarPorCurso() {
        Curso curso = criarCurso("A3");
        Matricula mat = new Matricula();
        mat.setCodigo("A3");
        mat.setDataMatricula(Instant.now());
        mat.setStatus("ATIVA");
        mat.setValor(7000d);
        mat.setCurso(curso);
        mat = matriculaDao.cadastrar(mat);

        assertNotNull(mat);
        assertNotNull(mat.getId());

        Matricula matricBD = matriculaDao.buscarPorCurso(curso);
        assertNotNull(matricBD);
        assertEquals(mat.getId(), matricBD.getId());
    }

    private Curso criarCurso(String codigo) {
        Curso curso = new Curso();
        curso.setCodigo(codigo);
        curso.setDescricao("CURSO EBAC");
        curso.setNome("Curso de Java Backend");
        return cursoDao.cadastrar(curso);
    }
}
