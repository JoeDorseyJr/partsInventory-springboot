package com.joedorseyjr.partsInventory.DAO;

import com.joedorseyjr.partsInventory.entity.Part;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PartIMPL implements PartDAO{
    private final EntityManager entityManager;

    public PartIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Part> findAll() {
        Session session = entityManager.unwrap(Session.class);
        Query<Part>partQuery = session.createQuery("FROM part");
        return partQuery.getResultList();
    }

    @Override
    @Transactional
    public Object findById(Long id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Part.class,id);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Part part) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(part);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Session session = entityManager.unwrap(Session.class);
        Part part = session.get(Part.class,id);
        session.delete(part);
    }
}
