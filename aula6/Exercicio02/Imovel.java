public class Imovel {
    // Atributos
    private int codigo;
    private String endereco;
    private double valor;

    // Construtores
    public Imovel() {
        // Construtor vazio
    }

    public Imovel(int codigo, String endereco, double valor) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.valor = valor;
    }

    // Métodos de acesso (getters)
    public int getCodigo() {
        return codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    // Métodos de modificação (setters)
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
