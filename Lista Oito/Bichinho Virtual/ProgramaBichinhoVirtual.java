public class ProgramaBichinhoVirtual {
    public static void main(String[] args) {

        MetodosBichinhoVirtual metodosBichinhoVirtual= new MetodosBichinhoVirtual() ;

        metodosBichinhoVirtual.setNome("Puf");
        metodosBichinhoVirtual.setIdade(2);
        metodosBichinhoVirtual.setFome(1);
        metodosBichinhoVirtual.setSaude(10);
        

        System.out.println("Nome: "+ metodosBichinhoVirtual.getNome());
        System.out.println("Idade: "+ metodosBichinhoVirtual.getIdade());
        System.out.println("Fome: "+ metodosBichinhoVirtual.getFome());
        System.out.println("Saúde: "+ metodosBichinhoVirtual.getSaude());
        System.out.println("Humor: "+metodosBichinhoVirtual.calcularHumor());
    }
}
