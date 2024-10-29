package com.mycompany.jpaandhibernate.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.Properties;

public abstract class JpaUtils {
    private static final String USER = "erick";
    private static final String PASSWORD = "erick";
    private static final String PERSISTENCE_UNIT_NAME = "enterprise";
    private static EntityManagerFactory factory = buildFactory();

    private static EntityManagerFactory buildFactory() {
        Properties props = new Properties();
        props.setProperty("jakarta.persistence.jdbc.user", USER);
        props.setProperty("jakarta.persistence.jdbc.password", PASSWORD);
        return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, props);
    }

    public static EntityManagerFactory getFactory() {
        return factory;
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static EntityTransaction getTransaction(EntityManager manager) {
        return manager.getTransaction();
    }

    public static void closeFactory() {
        if (factory != null && factory.isOpen()) {
            factory.close();
        }
    }
}
