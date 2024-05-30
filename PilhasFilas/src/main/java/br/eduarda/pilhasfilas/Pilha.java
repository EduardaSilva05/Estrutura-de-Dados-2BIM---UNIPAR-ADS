/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eduarda.pilhasfilas;

/**
 *
 * @author Eduarda
 */
public class Pilha<String> {
    private String[]pilha;
    private int posicaoTopo;
    
    public Pilha(int tamanho){
        pilha = (String[]) new Object[tamanho];
        posicaoTopo = -1;
    }
    
    public void push(String elemento){
        pilha[++posicaoTopo] = elemento;
    }
    
    public String pop(){
        return pilha[posicaoTopo--];
    }
    
    public String top(){
        return pilha[posicaoTopo];
    }
    
    public boolean isEmpty(){
        return posicaoTopo == -1;
    }
    
    public boolean isFull(){
        return posicaoTopo == pilha.length-1;
    }
    
    
}
