package com.SpringJDBC1;

import org.springframework.jdbc.core.JdbcTemplate;

public class contactDAO1 {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(String name,String email,String address,String telephone){
        String insertQuery = "INSERT INTO contact(name,email,address,telephone)"+"VALUES(?,?,?,?)";
        int response = jdbcTemplate.update(insertQuery,name,email,address,telephone);
        return response;
    }
}
