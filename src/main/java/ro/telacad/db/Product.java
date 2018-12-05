/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.db;

import java.io.Serializable;

/**
 *
 * @author crist
 */
public class Product implements Serializable {

    private int id;
    private String nume;

    public Product() {
    }

    public Product(String nume) {
        this.nume = nume;
    }

    public Product(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

}
