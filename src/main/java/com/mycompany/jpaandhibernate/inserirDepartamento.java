/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaandhibernate;

import com.mycompany.jpaandhibernate.DAOs.DepartmentDAO;
import com.mycompany.jpaandhibernate.DAOs.EmployeeDAO;
import com.mycompany.jpaandhibernate.entitites.Department;
import com.mycompany.jpaandhibernate.entitites.Employee;
import com.mycompany.jpaandhibernate.utils.HibernateUtils;

/**
 *
 * @author Erick
 */
public class inserirDepartamento {
    public static void main(String[] args) {
        Department departamento = new Department();
        departamento.setNome("Recursos humanos");
        DepartmentDAO dao = new DepartmentDAO(HibernateUtils.buildSesssion().openSession());
        dao.add(departamento);
        Employee empregado = new Employee();
        empregado.setEmail("erickvs@gmail.com");
        empregado.setIdade(24);
        empregado.setNome("erick verissimo");
        empregado.setDepartamento(departamento);
        EmployeeDAO dau = new EmployeeDAO(HibernateUtils.buildSesssion().openSession());
       dau.add(empregado);
    }
}
