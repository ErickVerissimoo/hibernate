/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.jpaandhibernate;


import com.mycompany.jpaandhibernate.DAOs.reuniãoDAO;
import com.mycompany.jpaandhibernate.entitites.reuniao;
import com.mycompany.jpaandhibernate.utils.JpaUtils;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class JPAandHibernate {
    
  private static final PrintStream out = new PrintStream(System.out);
    public static void main(String[] args) {
       reuniãoDAO reunion = new reuniãoDAO(JpaUtils.getEntityManager());
    Scanner entrada = new Scanner(System.in);   
    var escolha  = showMenu(entrada);
   if(escolha ==1){
     var reuniao = new reuniao();
     out.println("""
                 Entre com o nome da reunião:
                 """);
     entrada.nextLine();
     reuniao.setNome(entrada.nextLine());
     out.print("\nEntre com a descrição: ");
     reuniao.setDescricao(entrada.nextLine());
     out.print("\nAno:" );
     int ano = entrada.nextInt();
     out.print("\nMês: ");
     int mes = entrada.nextInt();
     out.print("\ndia: ");
     int dia = entrada.nextInt();
     out.print("\nhora: ");
     int hora = entrada.nextInt();
     out.print("\nminuto: ");
     int minuto = entrada.nextInt();
     reuniao.setHora(LocalDateTime.of(ano, mes, dia,hora, minuto).atZone(ZoneId.systemDefault()).toLocalDateTime());
     reunion.add(reuniao);
     out.print("\nAdicionado com sucesso");
   }
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
