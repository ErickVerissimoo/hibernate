/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaandhibernate.DAOs;

import com.mycompany.jpaandhibernate.entitites.reuniao;
import static com.mycompany.jpaandhibernate.utils.HibernateUtils.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

/**
 *
 * @author Erick
 */
public class reuniãoDAO implements GenericDAO<reuniao, Integer> {

    private EntityManager manager = null;

    public reuniãoDAO(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void add(reuniao entity) {

        EntityTransaction transacao = getTransaction(manager);
        transacao.begin();
        manager.persist(entity);
        transacao.commit();
        
    }

    @Override
    public reuniao get(Integer id) {

        return manager.find(reuniao.class, id);
    }

    @Override
    public void update(reuniao entity) {
        EntityTransaction transacao = getTransaction(manager);
        transacao.begin();
        manager.merge(entity);
        transacao.begin();
    }

    @Override
    public void delete(Integer id) {  
       EntityTransaction transacao = manager.getTransaction();
       transacao.begin();
       manager.remove(this.get(id));
       transacao.commit();  
    }

    @Override
    public List<reuniao> getAll() {
        manager.getTransaction().begin();
        List<reuniao> querie = manager.createNativeQuery("select * from reuniao").getResultList();
        manager.getTransaction().commit();
        return querie;
    }

}
