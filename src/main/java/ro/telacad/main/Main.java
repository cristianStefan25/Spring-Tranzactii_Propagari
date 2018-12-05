/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.telacad.config.ProjectConfig;
import ro.telacad.service.ProductService;

/**
 *
 * @author crist
 */
public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductService service = context.getBean(ProductService.class);
            try {
                service.adaugaDouaProduse();
            } catch (Exception e) {
                System.out.println("EROARE!");
            }
        }
    }

}
