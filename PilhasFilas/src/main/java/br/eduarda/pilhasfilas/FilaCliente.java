/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eduarda.pilhasfilas;

/**
 *
 * @author Eduarda
 */
public class FilaCliente {
     private Cliente[]vetorDados;
    private int frente;
    private int fim;
    private int qntItens;
    
    public FilaCliente(int tamanho){
        vetorDados = new Cliente[tamanho];
        frente = 0;
        fim = -1;
        qntItens = 0; 
    }
    
   public void enqueue(Cliente cliente){
        if(fim == vetorDados.length -1){
            fim = -1;
        }
        
        vetorDados[++fim] = cliente;
        qntItens++;
    }
    
    public Cliente dequeue(){
        Cliente aux = vetorDados[frente++];
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
