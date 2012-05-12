/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.UserRole;
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
public class UserRoleJpaController implements Serializable {

    public UserRoleJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(UserRole userRole) throws PreexistingEntityException, Exception {
        if (userRole.getUserCollection() == null) {
            userRole.setUserCollection(new ArrayList<User>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<User> attachedUserCollection = new ArrayList<User>();
            for (User userCollectionUserToAttach : userRole.getUserCollection()) {
                userCollectionUserToAttach = em.getReference(userCollectionUserToAttach.getClass(), userCollectionUserToAttach.getId());
                attachedUserCollection.add(userCollectionUserToAttach);
            }
            userRole.setUserCollection(attachedUserCollection);
            em.persist(userRole);
            for (User userCollectionUser : userRole.getUserCollection()) {
                UserRole oldRoleIdOfUserCollectionUser = userCollectionUser.getRoleId();
                userCollectionUser.setRoleId(userRole);
                userCollectionUser = em.merge(userCollectionUser);
                if (oldRoleIdOfUserCollectionUser != null) {
                    oldRoleIdOfUserCollectionUser.getUserCollection().remove(userCollectionUser);
                    oldRoleIdOfUserCollectionUser = em.merge(oldRoleIdOfUserCollectionUser);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findUserRole(userRole.getRoleId()) != null) {
                throw new PreexistingEntityException("UserRole " + userRole + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(UserRole userRole) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            UserRole persistentUserRole = em.find(UserRole.class, userRole.getRoleId());
            Collection<User> userCollectionOld = persistentUserRole.getUserCollection();
            Collection<User> userCollectionNew = userRole.getUserCollection();
            Collection<User> attachedUserCollectionNew = new ArrayList<User>();
            for (User userCollectionNewUserToAttach : userCollectionNew) {
                userCollectionNewUserToAttach = em.getReference(userCollectionNewUserToAttach.getClass(), userCollectionNewUserToAttach.getId());
                attachedUserCollectionNew.add(userCollectionNewUserToAttach);
            }
            userCollectionNew = attachedUserCollectionNew;
            userRole.setUserCollection(userCollectionNew);
            userRole = em.merge(userRole);
            for (User userCollectionOldUser : userCollectionOld) {
                if (!userCollectionNew.contains(userCollectionOldUser)) {
                    userCollectionOldUser.setRoleId(null);
                    userCollectionOldUser = em.merge(userCollectionOldUser);
                }
            }
            for (User userCollectionNewUser : userCollectionNew) {
                if (!userCollectionOld.contains(userCollectionNewUser)) {
                    UserRole oldRoleIdOfUserCollectionNewUser = userCollectionNewUser.getRoleId();
                    userCollectionNewUser.setRoleId(userRole);
                    userCollectionNewUser = em.merge(userCollectionNewUser);
                    if (oldRoleIdOfUserCollectionNewUser != null && !oldRoleIdOfUserCollectionNewUser.equals(userRole)) {
                        oldRoleIdOfUserCollectionNewUser.getUserCollection().remove(userCollectionNewUser);
                        oldRoleIdOfUserCollectionNewUser = em.merge(oldRoleIdOfUserCollectionNewUser);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = userRole.getRoleId();
                if (findUserRole(id) == null) {
                    throw new NonexistentEntityException("The userRole with id " + id + " no longer exists.");
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
            UserRole userRole;
            try {
                userRole = em.getReference(UserRole.class, id);
                userRole.getRoleId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The userRole with id " + id + " no longer exists.", enfe);
            }
            Collection<User> userCollection = userRole.getUserCollection();
            for (User userCollectionUser : userCollection) {
                userCollectionUser.setRoleId(null);
                userCollectionUser = em.merge(userCollectionUser);
            }
            em.remove(userRole);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<UserRole> findUserRoleEntities() {
        return findUserRoleEntities(true, -1, -1);
    }

    public List<UserRole> findUserRoleEntities(int maxResults, int firstResult) {
        return findUserRoleEntities(false, maxResults, firstResult);
    }

    private List<UserRole> findUserRoleEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(UserRole.class));
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

    public UserRole findUserRole(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(UserRole.class, id);
        } finally {
            em.close();
        }
    }

    public int getUserRoleCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<UserRole> rt = cq.from(UserRole.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
