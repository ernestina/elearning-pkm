/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Course;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import model.exceptions.NonexistentEntityException;

/**
 *
 * @author Accio
 */
public class CourseList {

    public CourseList() {
        emf = Persistence.createEntityManagerFactory("elearningpkmPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public List<Course> getCourse() {
        List<Course> course = new ArrayList<Course>();

        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT a FROM Course AS a");
            course = q.getResultList();

        } finally {
            em.close();
        }
        return course;
    }

    public Course findCourse(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Course.class, id);
        } finally {
            em.close();
        }
    }

    public void rekamAssignment(Course course) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Course course) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            course = em.merge(course);
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
            Course course;
            try {
                course = em.getReference(Course.class, id);
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("Course belum dipilih.", enfe);
            }
            em.remove(course);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    } 
}
