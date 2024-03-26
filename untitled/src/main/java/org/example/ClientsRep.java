package org.example;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;

public class ClientsRep implements IRepository<Clients>{
    @PersistenceContext
    public EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();
    @Override
    public void addObj(Clients client) throws SQLException {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(client);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    @Transactional
    public void delete(long id) throws SQLException {
        Clients delClient = em.find(Clients.class, id);
        if (delClient != null) {
        delClient.setExist(false);
        em.merge(delClient);}
        else{
        }
    }

    @Override
    @Transactional
    public void update(Clients client) throws SQLException {
        EntityTransaction transaction = em.getTransaction();
        try {
            Clients updatedClient = em.merge(client);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public Clients find(long id) {
        return em.find(Clients.class, id);
    }

    @Override
    public List<Clients> getAll() throws SQLException {
        return em.createQuery("SELECT c FROM Clients c", Clients.class).getResultList();
    }
}
