public class FuncionarioMensalista extends Funcionario {
    private double salario;

    // Construtor padrão
    public FuncionarioMensalista() {
        super(); // Chama o construtor padrão da classe pai (Funcionario)
        this.salario = 0.0; // Inicialize o atributo salario com um valor padrão
    }

    // Construtor personalizado
    public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao, double salario) {
        super(numeroCracha, nome, setor, funcao); // Chama o construtor personalizado da classe pai (Funcionario)
        this.salario = salario;
    }

    // Método para acessar o atributo salario
    public double getSalario() {
        return salario;
    }

    // Método para modificar o atributo salario
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para imprimir informações sobre o funcionário mensalista
    public String imprimirDados() {
        return "Número do Crachá: " + getNumeroCracha() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Setor: " + getSetor() + "\n" +
               "Função: " + getFuncao() + "\n" +
               "Salário Mensal: " + salario;
    }
}
