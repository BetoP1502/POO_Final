/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufpr.state;

/**
 *
 * @author User
 */
public class Conta {
    public Conta()
    {
        this.Saldo = 0;
    }

    public Conta(Double valor)
    {
        this.MeuEstado = new saldoPositivo(this);
        this.Deposito(valor);
    }

    public Double Saldo { get; set; }
    public IContaState MeuEstado;

    public void Saque(Double valor)
    {
        this.MeuEstado.Saque(valor);
        Console.WriteLine("Estado da conta: {0}\n", this.MeuEstado.ToString());
    }

    public void Deposito(Double valor)
    {
        this.MeuEstado.Deposito(valor);
        Console.WriteLine("Estado da conta: {0}\n", this.MeuEstado.ToString());
    }

}
