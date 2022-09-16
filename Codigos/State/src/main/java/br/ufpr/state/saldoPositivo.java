/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufpr.state;

/**
 *
 * @author User
 */
public class saldoPositivo implements IContaState{
    private Conta _conta;

  public saldoPositivo(Conta PConta)
  {
      this._conta = PConta;
  }

  #region [IContaState Members]
  public void Saque(double valor)
  {
      this._conta.Saldo -= valor;
      Console.WriteLine("Retirado Rnbsp;{0},
      saldoatualRnbsp;{1}.",valor,this._conta.Saldo);
      if(this._conta.Saldo&lt;0)
      if(this._conta.Saldo&lt;-100.00)
      this._conta.MeuEstado=newbloqueado(this._conta);
      else
      this._conta.MeuEstado=newsaldoNegativo(this._conta);
    }

      publicvoidDeposito(doublevalor)
      {
        this._conta.Saldo+=valor;
      Console.WriteLine("FoidepositadoRnbsp;{0},
      saldoatualRnbsp;{1}",valor,this._conta.Saldo);
      if(this._conta.Saldo&lt;0)
      if(this._conta.Saldo&lt;-100.00)
      this._conta.MeuEstado=newbloqueado(this._conta);
      else
      this._conta.MeuEstado=newsaldoNegativo(this._conta);
    }
      #endregion

    @Override
    public void Saque(Double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Deposito(Double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

      publicclasssaldoNegativo:IContaState
      {
        privateConta_conta;

      publicsaldoNegativo(ContaPConta)
      {
        this._conta=PConta;
    }

      #region[IContaStateMembers]
      publicvoidSaque(doublevalor)
      {
        this._conta.Saldo-=valor;
      Console.WriteLine("RetiradoRnbsp;{0},
      saldoatualRnbsp;{1}.",valor,this._conta.Saldo);

      if(this._conta.Saldo&lt;-100.00)
      this._conta.MeuEstado=newbloqueado(this._conta);
    }

      publicvoidDeposito(doublevalor)
      {
        this._conta.Saldo+=valor;
      Console.WriteLine("FoidepositadoRnbsp;{0},
      saldoatualRnbsp;{1}",valor,this._conta.Saldo);
      if(this._conta.Saldo&gt;=-100.00)
      if(this._conta.Saldo&lt;0)
      this._conta.MeuEstado=newsaldoNegativo(this._conta);
      else
      this._conta.MeuEstado=newsaldoPositivo(this._conta);
    }
      #endregion
    }

      publicclassbloqueado:IContaState
      {
        privateConta_conta;

      publicbloqueado(ContaPConta)
      {
        this._conta=PConta;
    }

      #region[IContaStateMembers]
      publicvoidSaque(doublevalor)
      {
        Console.WriteLine("Contabloqueada,saquecancelado,
        saldoatualRnbsp;{1}.",valor,this._conta.Saldo);
    }

      publicvoidDeposito(doublevalor)
      {
        this._conta.Saldo+=valor;
      Console.WriteLine("FoidepositadoRnbsp;{0},saldoatualRnbsp;{1}",valor,this._conta.Saldo);
      if(this._conta.Saldo&lt;0)
      {
        if(this._conta.Saldo&lt;-100.00)
      this._conta.MeuEstado=newbloqueado(this._conta);
    }
      else
      {
        this._conta.MeuEstado=newsaldoPositivo(this._conta);
  }
}
#endregion
}
