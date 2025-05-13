/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.java;

/**
 *
 * @author Bruno
 */
public class PagamentoCartao implements Pagamento{
     private double valor;
    
    public PagamentoCartao(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double calcularTotal() {
        return valor * 1.05; // 5% de taxa
    }
    
    @Override
    public void imprimirRecibo() {
        System.out.println("\n=== RECIBO - PAGAMENTO COM CARTÃO ===");
        System.out.printf("Valor original: R$ %.2f%n", valor);
        System.out.printf("Taxa (5%%): R$ %.2f%n", valor * 0.05);
        System.out.printf("VALOR FINAL: R$ %.2f%n", calcularTotal());
        System.out.println("====================================");
    }
}

