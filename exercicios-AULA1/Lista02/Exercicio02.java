package Fundamentos.Lista02;

import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Aluno p = new Aluno();
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);

        while (opcao != 3) {            
            System.out.println("Menu:");
            System.out.println("1 – Criar Aluno");
            System.out.println("2 – Mostrar Aluno");
            System.out.println("3 - Sair");
            opcao = Integer.parseInt(teclado.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Digite o RA");
                    p.setRA(teclado.nextLine());

                    System.out.println("Digite o Nome");
                    p.setNome(teclado.nextLine());

                    System.out.println("Digite a nota da AC1");
                    p.setAC1(Float.parseFloat(teclado.nextLine()));
                    
                    System.out.println("Digite a nota da AC2");
                    p.setAC2(Float.parseFloat(teclado.nextLine()));
                    
                    System.out.println("Digite a nota da AG");
                    p.setAG(Float.parseFloat(teclado.nextLine()));
                    
                    System.out.println("Digite a nota da AF");
                    p.setAF(Float.parseFloat(teclado.nextLine()));
                    break;
                case 2:
                    System.out.println(p.imprimir());
                    break;
                case 3:
                    System.out.println("O programa será fechado");
                    break;
                default:
                    System.out.println("opcão inválida!");
            }
        }
        teclado.close();
    }
}
