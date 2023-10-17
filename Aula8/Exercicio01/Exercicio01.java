package Aula8.Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

abstract class FormaGeometrica {
    public abstract double calcularArea();
}

class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retângulo - Largura: " + largura + ", Altura: " + altura;
    }
}

class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Círculo - Raio: " + raio;
    }
}

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 – Inserir e calcular área");
            System.out.println("2 – Mostrar todas as formas inseridas");
            System.out.println("3 – Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Escolha o tipo de forma (1 - Retângulo, 2 - Círculo): ");
                    int tipoForma = scanner.nextInt();

                    if (tipoForma == 1) {
                        System.out.print("Digite a largura do retângulo: ");
                        double largura = scanner.nextDouble();
                        System.out.print("Digite a altura do retângulo: ");
                        double altura = scanner.nextDouble();
                        Retangulo retangulo = new Retangulo(largura, altura);
                        formas.add(retangulo);
                        System.out.println("Área do retângulo: " + retangulo.calcularArea());
                    } else if (tipoForma == 2) {
                        System.out.print("Digite o raio do círculo: ");
                        double raio = scanner.nextDouble();
                        Circulo circulo = new Circulo(raio);
                        formas.add(circulo);
                        System.out.println("Área do círculo: " + circulo.calcularArea());
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Formas Geométricas inseridas:");
                    for (FormaGeometrica forma : formas) {
                        System.out.println(forma.toString() + " - Área: " + forma.calcularArea());
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
