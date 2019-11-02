/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S1.Proyecto.Controladores;

import S1.Proyecto.Controladores.exceptions.NonexistentEntityException;
import S1.Proyecto.Controladores.exceptions.PreexistingEntityException;
import S1.Proyecto.Entidades.Cambiostock;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author WELLINGTON
 */
public class CambiostockJpaController implements Serializable {

    public CambiostockJpaController() {
        this.emf = Persistence.createEntityManagerFactory(NombreConexion.nombreConexion);
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cambiostock cambiostock) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cambiostock);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCambiostock(cambiostock.getCodigo()) != null) {
                throw new PreexistingEntityException("Cambiostock " + cambiostock + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cambiostock cambiostock) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cambiostock = em.merge(cambiostock);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = cambiostock.getCodigo();
                if (findCambiostock(id) == null) {
                    throw new NonexistentEntityException("The cambiostock with id " + id + " no longer exists.");
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
            Cambiostock cambiostock;
            try {
                cambiostock = em.getReference(Cambiostock.class, id);
                cambiostock.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cambiostock with id " + id + " no longer exists.", enfe);
            }
            em.remove(cambiostock);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cambiostock> findCambiostockEntities() {
        return findCambiostockEntities(true, -1, -1);
    }

    public List<Cambiostock> findCambiostockEntities(int maxResults, int firstResult) {
        return findCambiostockEntities(false, maxResults, firstResult);
    }

    private List<Cambiostock> findCambiostockEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cambiostock.class));
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

    public Cambiostock findCambiostock(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cambiostock.class, id);
        } finally {
            em.close();
        }
    }

    public int getCambiostockCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cambiostock> rt = cq.from(Cambiostock.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
