package aula2.Lista02;

import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Apolice apolice = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Criar Apólice");
            System.out.println("2 - Ver Dados Apólice");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número da apólice: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha pendente
                    System.out.print("Digite o nome do segurado: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade do segurado: ");
                    int idade = scanner.nextInt();
                    System.out.print("Digite o sexo do segurado (M/F): ");
                    char sexo = scanner.next().charAt(0);
                    System.out.print("Digite o valor do automóvel: ");
                    double valorAutomovel = scanner.nextDouble();
                    apolice = new Apolice(numero, nome, idade, sexo, valorAutomovel);
                    System.out.println("Apólice criada com sucesso!");
                    break;
                case 2:
                    if (apolice != null) {
                        System.out.println(apolice.imprimir());
                    } else {
                        System.out.println("Nenhuma apólice foi criada ainda.");
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
