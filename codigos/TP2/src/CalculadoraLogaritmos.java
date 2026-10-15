import java.util.Scanner;

public class CalculadoraLogaritmos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        double numero = teclado.nextDouble();

        double logNatural = Math.log(numero);

        double logBase10 = Math.log10(numero);

        System.out.println("El logaritmo natural de " + numero + " es: " + logNatural);
        System.out.println("El logaritmo en base 10 de " + numero + " es: " + logBase10);

        teclado.close();
    }
}