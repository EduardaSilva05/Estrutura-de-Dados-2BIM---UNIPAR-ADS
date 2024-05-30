/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eduarda.pilhasfilas;

/**
 *
 * @author Eduarda
 */
public class Fila {
    private String[]vetorDados;
    private int frente;
    private int fim;
    private int qntItens;
    
    public Fila(int tamanho){
        vetorDados = new String[tamanho];
        frente = 0;
        fim = -1;
        qntItens = 0; 
    }
    
    public void enqueue(String nome){
        if(fim == vetorDados.length - 1){
            fim = -1;
        }
        
        vetorDados[++fim] = nome;
        qntItens++;
        
    }
    
    public String dequeue(){
        String aux = vetorDados[frente++];
        if(frente == vetorDados.length){
            frente = 0;
        }
        
        qntItens--;
        return aux;
    }
    
    
    public boolean isEmpty(){
        return qntItens == 0;
    }
 
    public boolean isFull(){
        return qntItens == vetorDados.length;
    }
}
