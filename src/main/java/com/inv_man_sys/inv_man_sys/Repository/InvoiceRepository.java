package com.inv_man_sys.inv_man_sys.Repository;

import java.util.List;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.inv_man_sys.inv_man_sys.Entity.Invoice;

@Repository
public class InvoiceRepository {
    
    private JdbcTemplate jdbc;

    public InvoiceRepository(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }
    
    public List<Invoice> findAll(){
        String sql = "SELECT * FROM Invoice ORDER BY due_date DESC";
        return jdbc.query(sql, (rs, i) -> new Invoice(
            rs.getString("customer_name"),
            rs.getDate("issue_date"),
            rs.getDate("due_date"),
            rs.getString("item_name"),
            rs.getString("comment"),
            rs.getDouble("price")
        ));
    }

}