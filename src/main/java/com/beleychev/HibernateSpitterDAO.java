package com.beleychev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ilya on 17.06.15.
 */
@Repository
public class HibernateSpitterDAO implements SpitterDAO {
    private SessionFactory sessionFactory;

    @Autowired
    public HibernateSpitterDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory; //Construct DAO
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addSpitter(Spitter spitter) {
        currentSession().save(spitter);
    }

    public void saveSpitter(Spitter spitter) {
        currentSession().update(spitter);
    }

    public Spitter getSpitterById(long id) {
        return (Spitter) currentSession().get(Spitter.class, id);
    }

    public List<Spittle> getRecentSpittle() {
        return null;
    }

    public void saveSpittle(Spittle spittle) {

    }

    public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
        return null;
    }

    public Spitter getSpitterByUsername(String username) {
        return null;
    }

    public void deleteSpittle(long id) {

    }

    public Spittle getSpittleById(long id) {
        return null;
    }

    public List<Spitter> findAllSpitters() {
        return null;
    }
}
