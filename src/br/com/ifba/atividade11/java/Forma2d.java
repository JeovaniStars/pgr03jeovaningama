/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.java;

/**
 *
 * @author Bruno
 */
public class Forma2d extends Forma{
    public Forma2d(String nome) {
        super(nome);
    }
    
    @Override
    public double obterArea(){
        return 0;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (2D)";
    }
}
