public class ProgramaPessoa {
    public static void main(String[] args) {

        MetodoPessoa metodoPessoa = new MetodoPessoa();

        metodoPessoa.setNome("Bernardo");

        metodoPessoa.setIdade(19);
        metodoPessoa.envelhecer();

        if (metodoPessoa.getIdade() < 21) {
            metodoPessoa.crescer();
        }

        metodoPessoa.engordar(5);
        metodoPessoa.emagrecer(3);

        System.out.println("Nome: " + metodoPessoa.getNome());
        System.out.println("Idade: " + metodoPessoa.getIdade());
        System.out.println("Peso: " + metodoPessoa.getPesso());
        System.out.println("Altura: " + metodoPessoa.getAltura());
    }
}
