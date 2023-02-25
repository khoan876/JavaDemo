/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.ndk.javasaleapp;

import com.ndk.pojo.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author admin
 */
public class JavaSaleApp {

    public static void main(String[] args) {
        SessionFactory factory = HibernateUltils.getFactory();
        Session session = factory.openSession();
        System.out.println(factory.getProperties(Product.class, 3));
        session.close();
        
    }
}
