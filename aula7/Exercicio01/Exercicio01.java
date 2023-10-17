package aula7.Exercicio01;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Inserir Aluno de Graduação");
            System.out.println("2 - Inserir Aluno de Pós-Graduação");
            System.out.println("3 - Exibir Alunos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("RA: ");
                    String ra = scanner.next();
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("Curso: ");
                    String curso = scanner.next();
                    System.out.print("Ano de Conclusão do Ensino Médio: ");
                    String anoConclusao = scanner.next();
                    System.out.print("AC1: ");
                    double ac1 = scanner.nextDouble();
                    System.out.print("AC2: ");
                    double ac2 = scanner.nextDouble();
                    System.out.print("AF: ");
                    double af = scanner.nextDouble();
                    System.out.print("AG: ");
                    double ag = scanner.nextDouble();

                    AlunoGraduacao alunoGraduacao = new AlunoGraduacao(ra, nome, curso, anoConclusao) {
                        @Override
                        public double calcularMedia() {
                            return (ac1 * 0.1) + (ac2 * 0.3) + (ag * 0.2) + (af * 0.4);
                        }

                        @Override
                        public String verificarAprovacao() {
                            double media = calcularMedia();
                            if (media >= 6.0) {
                                return "Aprovado";
                            } else {
                                return "Reprovado";
                            }
                        }
                    };

                    listaAlunos.add(alunoGraduacao);
                    System.out.println("Aluno de Graduação inserido com sucesso!");
                    break;

                case 2:
                    System.out.print("RA: ");
                    ra = scanner.next();
                    System.out.print("Nome: ");
                    nome = scanner.next();
                    System.out.print("Curso: ");
                    curso = scanner.next();
                    System.out.print("Ano de Conclusão da Graduação: ");
                    anoConclusao = scanner.next();
                    System.out.print("Nota 1: ");
                    double nota1 = scanner.nextDouble();
                    System.out.print("Nota 2: ");
                    double nota2 = scanner.nextDouble();

                    AlunoPosGraduacao alunoPosGraduacao = new AlunoPosGraduacao(ra, nome, curso, anoConclusao);
                    alunoPosGraduacao.setNota1(nota1);
                    alunoPosGraduacao.setNota2(nota2);

                    listaAlunos.add(alunoPosGraduacao);
                    System.out.println("Aluno de Pós-Graduação inserido com sucesso!");
                    break;

                case 3:
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (Aluno aluno : listaAlunos) {
                            System.out.println(aluno.toString());
                            System.out.println("Média: " + aluno.calcularMedia());
                            System.out.println("Situação: " + aluno.verificarAprovacao());
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
