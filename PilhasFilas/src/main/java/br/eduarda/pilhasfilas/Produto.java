/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eduarda.pilhasfilas;

/**
 *
 * @author 00247694
 */
public class Produto {
    /*Produto
- codProduto
- descricao
- dataEntrada
- ufOrigem
- ufDestino*/
    
    private String cdProduto;
    private String dsProduto;
    private String dtEntrada;
    private String ufOrigem;
    private String ufDestino;

    public Produto(String cdProduto, String dsProduto, String dtEntrada, String ufOrigem, String ufDestino) {
        this.cdProduto = cdProduto;
        this.dsProduto = dsProduto;
        this.dtEntrada = dtEntrada;
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
    }

    @Override
    public String toString() {
        return "Produto{" + "cdProduto = " + cdProduto + ", dsProduto = " + dsProduto + ", dtEntrada = " + dtEntrada + ", ufOrigem = " + ufOrigem + ", ufDestino = " + ufDestino + '}';
    }
    
    
}
