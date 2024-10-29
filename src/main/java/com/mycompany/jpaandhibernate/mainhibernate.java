/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaandhibernate;

import com.mycompany.jpaandhibernate.DAOs.EmployeeDAO;
import com.mycompany.jpaandhibernate.entitites.Employee;
import com.mycompany.jpaandhibernate.utils.HibernateUtils;

/**
 *
 * @author Erick
 */
public class mainhibernate {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO(HibernateUtils.buildSesssion().openSession());
        Employee empregado = new Employee();
        empregado.setEmail("erickverissimo");
        empregado.setIdade(12);
        empregado.setNome("erick verissimo");
        dao.add(empregado);
    }
}
