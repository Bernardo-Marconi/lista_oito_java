import java.util.Scanner;

public class ProgramaQuadrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MetodosQuadrado metodosQuadrado = new MetodosQuadrado();

        System.out.println("Informe o tamanho do lado do quadradro: ");
        metodosQuadrado.setLadoQuadrado(scanner.nextFloat());

        System.out.println("Área do quadrado: " + metodosQuadrado.calcularAreaQuadrado());    

        scanner.close();
    }
}
