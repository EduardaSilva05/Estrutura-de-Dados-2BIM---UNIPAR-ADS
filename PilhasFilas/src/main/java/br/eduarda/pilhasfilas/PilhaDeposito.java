/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eduarda.pilhasfilas;

/**
 *
 * @author 00247694
 */
public class PilhaDeposito {
    private Produto[]pilha;
    private int psTopo;
    
    public PilhaDeposito(int tamanho){
        pilha = new Produto[tamanho];
        psTopo = -1;
    }
    
    public boolean isEmpty(){
        return psTopo == -1;
    }
    
    public boolean isFull(){
        return psTopo == pilha.length-1;
    }
    
    //Adiciona
    public void push(Produto elemento){
        pilha[++psTopo] = elemento;
    }
    
    //Remove
    public Produto pop(){
        return pilha[psTopo--];
    }
    
    //Retorna oq esta no topo da pilha
    public Produto top(){
        return pilha[psTopo];
    }
}
