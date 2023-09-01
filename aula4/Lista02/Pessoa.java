package aula4.Lista02;

import java.util.ArrayList;

class Pessoa {
    private int codigo;
    private String nome;
    private ArrayList<Automovel> automoveis;

    public Pessoa() {
        automoveis = new ArrayList<>();
    }

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

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        automoveis = new ArrayList<>();
    }

    public void inserirAutomovel(Automovel automovel) {
        automoveis.add(automovel);
    }

    public void removerAutomovel(int index) {
        if (index >= 0 && index < automoveis.size()) {
            automoveis.remove(index);
        }
    }

    public String imprimir() {
        return "Pessoa: " + nome + " (Código: " + codigo + ")";
    }

    public String imprimirCompleto() {
        StringBuilder completo = new StringBuilder(imprimir() + "\nAutomóveis:\n");
        for (Automovel automovel : automoveis) {
            completo.append(automovel.imprimir()).append("\n");
        }
        return completo.toString();
    }
}