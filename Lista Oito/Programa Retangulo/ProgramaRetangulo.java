import java.util.Scanner;

public class ProgramaRetangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MetodosRetangulo metodosRetangulo = new MetodosRetangulo();

        System.out.println("Informe a medida do Comprimento do local em centimetros: ");
        metodosRetangulo.setBaseRetangulo(scanner.nextDouble());

        System.out.println("Informe a medida da Largura do local em centimetros: ");
        metodosRetangulo.setAlturaRetangulo(scanner.nextDouble());

        System.out.println("Comprimento: " + metodosRetangulo.getBaseRetangulo() + " cm");
        System.out.println("Largura: " + metodosRetangulo.getAlturaRetangulo() + " cm");
        System.out.println("Área: " + metodosRetangulo.calcularAreaRetangulo() + " m²");
        System.out.println("Perimetro: " + metodosRetangulo.calcularPerimetroRetangulo() + " m" );

        metodosRetangulo.setareaRetangulo(metodosRetangulo.calcularAreaRetangulo());

        System.out.println("Quatidade de pisos necessárias para o local: " + metodosRetangulo.calcularQuantidadePiso() + " pisos");

        scanner.close();
    }
}
