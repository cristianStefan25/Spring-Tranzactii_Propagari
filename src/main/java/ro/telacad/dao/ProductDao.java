/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ro.telacad.db.Product;

/**
 *
 * @author crist
 */
@Repository
//@Transactional(propagation = Propagation.MANDATORY)
public class ProductDao {

    @Autowired
    private JdbcTemplate template;

    public void adaugaProdus(Product product) {
        String sql = "INSERT INTO produse VALUES(NULL,?)";
        template.update(sql, product.getNume());
    }

    @Transactional
    public void adaugaProdusUnu() {
        String sql = "INSERT INTO produse VALUES(NULL,?)";
        template.update(sql, "UNU");
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void adaugaProdusDoi() {
        String sql = "INSERT INTO produse VALUES(NULL,?)";
        template.update(sql, "DOI");
        throw new RuntimeException();
    }

}
