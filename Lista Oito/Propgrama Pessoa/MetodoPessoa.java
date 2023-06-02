public class MetodoPessoa {
    
    private String nome;
    private int idade;
    private Double peso = 80.0, altura = 175.0;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Double getPesso() {
        return peso;
    }
    public Double getAltura() {
        return altura;
    }

    public int envelhecer() {
        int novaIdade = idade + 1;
        return novaIdade;
    }

    public double crescer() {
        double novaAltura = altura + 0.5;
        return novaAltura;
    }

    public double engordar(double pesoNovo) {
        peso += pesoNovo;
        return peso;
    }

    public double emagrecer(double novoPeso) {
        peso -= novoPeso;
        return peso;
    }
}
