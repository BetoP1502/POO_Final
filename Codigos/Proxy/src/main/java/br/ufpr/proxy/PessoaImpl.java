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
 * Objeto real
 */
public class PessoaImpl implements Pessoa {
      private String nome;
      private String id;

      public PessoaImpl(String id,String nome) {
            this.id  = id;
            this.nome = nome;
            // apenas para simular algo...
            System.out.println("Retornou a pessoa do banco de dados ->  " + nome);
      }

      public String getNome() {
            return nome;
      }
      public String getId() {
            return this.id;
      }
}

