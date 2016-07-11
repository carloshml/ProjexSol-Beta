/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.app.EntityManager;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import sun.swing.SwingUtilities2;


/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author PedroLima
 */
public class FabricaPersistente {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static void main (String args [])
    {
        SessionFactory fabrica = FabricaPersistente.getSessionFactory();
        Session sessao = fabrica.openSession();
        sessao.close();
        fabrica.close();
    }
}
