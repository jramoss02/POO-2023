public class FuncionarioHorista extends Funcionario {
    private int qtdeHoras;
    private double valorHora;

    // Construtor padrão
    public FuncionarioHorista() {
        super(); // Chama o construtor padrão da classe pai (Funcionario)
        this.qtdeHoras = 0;
        this.valorHora = 0.0;
    }

    // Construtor personalizado
    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao, int qtdeHoras, double valorHora) {
        super(numeroCracha, nome, setor, funcao); // Chama o construtor personalizado da classe pai (Funcionario)
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    // Métodos para acessar os atributos qtdeHoras e valorHora
    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    // Métodos para modificar os atributos qtdeHoras e valorHora
    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    // Método para calcular o salário do funcionário horista
    public double calcularSalario() {
        return qtdeHoras * valorHora;
    }

    // Método para imprimir informações do funcionário horista
    public String imprimirDados() {
        return "Número do Crachá: " + getNumeroCracha() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Setor: " + getSetor() + "\n" +
               "Função: " + getFuncao() + "\n" +
               "Quantidade de Horas: " + qtdeHoras + "\n" +
               "Valor da Hora: " + valorHora + "\n" +
               "Salário: " + calcularSalario();
    }
}
