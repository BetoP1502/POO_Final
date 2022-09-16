/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufpr.iterator;

/**
 *
 * @author User
 */
public  class MenuIterator implements IIterator {

    MenuItem[] itens;
    int posicao = 0;

    public MenuIterator(MenuItem[] itens) {
        this.itens = itens;
    }

    public Object next() {
        MenuItem menuItem = itens[posicao];
        posicao++;
        return menuItem;
    }

    public boolean hasNext() {
        if (posicao >= itens.length || itens[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }

}
