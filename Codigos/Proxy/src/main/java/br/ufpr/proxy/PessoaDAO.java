/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufpr.proxy;

/**
 *
 * @author User
 */
/**
 * Imagine que esta classe faz acessos ao banco de dados
 */
class PessoaDAO {
      public static Pessoa getPessoaByID(String id){
            System.out.println("select * from PESSOA where id="+id);
            return new PessoaImpl(id,"Pessoa " + id);
      }
}


