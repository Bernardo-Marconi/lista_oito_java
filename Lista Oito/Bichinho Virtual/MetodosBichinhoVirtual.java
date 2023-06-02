public class MetodosBichinhoVirtual {

    private String nome;

    private int fome, idade, saude;

    public void setFome(int fome) {
        this.fome = fome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public int getIdade() {
        return idade;
    }

    public int getSaude() {
        return saude;
    }

    public String calcularHumor() {
        if (fome < 2 && saude > 9) {
            return "Feliz";
        } else if (fome > 2 && fome < 6 && saude < 9 && saude >6 ) {
            return "Neutro";
        } else {
            return "Triste";
        }
    }
}
