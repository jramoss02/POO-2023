package aula7.Exercicio01;

public class Aluno {
    private String ra;
    private String nome;
    private String curso;

    public Aluno() {
        this.ra = "";
        this.nome = "";
        this.curso = "";
    }

    public Aluno(String ra, String nome, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double calcularMedia() {
        return 0.0;
    }

    public String verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return "Aluno [ra=" + ra + ", nome=" + nome + ", curso=" + curso + "]";
    }
}

