package aula4.Lista02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Criar Pessoa");
            System.out.println("2 - Criar Automóvel");
            System.out.println("3 - Transferir Automóvel");
            System.out.println("4 - Mostrar Todas as Pessoas");
            System.out.println("5 - Mostrar Automóveis da Pessoa");
            System.out.println("6 - Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha após a leitura do número

            switch (escolha) {
                case 1:
                    System.out.print("Digite o código da pessoa: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();  // Consumir a quebra de linha
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    pessoas.add(new Pessoa(codigo, nome));
                    break;

                case 2:
                    System.out.print("Digite a marca do automóvel: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo do automóvel: ");
                    String modelo = scanner.nextLine();
                    Automovel automovel = new Automovel(marca, modelo);

                    System.out.println("Escolha a pessoa para associar o automóvel:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    int pessoaIndex = scanner.nextInt();
                    scanner.nextLine();  // Consumir a quebra de linha
                    pessoas.get(pessoaIndex).inserirAutomovel(automovel);
                    break;

                case 3:
                    System.out.println("Escolha a pessoa de origem:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    int origemIndex = scanner.nextInt();
                    scanner.nextLine();  // Consumir a quebra de linha
                
                    Pessoa pessoaOrigem = pessoas.get(origemIndex);
                
                    if (pessoaOrigem.getAutomoveis().isEmpty()) {
                        System.out.println("A pessoa de origem não possui automóveis.");
                        break;
                    }
                
                    System.out.println("Escolha o automóvel a ser transferido:");
                    ArrayList<Automovel> automoveisOrigem = pessoaOrigem.getAutomoveis();
                    for (int i = 0; i < automoveisOrigem.size(); i++) {
                        System.out.println(i + " - " + automoveisOrigem.get(i).getMarca() + " " + automoveisOrigem.get(i).getModelo());
                    }
                    int automovelIndex = scanner.nextInt();
                    scanner.nextLine();  // Consumir a quebra de linha
                
                    Automovel automovelTransferido = automoveisOrigem.get(automovelIndex);
                
                    System.out.println("Escolha a pessoa de destino:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        if (i != origemIndex) {
                            System.out.println(i + " - " + pessoas.get(i).getNome());
                        }
                    }
                    int destinoIndex = scanner.nextInt();
                    scanner.nextLine();  // Consumir a quebra de linha
                
                    Pessoa pessoaDestino = pessoas.get(destinoIndex);
                    pessoaOrigem.removerAutomovel(automovelIndex);
                    pessoaDestino.inserirAutomovel(automovelTransferido);
                
                    System.out.println("Automóvel transferido com sucesso!");
                    break;

                case 4:
                    System.out.println("Lista de Pessoas:");
                    for (Pessoa pessoa : pessoas) {
                        System.out.println(pessoa.imprimir());
                    }
                    break;

                case 5:
                    System.out.println("Escolha a pessoa para mostrar seus automóveis:");
                    for (int i = 0; i < pessoas.size(); i++) {
                        System.out.println(i + " - " + pessoas.get(i).getNome());
                    }
                    int pessoaIndexToShow = scanner.nextInt();
                    scanner.nextLine();  // Consumir a quebra de linha
                    System.out.println(pessoas.get(pessoaIndexToShow).imprimirCompleto());
                    break;

                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Digite um número entre 1 e 6.");
                    break;
            }
        }
    }
}
