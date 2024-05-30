/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.eduarda.pilhasfilas;

import java.util.Scanner;

/**
 *
 * @author Eduarda
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        FilaCliente filaPrioritaria = new FilaCliente(100);
        FilaCliente filaNormal = new FilaCliente(100);
        
        int senha = 1;
        int prioritarios = 0;
        do{
             System.out.println("Fila de atendimento:" + "\n Selecione a opção desejada: \n"
                + "1. Adicionar Cliente \n" + "2. Chamar Cliente \n" + "3. Finalizar");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
        switch(opcao){
            case 1:
            if(!filaPrioritaria.isFull() && !filaNormal.isFull()){
                System.out.print("Nome do Cliente: ");
                String nmCliente = scanner.nextLine();
            
                System.out.print("Ano de nascimento:  ");
                int anoNascimento = scanner.nextInt();
                scanner.nextLine();
                
                Cliente clientes  = new Cliente(senha++, nmCliente, anoNascimento);
                
                if(clientes.getIdade(2024) >= 60){
                    filaPrioritaria.enqueue(clientes);
                    System.out.println("Cliente " + nmCliente + " foi adicionado a fila");
                } else {
                    filaNormal.enqueue(clientes);
                    System.out.println("Cliente " + nmCliente + " foi adicionado a fila");
                }
            } else {
                System.out.println("Fila sem espaço.");
            }
           break;
            case 2:
               if(prioritarios < 2 && filaPrioritaria.isEmpty()){
                   Cliente clienteAtual = filaPrioritaria.dequeue();
                   System.out.println("Cliente prioritario: " + clienteAtual);
                   prioritarios++;
               } else if(!filaNormal.isEmpty()){
                   Cliente clienteAtual = filaNormal.dequeue();
                   System.out.println("Fila normal, próximo cliente: " + clienteAtual);
                   prioritarios = 0;
               } else if(!filaPrioritaria.isEmpty()){
                   Cliente clienteAtual = filaPrioritaria.dequeue();
                   System.out.println("Cliente prioritario: " + clienteAtual);
              }else {
                   System.out.println("Sem cliente na fila");
               }
               break;
            case 3:
                break;
    }
        } while(opcao != 0 || opcao == 3);
    }
}
