/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jpaandhibernate;

import com.mycompany.jpaandhibernate.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class JPAandHibernate {
  private static final PrintStream out = new PrintStream(System.out);
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);   
    var escolha  = showMenu(entrada);
   
    }
    
    public static int showMenu(Scanner entrada){
        out.print("""
                   O que você deseja fazer:
                    1 - Adicionar
                    2 - Atualizar
                    3 - Deletar
                    4 - Obter dados
                     : 
                    """);
        
        return entrada.nextInt();
    }
}
