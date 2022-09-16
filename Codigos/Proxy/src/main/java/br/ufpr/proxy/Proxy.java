/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.ufpr.proxy;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class Proxy {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

      //Cria cada Proxy para encapsular o acesso a classe "PessoaImpl"
            pessoas.add(new ProxyPessoa("A"));
            pessoas.add(new ProxyPessoa("B"));
            pessoas.add(new ProxyPessoa("C"));

            System.out.println("Nome: " + pessoas.get(0).getNome());
            // busca do banco de dados
            System.out.println("Nome: " + pessoas.get(1).getNome());
            // busca do banco de dados
            System.out.println("Nome: " + pessoas.get(0).getNome());
            // já buscou esta pessoa... apenas retorna do cache...

            // A terceira pessoa nunca será consultada no banco de dados
            (melhor performance - lazy loading)
            System.out.println("Id da 3ª - " + pessoas.get(2).getId());
            //pode imprimir o ID do objeto, e o proxy nao será inicializado.
      }
    }
}
