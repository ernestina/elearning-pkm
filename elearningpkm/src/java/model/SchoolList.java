/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Course;
import entity.School;
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
public class SchoolList {
    
    public SchoolList() {
        emf = Persistence.createEntityManagerFactory("elearningpkmPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List<School> getSchool() {
        List<School> school = new ArrayList<School>();

        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT a FROM School AS a");
            school = q.getResultList();

        } finally {
            em.close();
        }
        return school;
    }

    public School findSchool(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(School.class, id);
        } finally {
            em.close();
        }
    }

    public void rekamSchool(School school) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(school);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(School school) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            school = em.merge(school);
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
            School school;
            try {
                school = em.getReference(School.class, id);
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("School belum dipilih.", enfe);
            }
            em.remove(school);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
 
    public List<School> findSchoolById(String kode){
        EntityManager em = getEntityManager();
        try {
            Query query = em.createNamedQuery("School.findBySchoolId");
            query.setParameter("school", "%"+kode+"%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}
