package aula2.Lista02;

class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice() {
    }

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor() {
        if (sexo == 'M' && idade <= 25) {
            return valorAutomovel * 10 / 100;
        } else if (sexo == 'M' && idade > 25) {
            return valorAutomovel * 5 / 100;
        } else if (sexo == 'F') {
            return valorAutomovel * 2 / 100;
        } else {
            return 0;
        }
    }

    public String imprimir() {
        return "Número: " + numero +
               "\nNome: " + nome +
               "\nIdade: " + idade +
               "\nSexo: " + sexo +
               "\nValor Automóvel: " + valorAutomovel +
               "\nValor Apólice: " + calcularValor();
    }

    // Métodos getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
}