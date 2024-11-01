/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaandhibernate.utils;

import com.mycompany.jpaandhibernate.entitites.Department;
import com.mycompany.jpaandhibernate.entitites.Employee;
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Erick
 */
public  class HibernateUtils {
   private static SessionFactory factory = buildSesssion();
   
public static SessionFactory buildSesssion(){
        Configuration configuracao = new Configuration();
       Properties settings = new Properties();
            settings.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect"); 
            settings.put("hibernate.connection.driver_class", "org.postgresql.Driver");
            settings.put("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres"); 
            settings.put("hibernate.connection.username", "erick"); 
            settings.put("hibernate.connection.password", "erick"); 
            settings.put("hibernate.show_sql", "true");
            settings.put("hibernate.hbm2ddl.auto", "update");

            configuracao.setProperties(settings);

            configuracao.addAnnotatedClass(Employee.class);
            configuracao.addAnnotatedClass(Department.class);
            return configuracao.buildSessionFactory();
    
    }}
    

