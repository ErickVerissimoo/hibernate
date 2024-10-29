/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.jpaandhibernate.DAOs;

import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author Erick
 * @param <T>
 * @param <ID>
 */
public interface GenericDAO <T, ID> {
  
    
    void add(T entity);
     T get(ID id);
     void update(T entity);
     void delete(ID id);
     List<T> getAll();

    
}
