/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import model.exceptions.NonexistentEntityException;

/**
 *
 * @author Accio
 */
public class ClassList {

    public ClassList() {
        emf = Persistence.createEntityManagerFactory("elearningpkmPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List<Class> getClassx() {
        List<Class> classx = new ArrayList<Class>();

        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT a FROM Class AS a");
            classx = q.getResultList();

        } finally {
            em.close();
        }
        return classx;
    }

    public Class findClass(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Class.class, id);
        } finally {
            em.close();
        }
    }

    public void rekamClass(Class classx) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(classx);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Class classx) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            classx = em.merge(classx);
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
            Class classx;
            try {
                classx = em.getReference(Class.class, id);
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("Class belum dipilih.", enfe);
            }
            em.remove(classx);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
