/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.UserRole;
import model.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Accio
 */
public class DaftarRoleUser {
    
    public DaftarRoleUser() {
        emf = Persistence.createEntityManagerFactory("elearningpkmPU");
    }
    private EntityManagerFactory emf = null;

    //add default admin user

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public List<UserRole> getUserRole() {
        List<UserRole> userrole = new ArrayList<UserRole>();
        
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT a FROM UserRole AS a");
            userrole = q.getResultList();
            
        } finally {
            em.close();
        }
        return userrole;
    }
    
    public UserRole findUserRole(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(UserRole.class, id);
        } finally {
            em.close();
        }
    }
    
    public boolean check(String username, String password) {
        boolean result = false;
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT count(a) FROM User AS a WHERE a.username=:uname AND a.password=:pass");
            q.setParameter("uname", username);
            q.setParameter("pass", password);
            int jumlahUser = ((Long) q.getSingleResult()).intValue();
            if (jumlahUser == 1) {
                result = true;
            }
        } finally {
            em.close();
        }
        return result;
    }
    
    public void rekamUserRole(UserRole userrole) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(userrole);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void updateUserRole(UserRole userrole) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(userrole);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
    public void deleteUserRole(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            UserRole userrole;
            try {
                userrole = em.getReference(UserRole.class, id);
                userrole.getRoleId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The user with id " + id + " no longer exists.", enfe);
            }
            em.remove(userrole);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public UserRole getUserRole(String rolename, String roleid) {
        UserRole userrole = null;
        EntityManager em = getEntityManager();
        try {
            boolean hasilCheck = this.check(rolename, roleid);
            if (hasilCheck) {
                Query q = em.createQuery("SELECT a FROM UserRole AS a WHERE a.roleName=:rolename AND a.roleId=:roleid");
                q.setParameter("rolename", rolename);
                q.setParameter("roleid", roleid);
                userrole = (UserRole) q.getSingleResult();
            }
        } finally {
            em.close();
        }
        return userrole;
    }
    
    public UserRole findUserRole(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(UserRole.class, id);
        } finally {
            em.close();
        }
    }
    

    public void editRole(UserRole userrole) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            userrole = em.merge(userrole);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void destroy(long iduserrole) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            UserRole userrole;
            try {
                userrole = em.getReference(UserRole.class, iduserrole);
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("userrole belum dipilih.", enfe);
            }
            em.remove(userrole);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
