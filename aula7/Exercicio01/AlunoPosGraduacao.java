package aula7.Exercicio01;

public class AlunoPosGraduacao extends Aluno {
    private String anoConclusaoGraduacao;
    private double nota1;
    private double nota2;

    public AlunoPosGraduacao() {
        super();
        this.anoConclusaoGraduacao = "";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusaoGraduacao) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
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

    @Override
    public String toString() {
        return super.toString() + " - Ano de Conclusão da Graduação: " + anoConclusaoGraduacao;
    }
}

