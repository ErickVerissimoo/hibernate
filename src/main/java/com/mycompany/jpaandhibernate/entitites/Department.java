/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaandhibernate.entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Erick
 */
@Entity
public class Department {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Employee> getEmpregados() {
        return empregados;
    }

    public void setEmpregados(List<Employee> empregados) {
        this.empregados = empregados;
    }
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy ="increment")
    private Integer id;
    private String nome;
    @OneToMany(mappedBy = "departamento")
    private List<Employee> empregados;
}
