package aula4.Lista01;

import java.util.ArrayList;

class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Curso() {
        alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        alunos = new ArrayList<>();
    }

    public void inserirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(int index) {
        if (index >= 0 && index < alunos.size()) {
            alunos.remove(index);
        }
    }

    public String imprimir() {
        return "Curso: " + nome + " (Código: " + codigo + ", Carga Horária: " + cargaHoraria + " horas)";
    }

    public String imprimirCompleto() {
        StringBuilder completo = new StringBuilder(imprimir() + "\nAlunos:\n");
        for (Aluno aluno : alunos) {
            completo.append(aluno.imprimir()).append("\n");
        }
        return completo.toString();
    }
    
    // Getters and setters here
    
    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}

