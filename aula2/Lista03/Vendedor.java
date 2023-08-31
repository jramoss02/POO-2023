package aula2.Lista03;

import java.util.Scanner;
class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;

    public Vendedor() {
    }

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    // Métodos getters e setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return calcularPagamentoComissao(valorVenda) - desconto;
    }

    public  double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * percentualComissao / 100;
    }

    public String imprimir(double valorVenda, double desconto) {
        double valorComissao = calcularPagamentoComissao(valorVenda);
        double valorAReceber = calcularPagamentoComissao(valorVenda, desconto);

        return "Codigo: " + codigo +
               "\nNome: " + nome +
               "\nValor Venda: " + valorVenda +
               "\n% Comissão: " + percentualComissao +
               "\nDesconto: " + desconto +
               "\nValor a Pagar: " + valorAReceber +
               " (Comissão: " + valorComissao + ")";
    }
}

