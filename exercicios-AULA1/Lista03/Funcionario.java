package Fundamentos.Lista03;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float QtdeHora;
    private float salario;
    private float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return QtdeHora;
    }

    public void setQtdeHora(float QtdeHora) {
        this.QtdeHora = QtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float calcularValorSalario() {
        if (tipoVinculo == 'H') {
            return valorHora * QtdeHora - valorDesconto;
        } else {
            return salario - valorDesconto;
        }
    }

    public String imprimir() {
        float valorReceber = calcularValorSalario();
        String tipoVinculoStr = (tipoVinculo == 'H') ? "Horista" : "Mensalista";

        String output = "Crachá: " + cracha +
                        "\nNome: " + nome +
                        "\nTipo Vínculo: " + tipoVinculoStr +
                        "\nSalário: " + ((tipoVinculo == 'H') ? (valorHora * QtdeHora) : salario) +
                        "\nDesconto: " + valorDesconto +
                        "\nValor a receber: " + valorReceber;

        return output;
    }
}
