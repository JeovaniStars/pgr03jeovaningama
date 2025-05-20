package br.com.ifba.atividade11.java;

public class FormaMain {
    public static void main(String[] args) {
        // Testar Forma2d: Circulo, Quadrado, Triangulo
        Circulo circulo = new Circulo(5);
        System.out.println();
        System.out.println(circulo);
        System.out.println("Area do circulo: " + circulo.obterArea());
        
        Quadrado quadrado = new Quadrado(4);
        System.out.println();
        System.out.println(quadrado);
        System.out.println("Area do quadrado: " + quadrado.obterArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
        
        Triangulo triangulo = new Triangulo(6, 3);
        System.out.println();
        System.out.println(triangulo);
        System.out.println("Area do triangulo: " + triangulo.obterArea());
        
        System.out.println();
        System.out.println("-----");
        
        // Testar Forma3d: Cubo, Esfera, Piramide
        Cubo cubo = new Cubo(3);
        System.out.println();
        System.out.println(cubo);
        System.out.println("Area do cubo: " + cubo.obterArea());
        System.out.println("Volume do cubo: " + cubo.obterVolume());
        
        Esfera esfera = new Esfera(2.5);
        System.out.println();
        System.out.println(esfera);
        System.out.println("Area da esfera: " + esfera.obterArea());
        System.out.println("Volume da esfera: " + esfera.obterVolume());
        
        Piramide piramide = new Piramide(4, 6);
        System.out.println();
        System.out.println(piramide);
        System.out.println("Area da piramide: " + piramide.obterArea());
        System.out.println("Volume da piramide: " + piramide.obterVolume());
    }
}
