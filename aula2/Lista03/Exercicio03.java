package aula2.Lista03;

import java.util.Scanner;

public class Exercicio03 {
  public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vendedor vendedor = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Vendedor");
            System.out.println("2 - Calcular Comissão");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do vendedor: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha pendente
                    System.out.print("Digite o nome do vendedor: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o percentual de comissão: ");
                    double percentualComissao = scanner.nextDouble();
                    vendedor = new Vendedor(codigo, nome, percentualComissao);
                    System.out.println("Vendedor cadastrado com sucesso!");
                    break;
                case 2:
                    if (vendedor != null) {
                        System.out.print("Digite o valor da venda: ");
                        double valorVenda = scanner.nextDouble();
                        System.out.print("Digite o valor do desconto: ");
                        double desconto = scanner.nextDouble();
                        System.out.println(vendedor.imprimir(valorVenda, desconto));
                    } else {
                        System.out.println("Nenhum vendedor cadastrado ainda.");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }
}
  
}
