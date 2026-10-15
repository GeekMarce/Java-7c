import java.util.Scanner;

public class CalculadoraPotencia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = teclado.nextDouble();

        System.out.print("Ingrese el exponente: ");
        double exponente = teclado.nextDouble();

        double resultado = Math.pow(base, exponente);

        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);

        teclado.close();
    }
}