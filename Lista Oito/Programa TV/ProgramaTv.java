import java.util.Scanner;

public class ProgramaTv {
    public static void main(String[] args) {

        MetodosTv metodoTv = new MetodosTv();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o canal: ");
        metodoTv.setCanal(scanner.nextInt());

        System.out.println("Informe o volume: ");
        metodoTv.setVolume(scanner.nextInt());

        if(metodoTv.getVolume() > 0 && metodoTv.getVolume() < 100) {
            System.out.println("Canal: " + metodoTv.getCanal());
            System.out.println("Volume " + metodoTv.getVolume());

        } else System.out.println("O volume deve ser entre 0 e 100! ");

        scanner.close();
    }
}
