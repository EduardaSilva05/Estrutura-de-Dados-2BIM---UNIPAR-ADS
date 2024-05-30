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
public class Ex5 {
public static void main(String[] args) {
        PilhaDeposito[] pilhas = new PilhaDeposito[5];
    
        for(int i = 0; i < pilhas.length; i++){
            pilhas[i] = new PilhaDeposito(10);
        }
    
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
                System.out.print("Selecione a pilha desejada (0 a 4): ");
                    int pilhaUsuario = scanner.nextInt();
                    scanner.nextLine(); 
                    if (pilhaUsuario < 0 || pilhaUsuario >= pilhas.length) {
                        System.out.println("Pilha não encontrada.");
                        break;
                    }  

                if(!pilhas[pilhaUsuario].isFull()){
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
                 pilhas[pilhaUsuario].push(produto);
                 System.out.print("Produto" + produto + " adicionado com sucesso! \n");
                 
                  retornaPilha(pilhas);
                } else {
                    System.out.print("Não há espaço na fila. Verifique! \n");
                }
              break;
              case 2:
                  System.out.println("Selecione a pilha (0 a 4): ");
                  pilhaUsuario = scanner.nextInt();
                  scanner.nextLine();
                  
                  if (pilhaUsuario < 0 || pilhaUsuario >= pilhas.length) {
                        System.out.println("Pilha não encontrada.");
                        break;
                    }
                  
                  if (!pilhas[pilhaUsuario].isEmpty()) {
                        Produto produtoRemovido = pilhas[pilhaUsuario].pop();
                        System.out.println("Produto removido da pilha " + pilhaUsuario + ": " + produtoRemovido);
                        retornaPilha(pilhas);
                    } else {
                        System.out.println("A pilha " + pilhaUsuario + " está vazia. Nenhum produto para remover.");
                    }
                    break;   
                  
              case 3:
                  retornaPilha(pilhas);
                    break;
              default:
                 break;
          }
  
        }      
}
    
    // Função
private static void retornaPilha(PilhaDeposito[] pilhas) {
        for (int i = 0; i < pilhas.length; i++) {
            PilhaDeposito pilhaTempo = new PilhaDeposito(10);
            System.out.println("Pilha " + i + ":");
            if (pilhas[i].isEmpty()) {
                System.out.println("  A pilha está vazia.");
            } else {
                while (!pilhas[i].isEmpty()) {
                    Produto produto = pilhas[i].pop();
                    System.out.println("  - " + produto);
                    pilhaTempo.push(produto); 
                }
                while (!pilhaTempo.isEmpty()) {
                    pilhas[i].push(pilhaTempo.pop()); 
                }
            }
        }
    }
}
