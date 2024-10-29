/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaandhibernate.DAOs;

import com.mycompany.jpaandhibernate.entitites.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Erick
 */
public class EmployeeDAO implements GenericDAO<Employee, Integer>{
    Session sessao;
    Transaction transaction = null;
    public EmployeeDAO(Session sessao){
        this.sessao=sessao;
        transaction= sessao.getTransaction();
    }
    @Override
    public void add(Employee entity) {
sessao.beginTransaction();
sessao.persist(entity);
transaction.commit();
    }

    @Override
    public Employee get(Integer id) {
return sessao.find(Employee.class, id);
    }

    @Override
    public void update(Employee entity) {
sessao.beginTransaction();
sessao.merge(entity);
transaction.commit();
    }

    @Override
    public void delete(Integer id) {
        sessao.beginTransaction();
sessao.remove(id);
transaction.commit();
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> empregados = sessao.createNativeQuery("select * from employee", Employee.class).getResultList();
    return empregados;
    }
    
}
