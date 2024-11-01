/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaandhibernate.DAOs;

import com.mycompany.jpaandhibernate.entitites.Department;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Erick
 */
public class DepartmentDAO implements GenericDAO<Department, Integer>{
private Session sessao;
private Transaction transacao;

public DepartmentDAO(Session sessao){
    this.sessao=sessao;
    this.transacao=sessao.getTransaction();
}
    @Override
    public void add(Department entity) {
        sessao.beginTransaction();
        sessao.persist(entity);
        transacao.commit();
    }

    @Override
    public Department get(Integer id) {
       
       return sessao.find(Department.class, id);
       
    }

    @Override
    public void update(Department entity) {
        sessao.beginTransaction();
        sessao.merge(entity);
        transacao.commit();

    }

    @Override
    public void delete(Integer id) {
        sessao.remove(this.get(id));
    }

    @Override
    public List<Department> getAll() {
       return sessao.createNativeQuery("select * from Department", Department.class).list();
        
    }
    
}
