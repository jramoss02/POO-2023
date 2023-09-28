public class Funcionario {
    private int numeroCracha;
    private String nome;
    private String setor;
    private String funcao;

    // Construtor padrão
    public Funcionario() {
        // Inicialize os atributos com valores padrão ou vazios, conforme necessário
        this.numeroCracha = 0;
        this.nome = "";
        this.setor = "";
        this.funcao = "";
    }

    // Construtor personalizado
    public Funcionario(int numeroCracha, String nome, String setor, String funcao) {
        this.numeroCracha = numeroCracha;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }

    // Métodos para acessar os atributos (getters)
    public int getNumeroCracha() {
        return numeroCracha;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public String getFuncao() {
        return funcao;
    }

    // Métodos para modificar os atributos (setters)
    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public char[] imprimir() {
        return null;
    }

    // Outros métodos podem ser adicionados conforme necessário
}
