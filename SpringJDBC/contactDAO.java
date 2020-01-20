package com.SpringJDBC;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class contactDAO {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(String name,String email,String address,String telephone){
     String insertQuery = "INSERT INTO contact(name,email,address,telephone)"+"VALUES(?,?,?,?)";
        int response = jdbcTemplate.update(insertQuery,name,email,address,telephone);
        return response;
    }
    public int update(String email,String name){
        String updateQuery = "UPDATE contact set email =? where name=?";
        int response = jdbcTemplate.update(updateQuery,email,name);
        return response;
    }
    public int delete(String name){
        String deleteQuery = "DELETE FROM contact where name =?";
        int response = jdbcTemplate.update(deleteQuery,name);
        return response;
    }

    public List<Contact> getAllContacts(){
String query = "select * from contact";

 return jdbcTemplate.query(query, new RowMapper<Contact>() {

     public Contact mapRow(ResultSet rs, int rowNum) throws SQLException{
         Contact contact = new Contact();

         try{ contact.setName(rs.getString("name"));
             contact.setAddress(rs.getString("address"));
             contact.setContactid(rs.getInt("contactid"));
             contact.setEmail(rs.getString("email"));
             contact.setTelephone(rs.getString("telephone"));}
         catch(Exception e){}
       return contact;
     }
});

}
    public Contact getContactByContactId(int contactid){
        String query = "select * from contact where contactid = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{contactid}, new RowMapper<Contact>() {

            @Override
            public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
                Contact contact = new Contact();

                try{ contact.setName(rs.getString("name"));
                    contact.setAddress(rs.getString("address"));
                    contact.setContactid(rs.getInt("contactid"));
                    contact.setEmail(rs.getString("email"));
                    contact.setTelephone(rs.getString("telephone"));}
                catch(Exception e){}
                return contact;
            }
        });
}}
