/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.java;

/**
 *
 * @author Bruno
 */
public class PagamentoDinheiro implements Pagamento {
    
       private double valor;

    public PagamentoDinheiro(double valor){
        this.valor = valor;
    }
    
    @Override
    public double calcularTotal() {
        return valor * 0.9;
    }

    @Override
    public void imprimirRecibo() {
        System.out.println("\n=== RECIBO - PAGAMENTO EM DINHEIRO ===");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Desconto (10%%): R$ %.2f%n", valor * 0.1);
        System.out.printf("VALOR FINAL: R$ %.2f%n", calcularTotal());
        System.out.println("=====================================");
    }
    
    
    
    
}
