public class ImovelVelho extends Imovel {
    // Atributo adicional
    private double valorDesconto;

    // Construtores
    public ImovelVelho() {
        // Construtor vazio
    }

    public ImovelVelho(int codigo, String endereco, double valor, double valorDesconto) {
        super(codigo, endereco, valor); // Chama o construtor da classe pai (Imovel)
        this.valorDesconto = valorDesconto;
    }

    // Métodos de acesso (getters)
    public double getValorDesconto() {
        return valorDesconto;
    }

    // Métodos de modificação (setters)
    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    // Método para calcular o valor total do imóvel velho
    public double calcularValorImovel() {
        return getValor() - valorDesconto;
    }

    // Método para imprimir informações do imóvel velho
    public String imprimir() {
        return "Código: " + getCodigo() + ", Endereço: " + getEndereco() + ", Valor: " + getValor() + ", Valor de Desconto: " + valorDesconto;
    }
}
