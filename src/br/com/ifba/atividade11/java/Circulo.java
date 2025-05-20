/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.java;

/**
 *
 * @author Bruno
 */
public class Circulo extends Forma2d {
    private double raio;
    
    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }
    
    @Override
    public double obterArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", raio = " + raio +
               ", área = " + obterArea();
    }
}
