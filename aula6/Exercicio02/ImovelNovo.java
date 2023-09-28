public class ImovelNovo extends Imovel {
    // Atributo adicional
    private double valorAdicional;

    // Construtores
    public ImovelNovo() {
        // Construtor vazio
    }

    public ImovelNovo(int codigo, String endereco, double valor, double valorAdicional) {
        super(codigo, endereco, valor); // Chama o construtor da classe pai (Imovel)
        this.valorAdicional = valorAdicional;
    }

    // Métodos de acesso (getters)
    public double getValorAdicional() {
        return valorAdicional;
    }

    // Métodos de modificação (setters)
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    // Método para calcular o valor total do imóvel
    public double calcularValorImovel() {
        return getValor() + valorAdicional;
    }

    // Método para imprimir informações do imóvel novo
    public String imprimir() {
        return "Código: " + getCodigo() + ", Endereço: " + getEndereco() + ", Valor: " + getValor() + ", Valor Adicional: " + valorAdicional;
    }
}
