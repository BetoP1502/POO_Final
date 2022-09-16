/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufpr.command;

/**
 *
 * @author User
 */
public class ControleRemoto {

    
	Command slot;

	public ControleRemoto() {
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void botaoPressionado() {
		slot.execute();
	}

}
