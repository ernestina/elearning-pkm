/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Assignment;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.exceptions.NonexistentEntityException;

/**
 *
 * @author Accio
 */
public class AssignmentList {

    public AssignmentList() {
        emf = Persistence.createEntityManagerFactory("elearningpkmPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List<Assignment> getAssignment() {
        List<Assignment> assignment = new ArrayList<Assignment>();

        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT a FROM Assignment AS a");
            assignment = q.getResultList();

        } finally {
            em.close();
        }
        return assignment;
    }

    public Assignment findAssignment(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Assignment.class, id);
        } finally {
            em.close();
        }
    }

    public void rekamAssignment(Assignment assignment) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(assignment);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Assignment assignment) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            assignment = em.merge(assignment);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Assignment assignment;
            try {
                assignment = em.getReference(Assignment.class, id);
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("Assignment belum dipilih.", enfe);
            }
            em.remove(assignment);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
