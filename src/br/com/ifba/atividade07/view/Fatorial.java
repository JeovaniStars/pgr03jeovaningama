/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author Bruno
 */
public class Fatorial {
    private int valor; 
    private int fatorial; 
    private String formula; 

    // Método para definir o valor de n
    public void setValor(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
        this.valor = n;
        calcularFatorial(); 
    }

    // Método para calcular o fatorial e sua fórmula
    private void calcularFatorial() {
        fatorial = 1;
        StringBuilder formulaBuilder = new StringBuilder();
        
        for (int i = valor; i > 0; i--) {
            fatorial *= i;
            formulaBuilder.append(i);
            if (i > 1) {
                formulaBuilder.append(" × ");
            }
        }
        
        formula = valor == 0 ? "1" : formulaBuilder.toString();
    }

    // Método para obter o fatorial calculado
    public int getFatorial() {
        return fatorial;
    }

    // Método para obter a fórmula usada no cálculo
    public String getFormula() {
        return formula;
    }

    // Teste básico no método main
    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        f.setValor(5);
        System.out.println("Fatorial: " + f.getFatorial()); // Saída: 120
        System.out.println("Fórmula: " + f.getFormula());   // Saída: 5 × 4 × 3 × 2 × 1
    }
}
