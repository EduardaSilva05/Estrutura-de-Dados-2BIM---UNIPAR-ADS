/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.eduarda.pilhasfilas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduarda
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Pilha<String> pilha = new Pilha<>(100);
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        while(true){
            System.out.println("Cadastro de livro:" + "\n Selecione a opção desejada: \n"
                + "1. Adicionar Livro \n" + "2. Retirar livro \n" + "3. Listar livros");
            opcao = scanner.nextInt();
            scanner.nextLine();
          
          switch(opcao){
              case 1: 
                  if(!pilha.isFull()){
                  System.out.println("Insira o livro: ");
                  String nmLivro = scanner.nextLine();
                  
                  pilha.push(nmLivro);
                  System.out.println("Livro  " + nmLivro + " adicionado com sucesso.");
                  break;
                  }
              case 2:
                  if(!pilha.isEmpty()){
                      String livroOut = pilha.pop();
                      System.out.println("Livro " + livroOut + " removido.");
                  } else {
                      System.out.println("Sem livros na pilha.");
                  }
                  break;
              case 3:
                  if(!pilha.isEmpty()){
                      Pilha<String> pilhaTempo = new Pilha<>(100);
                      System.out.println("Livros da pilha: ");
                      while(!pilha.isEmpty()){
                          String livroPilha = pilha.pop();
                          System.out.println(livroPilha);
                          pilhaTempo.push(livroPilha);
                      }
                  } else {
                      System.out.println("Sem livros na pilha.");
                  }
              break;
              default:
                  System.out.println("Opcão não existente.");
          }
        }

        
      
    }
}
