/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.telacad.dao.ProductDao;
import ro.telacad.db.Product;

/**
 *
 * @author crist
 */
@Service
public class ProductService {

    @Autowired
    private ProductDao dao;

    @Transactional(noRollbackFor = RuntimeException.class)
    public void adaugaProduse() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) throw new RuntimeException();
            Product p = new Product("Produs " + i);
            dao.adaugaProdus(p);
        }
    }
    
    @Transactional
    public void adaugaDouaProduse() {
        dao.adaugaProdusUnu();
        try{
            dao.adaugaProdusDoi();
        }catch(Exception e) {
            System.out.println(":)");
        }
    }

}
