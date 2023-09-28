import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        ArrayList<FuncionarioHorista> funcionariosHoristas = new ArrayList<>();
        ArrayList<FuncionarioMensalista> funcionariosMensalistas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Inserir Funcionário Horista");
            System.out.println("2 - Inserir Funcionário Mensalista");
            System.out.println("3 - Exibir Funcionários Horistas");
            System.out.println("4 - Exibir Funcionários Mensalistas");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

            switch (opcao) {
                case 1:
                    // Inserir Funcionário Horista
                    FuncionarioHorista novoFuncionarioHorista = criarFuncionarioHorista(scanner);
                    funcionariosHoristas.add(novoFuncionarioHorista);
                    System.out.println("Funcionário Horista inserido com sucesso!");
                    break;
                case 2:
                    // Inserir Funcionário Mensalista
                    FuncionarioMensalista novoFuncionarioMensalista = criarFuncionarioMensalista(scanner);
                    funcionariosMensalistas.add(novoFuncionarioMensalista);
                    System.out.println("Funcionário Mensalista inserido com sucesso!");
                    break;
                case 3:
                    // Exibir Funcionários Horistas
                    exibirFuncionarios(funcionariosHoristas);
                    break;
                case 4:
                    // Exibir Funcionários Mensalistas
                    exibirFuncionarios(funcionariosMensalistas);
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static FuncionarioHorista criarFuncionarioHorista(Scanner scanner) {
        System.out.print("Número do Crachá: ");
        int numeroCracha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Setor: ");
        String setor = scanner.nextLine();

        System.out.print("Função: ");
        String funcao = scanner.nextLine();

        System.out.print("Quantidade de Horas: ");
        int qtdeHoras = scanner.nextInt();

        System.out.print("Valor da Hora: ");
        double valorHora = scanner.nextDouble();

        return new FuncionarioHorista(numeroCracha, nome, setor, funcao, qtdeHoras, valorHora);
    }

    private static FuncionarioMensalista criarFuncionarioMensalista(Scanner scanner) {
        System.out.print("Número do Crachá: ");
        int numeroCracha = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Setor: ");
        String setor = scanner.nextLine();

        System.out.print("Função: ");
        String funcao = scanner.nextLine();

        System.out.print("Salário Mensal: ");
        double salario = scanner.nextDouble();

        return new FuncionarioMensalista(numeroCracha, nome, setor, funcao, salario);
    }

    private static void exibirFuncionarios(ArrayList<? extends Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("Lista de Funcionários:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.imprimir());
                System.out.println("-----------------------------");
            }
        }
    }
}
