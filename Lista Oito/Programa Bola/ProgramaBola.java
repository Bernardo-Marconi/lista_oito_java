import java.util.Scanner;

public class ProgramaBola {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        MetodosBola metodosBola = new MetodosBola();

        System.out.println("Bola");

        System.out.printf("Cor: %s\nMaterial: %s\nCircunferência: %s",metodosBola.getCor(), metodosBola.getMaterial(), metodosBola.getCircunferencia());

        System.out.println("\nInforme a nova cor da bola: ");
        metodosBola.setCor(scanner.nextLine());

        System.out.println("Bola");
        
        System.out.printf("Cor: %s\nMaterial: %s\nCircunferência: %s",metodosBola.getCor(), metodosBola.getMaterial(), metodosBola.getCircunferencia());

        scanner.close();
    }
}