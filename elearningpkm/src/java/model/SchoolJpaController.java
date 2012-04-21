/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.School;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import entity.User;
import java.util.ArrayList;
import java.util.Collection;
import model.exceptions.NonexistentEntityException;
import model.exceptions.PreexistingEntityException;

/**
 *
 * @author Accio
 */
public class SchoolJpaController implements Serializable {

    public SchoolJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(School school) throws PreexistingEntityException, Exception {
        if (school.getUserCollection() == null) {
            school.setUserCollection(new ArrayList<User>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<User> attachedUserCollection = new ArrayList<User>();
            for (User userCollectionUserToAttach : school.getUserCollection()) {
                userCollectionUserToAttach = em.getReference(userCollectionUserToAttach.getClass(), userCollectionUserToAttach.getId());
                attachedUserCollection.add(userCollectionUserToAttach);
            }
            school.setUserCollection(attachedUserCollection);
            em.persist(school);
            for (User userCollectionUser : school.getUserCollection()) {
                School oldSchoolIdOfUserCollectionUser = userCollectionUser.getSchoolId();
                userCollectionUser.setSchoolId(school);
                userCollectionUser = em.merge(userCollectionUser);
                if (oldSchoolIdOfUserCollectionUser != null) {
                    oldSchoolIdOfUserCollectionUser.getUserCollection().remove(userCollectionUser);
                    oldSchoolIdOfUserCollectionUser = em.merge(oldSchoolIdOfUserCollectionUser);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSchool(school.getSchoolId()) != null) {
                throw new PreexistingEntityException("School " + school + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(School school) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            School persistentSchool = em.find(School.class, school.getSchoolId());
            Collection<User> userCollectionOld = persistentSchool.getUserCollection();
            Collection<User> userCollectionNew = school.getUserCollection();
            Collection<User> attachedUserCollectionNew = new ArrayList<User>();
            for (User userCollectionNewUserToAttach : userCollectionNew) {
                userCollectionNewUserToAttach = em.getReference(userCollectionNewUserToAttach.getClass(), userCollectionNewUserToAttach.getId());
                attachedUserCollectionNew.add(userCollectionNewUserToAttach);
            }
            userCollectionNew = attachedUserCollectionNew;
            school.setUserCollection(userCollectionNew);
            school = em.merge(school);
            for (User userCollectionOldUser : userCollectionOld) {
                if (!userCollectionNew.contains(userCollectionOldUser)) {
                    userCollectionOldUser.setSchoolId(null);
                    userCollectionOldUser = em.merge(userCollectionOldUser);
                }
            }
            for (User userCollectionNewUser : userCollectionNew) {
                if (!userCollectionOld.contains(userCollectionNewUser)) {
                    School oldSchoolIdOfUserCollectionNewUser = userCollectionNewUser.getSchoolId();
                    userCollectionNewUser.setSchoolId(school);
                    userCollectionNewUser = em.merge(userCollectionNewUser);
                    if (oldSchoolIdOfUserCollectionNewUser != null && !oldSchoolIdOfUserCollectionNewUser.equals(school)) {
                        oldSchoolIdOfUserCollectionNewUser.getUserCollection().remove(userCollectionNewUser);
                        oldSchoolIdOfUserCollectionNewUser = em.merge(oldSchoolIdOfUserCollectionNewUser);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = school.getSchoolId();
                if (findSchool(id) == null) {
                    throw new NonexistentEntityException("The school with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            School school;
            try {
                school = em.getReference(School.class, id);
                school.getSchoolId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The school with id " + id + " no longer exists.", enfe);
            }
            Collection<User> userCollection = school.getUserCollection();
            for (User userCollectionUser : userCollection) {
                userCollectionUser.setSchoolId(null);
                userCollectionUser = em.merge(userCollectionUser);
            }
            em.remove(school);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<School> findSchoolEntities() {
        return findSchoolEntities(true, -1, -1);
    }

    public List<School> findSchoolEntities(int maxResults, int firstResult) {
        return findSchoolEntities(false, maxResults, firstResult);
    }

    private List<School> findSchoolEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(School.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public School findSchool(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(School.class, id);
        } finally {
            em.close();
        }
    }

    public int getSchoolCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<School> rt = cq.from(School.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
