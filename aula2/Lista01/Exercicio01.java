package aula2.Lista01;

import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 5) {
                System.out.println("Encerrando o programa.");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + calculadora.soma(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + calculadora.subtracao(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + calculadora.multiplicacao(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado: " + calculadora.divisao(num1, num2));
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }

        scanner.close();
    }
}
