/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.eduarda.pilhasfilas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduarda
 */
public class Ex1 {

    public static void main(String[] args) {
        Fila fila = new Fila(20);
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String nome;
        
        do{
        System.out.println("Fila de atendimento:" + "\n Selecione a opção desejada: \n"
                + "1. Adicionar Paciente \n" + "2. Chamar Próximo Paciente \n" + "3. Finalizar");
        opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch(opcao){
            case 1:
                if(!fila.isFull()){
                    System.out.println("Insira o nome do paciente: ");
                    nome = scanner.nextLine();
                    fila.enqueue(nome);
                    
                   System.out.println( "Paciente " + nome + " adicionado(a).");
                } else {
                   System.out.println( "Finalizada as senhas do dia de hoje.");
                }
                
                break;
            case 2:
                 String proximo = fila.dequeue();
                    if (proximo != null) {
                        System.out.println("Próximo paciente: " + proximo);
                    } else {
                        System.out.println("Nenhum paciente na fila.");
                    }
                  break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
        } 
        
        } while (opcao != 0);
    }
   
}
