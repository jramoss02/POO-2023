package aula4.Lista01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Criar Curso");
            System.out.println("2 - Criar Aluno");
            System.out.println("3 - Remover Aluno");
            System.out.println("4 - Mostrar Todos os Cursos");
            System.out.println("5 - Mostrar Alunos do Curso");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                // Criar Curso
                System.out.print("Digite o código do curso: ");
                int codigo = scanner.nextInt();
                System.out.print("Digite o nome do curso: ");
                scanner.nextLine(); // Limpar o buffer
                String nome = scanner.nextLine();
                System.out.print("Digite a carga horária do curso: ");
                int cargaHoraria = scanner.nextInt();
                cursos.add(new Curso(codigo, nome, cargaHoraria));
                System.out.println("Curso criado com sucesso!");
            } else if (escolha == 2) {
                // Criar Aluno
                System.out.print("Digite o RA do aluno: ");
                scanner.nextLine(); // Limpar o buffer
                String ra = scanner.nextLine();
                System.out.print("Digite o nome do aluno: ");
                String nome = scanner.nextLine();

                if (cursos.isEmpty()) {
                    System.out.println("Não existem cursos disponíveis.");
                } else {
                    System.out.println("Cursos disponíveis:");
                    for (Curso curso : cursos) {
                        System.out.println(curso.imprimir());
                    }
                    System.out.print("Escolha o código do curso para associar o aluno: ");
                    int codigoCurso = scanner.nextInt();
                    Curso cursoSelecionado = null;
                    for (Curso curso : cursos) {
                        if (curso.getCodigo() == codigoCurso) {
                            cursoSelecionado = curso;
                            break;
                        }
                    }
                    if (cursoSelecionado != null) {
                        cursoSelecionado.inserirAluno(new Aluno(ra, nome));
                        System.out.println("Aluno associado ao curso com sucesso!");
                    } else {
                        System.out.println("Curso não encontrado.");
                    }
                }
            } else if (escolha == 3) {
                // Remover Aluno
                System.out.println("Cursos disponíveis:");
                for (Curso curso : cursos) {
                    System.out.println(curso.imprimir());
                }
                System.out.print("Escolha o código do curso para remover um aluno: ");
                int codigoCurso = scanner.nextInt();
                Curso cursoSelecionado = null;
                for (Curso curso : cursos) {
                    if (curso.getCodigo() == codigoCurso) {
                        cursoSelecionado = curso;
                        break;
                    }
                }
                if (cursoSelecionado != null) {
                    System.out.println("Alunos no curso " + cursoSelecionado.getNome() + ":");
                    ArrayList<Aluno> alunosCurso = cursoSelecionado.getAlunos();
                    for (int i = 0; i < alunosCurso.size(); i++) {
                        System.out.println(i + " - " + alunosCurso.get(i).getNome());
                    }
                    System.out.print("Escolha o número do aluno a ser removido: ");
                    int indexAluno = scanner.nextInt();
                    cursoSelecionado.removerAluno(indexAluno);
                    System.out.println("Aluno removido do curso com sucesso!");
                } else {
                    System.out.println("Curso não encontrado.");
                }
            } else if (escolha == 4) {
                // Mostrar Todos os Cursos
                if (cursos.isEmpty()) {
                    System.out.println("Não existem cursos disponíveis.");
                } else {
                    for (Curso curso : cursos) {
                        System.out.println(curso.imprimirCompleto());
                    }
                }
            } else if (escolha == 5) {
                // Mostrar Alunos do Curso
                System.out.println("Cursos disponíveis:");
                for (Curso curso : cursos) {
                    System.out.println(curso.imprimir());
                }
                System.out.print("Escolha o código do curso para mostrar os alunos: ");
                int codigoCurso = scanner.nextInt();
                Curso cursoSelecionado = null;
                for (Curso curso : cursos) {
                    if (curso.getCodigo() == codigoCurso) {
                        cursoSelecionado = curso;
                        break;
                    }
                }
                if (cursoSelecionado != null) {
                    System.out.println(cursoSelecionado.imprimirCompleto());
                } else {
                    System.out.println("Curso não encontrado.");
                }
            } else if (escolha == 6) {
                // Sair
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida. Escolha novamente.");
            }
        }

        scanner.close();
    }
}
