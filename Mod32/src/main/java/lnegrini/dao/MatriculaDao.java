package lnegrini.dao;

import lnegrini.domain.Curso;
import lnegrini.domain.Matricula;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class MatriculaDao implements IMatriculaDao{

    @Override
    public Matricula cadastrar(Matricula matricula) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ProjetoJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        if (matricula.getCurso() != null) {
            matricula.setCurso(entityManager.merge(matricula.getCurso()));
        }
        entityManager.persist(matricula);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return matricula;
    }

    @Override
    public List<Matricula> buscarTodos() {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ProjetoJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Matricula> query = builder.createQuery(Matricula.class);
        Root<Matricula> root = query.from(Matricula.class);
        query.select(root);

        TypedQuery<Matricula> tpQuery =
                entityManager.createQuery(query);
        List<Matricula> list = tpQuery.getResultList();

        entityManager.close();
        entityManagerFactory.close();
        return list;
    }

    @Override
    public void excluir(Matricula matricula) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ProjetoJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        matricula = entityManager.merge(matricula);
        entityManager.remove(matricula);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    @Override
    public Matricula buscarPorCurso(Curso curso) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ProjetoJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT m FROM Matricula m ");
        sb.append("INNER JOIN Curso c on c = m.curso ");
        sb.append("WHERE c = :curso");

        entityManager.getTransaction().begin();
        TypedQuery<Matricula> query =
                entityManager.createQuery(sb.toString(), Matricula.class);
        query.setParameter("curso", curso);
        Matricula matricula = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }
}
