/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.eduarda.pilhasfilas;

import java.util.Scanner;

/**
 *
 * @author 00247694
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilhaDeposito pilha = new PilhaDeposito(10);
        

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        while(true){
            System.out.println("Organizar caixas:" + "\n Selecione a opção desejada: \n"
                               + "1. Adicionar caixa \n" + "2. Retirar caixa \n" + "3. Listar caixa/produtos");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
          switch(opcao){
              case 1:
                if(!pilha.isFull()){
                 System.out.print("Informe o código de produto: ");
                 String cdProduto = scanner.nextLine();
                 
                 System.out.print("Informe a descrição do produto: ");
                 String dsProduto = scanner.nextLine();
                 
                 System.out.print("Informe a data de entrada do produto: ");
                 String dtEntrada = scanner.nextLine();
                 
                 System.out.print("Informe o estado de origem do produto (UF): ");
                 String ufOrigem = scanner.nextLine();
                 
                 System.out.print("Informe o estado de destino do produto (UF): ");
                 String ufDestino = scanner.nextLine();
                 
                 Produto produto = new Produto(cdProduto, dsProduto, dtEntrada, ufOrigem, ufDestino);
                 pilha.push(produto);
                 System.out.print("Produto" + produto + " adicionado com sucesso! \n");
                 
                  retornaLista(pilha);
                } else {
                    System.out.print("Não há espaço na fila. Verifique! \n");
                }
              break;
              case 2:
                  if(!pilha.isEmpty()){
                      Produto produtoOut = pilha.pop();
                      System.out.println("Produto " + produtoOut + " removido com sucesso! \n");
                      
                      retornaLista(pilha);
                      
                  } else {
                      System.out.println("Não há valores na pilha.");
                  }
                  break;      
                  
              case 3:
                  if(!pilha.isEmpty()){
                      PilhaDeposito tempoPilha = new PilhaDeposito(10);
                      System.out.println("\n Produtos inseridos na pilha: \n");
                      while(!pilha.isEmpty()){
                          Produto produto = pilha.pop();
                          System.out.println(produto);
                          tempoPilha.push(produto);
                      }
                      
                      while(!tempoPilha.isEmpty()){
                          pilha.push(tempoPilha.pop());
                      }
                  } else {
                      System.out.println("Sem valores para a pilha! \n");
                  }
              default:
                 break;
          }
          
          
        }
    }
    
   
    
    // Função
    
    private static void retornaLista(PilhaDeposito pilha){
        if(!pilha.isEmpty()){
            PilhaDeposito pilhaTempo = new PilhaDeposito(10);
            System.out.println("Status da pilha:");
            while (!pilha.isEmpty()) {
                Produto produto = pilha.pop();
                System.out.println(produto);
                pilhaTempo.push(produto); // armazena temporariamente
            }
            while (!pilhaTempo.isEmpty()) {
                pilha.push(pilhaTempo.pop()); // restaura os produtos na pilha original
            }
        } else {
            System.out.println("Sem produtos na pilha.");
        }
    }
}


