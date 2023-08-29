package aula1.Lista02;

public class Aluno {
    private String RA;
    private String nome;
    private float AC1;
    private float AC2;
    private float AG;
    private float AF;

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAC1() {
        return AC1;
    }

    public void setAC1(float AC1) {
        this.AC1 = AC1;
    }

    public float getAC2() {
        return AC2;
    }

    public void setAC2(float AC2) {
        this.AC2 = AC2;
    }

    public float getAG() {
        return AG;
    }

    public void setAG(float AG) {
        this.AG = AG;
    }

    public float getAF() {
        return AF;
    }

    public void setAF(float AF) {
        this.AF = AF;
    }

    public float calcularMedia() {
        return (AC1 * 0.15f) + (AC2 * 0.30f) + (AG * 0.10f) + (AF * 0.45f);
    }

    public String verificaAprovacao() {
        float media = calcularMedia();
        if (media >= 5) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String imprimir() {
        float media = calcularMedia();
        String situacao = verificaAprovacao();
        
        return "RA: " + RA +
                "\nNome: " + nome +
                "\nAC1: " + AC1 +
                "\nAC2: " + AC2 +
                "\nAG: " + AG +
                "\nAF: " + AF +
                "\nSituação: " + situacao +
                "\nMédia: " + media;
    }
}
