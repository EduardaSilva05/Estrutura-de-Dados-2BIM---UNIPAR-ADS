/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eduarda.pilhasfilas;

/**
 *
 * @author Eduarda
 */
public class Cliente {
    int senha;
    String nome;
    int anoNascimento;

    public Cliente() {
    }
    
    public Cliente(int senha, String nome, int anoNascimento) {
        this.senha = senha;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

     public int getIdade(int anoAtual){
        return anoAtual - this.anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "senha = " + senha + ", nome = " + nome + ", anoNascimento = " + anoNascimento + '}';
    }
    
    
}
