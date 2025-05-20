/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.java;

/**
 *
 * @author Bruno
 */
public class Triangulo extends Forma2d {
   
    private double lado;
    private double altura;
    
    public Triangulo(double lado, double altura) {
        super("Triangulo");
        this.lado = lado;
        this.altura = altura;
    }
    
    @Override
    public double obterArea(){
        return (lado * altura) / 2;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", lado = " + lado +
                ", altura = " + altura +
                ", área = " + obterArea();
    }
    
}
