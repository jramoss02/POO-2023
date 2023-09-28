import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        ArrayList<Imovel> imoveis = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Inserir Imóvel");
            System.out.println("2 - Exibir Imóveis");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    inserirImovel(imoveis, scanner);
                    break;
                case 2:
                    exibirImoveis(imoveis);
                    break;
                case 3:
                    scanner.close();
                    System.out.println("Programa encerrado.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void inserirImovel(ArrayList<Imovel> imoveis, Scanner scanner) {
        System.out.print("Informe o código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Informe o endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Informe o valor: ");
        double valor = scanner.nextDouble();

        System.out.println("Tipo de Imóvel:");
        System.out.println("1 - Novo");
        System.out.println("2 - Velho");
        System.out.print("Escolha o tipo de imóvel: ");
        int tipo = scanner.nextInt();

        if (tipo == 1) {
            System.out.print("Informe o valor adicional: ");
            double valorAdicional = scanner.nextDouble();
            ImovelNovo novo = new ImovelNovo(codigo, endereco, valor, valorAdicional);
            imoveis.add(novo);
            System.out.println("Imóvel Novo inserido com sucesso.");
        } else if (tipo == 2) {
            System.out.print("Informe o valor de desconto: ");
            double valorDesconto = scanner.nextDouble();
            ImovelVelho velho = new ImovelVelho(codigo, endereco, valor, valorDesconto);
            imoveis.add(velho);
            System.out.println("Imóvel Velho inserido com sucesso.");
        } else {
            System.out.println("Opção inválida. Imóvel não inserido.");
        }
    }

    private static void exibirImoveis(ArrayList<Imovel> imoveis) {
        if (imoveis.isEmpty()) {
            System.out.println("Nenhum imóvel cadastrado.");
        } else {
            System.out.println("Lista de Imóveis:");
            for (Imovel imovel : imoveis) {
                if (imovel instanceof ImovelNovo) {
                    ImovelNovo novo = (ImovelNovo) imovel;
                    System.out.println(novo.imprimir());
                    System.out.println("Valor Total do Imóvel: " + novo.calcularValorImovel());
                } else if (imovel instanceof ImovelVelho) {
                    ImovelVelho velho = (ImovelVelho) imovel;
                    System.out.println(velho.imprimir());
                    System.out.println("Valor Total do Imóvel: " + velho.calcularValorImovel());
                }
                System.out.println("------------------------------------");
            }
        }
    }
    
    
}
