/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11.java;

/**
 *
 * @author Bruno
 */
public class Esfera extends Forma3d{
    private double raio;

    public Esfera(double raio) {
        super("Esfera");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}
