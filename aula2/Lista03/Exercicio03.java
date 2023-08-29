package aula2.Lista03;

import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Funcionario p = new Funcionario();
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);

        while (opcao != 3) {            
            System.out.println("Menu:");
            System.out.println("1 – Criar Funcionario");
            System.out.println("2 – Mostrar Folha de pagamento");
            System.out.println("3 - Alterar Remuneração");
            System.out.println("4 - Sair");
            opcao = Integer.parseInt(teclado.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Digite o Crachá:");
                    p.setCracha(Integer.parseInt(teclado.nextLine()));
                    
                    System.out.println("Digite o Nome:");
                    p.setNome(teclado.nextLine());
                    
                    System.out.println("Digite o Tipo de Vínculo (H ou M):");
                    p.setTipoVinculo(teclado.nextLine().charAt(0));
                    
                    System.out.println("Digite o Valor da Hora:");
                    p.setValorHora(Float.parseFloat(teclado.nextLine()));
                    
                    System.out.println("Digite a Quantidade de Horas:");
                    p.setQtdeHora(Float.parseFloat(teclado.nextLine()));
                    
                    System.out.println("Digite o Salário:");
                    p.setSalario(Float.parseFloat(teclado.nextLine()));
                    
                    System.out.println("Digite o Valor do Desconto:");
                    p.setValorDesconto(Float.parseFloat(teclado.nextLine()));
                    break;
                case 2:
                    System.out.println(p.imprimir());
                    break;
                case 3:
                    System.out.println("Digite o tipo de vínculo (H para Horista, M para Mensalista):");
                    char tipoVinculo = teclado.nextLine().charAt(0);
                    
                    if (tipoVinculo == 'H') {
                        System.out.println("Digite o novo Valor da Hora:");
                        p.setValorHora(Float.parseFloat(teclado.nextLine()));
                        
                        System.out.println("Digite a nova Quantidade de Horas:");
                        p.setQtdeHora(Float.parseFloat(teclado.nextLine()));
                    } else if (tipoVinculo == 'M') {
                        System.out.println("Digite o novo Salário:");
                        p.setSalario(Float.parseFloat(teclado.nextLine()));
                    } else {
                        System.out.println("Tipo de vínculo inválido!");
                    }
                    break;
                case 4:
                    System.out.println("O programa será fechado");
                    break;
                default:
                    System.out.println("opcão inválida!");
            }
        }
        teclado.close();
    }
}
