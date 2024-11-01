/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaandhibernate.entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author Erick
 */
@DynamicInsert
@DynamicUpdate
@Entity
@Table(name = "employees")
public class Employee {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return Idade;
    }

    public void setIdade(Integer Idade) {
        this.Idade = Idade;
    }
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String email;
 private String nome;
 private Integer Idade;
 @ManyToOne(fetch = FetchType.LAZY)
 private Department departamento;

    public Department getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Department departamento) {
        this.departamento = departamento;
    }
}
