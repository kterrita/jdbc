package com.beleychev;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by ilya on 17.06.15.
 */
public class JdbcSpitterDAO extends JdbcDaoSupport implements SpitterDAO{

    private JdbcTemplate jdbcTemplate;

    public void addSpitter(Spitter spitter) {

    }

    public void saveSpitter(Spitter spitter) {

    }

    public Spitter getSpitterById(long id) {
        return null;
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
