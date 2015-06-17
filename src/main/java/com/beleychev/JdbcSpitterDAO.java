package com.beleychev;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by ilya on 17.06.15.
 */
public class JdbcSpitterDAO implements SpitterDAO{

    public int getID() {
        return 0;
    }

    public int getAge() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public String getEmail() {
        return null;
    }

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
