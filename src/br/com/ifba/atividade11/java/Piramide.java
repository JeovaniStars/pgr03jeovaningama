/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.java;

/**
 *
 * @author Bruno
 */
public class Piramide extends Forma3d{
    private double lado;
    private double altura;
    
    public Piramide(double lado, double altura) {
        super("Piramide");
        this.lado = lado;
        this.altura = altura;
    }
    
    
    private double calcularAreaBase(){
        return lado * lado;
    }
    
    private double calcularAreaLateral(){
        return 4 * ((lado * altura) / 2);
    }
    
    @Override
    public double obterArea(){
        return calcularAreaLateral() + calcularAreaBase();
    }
    
    @Override
    public double obterVolume(){
        return (calcularAreaBase() * altura) / 3;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", lado = " + lado +
               ", altura = " + altura +
               ", área da base = " + calcularAreaBase() +
               ", volume = " + obterVolume();
    }

}
