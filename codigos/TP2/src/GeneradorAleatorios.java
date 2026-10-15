import java.util.Random;
import java.util.Scanner;

public class GeneradorAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner teclado = new Scanner(System.in);

        // Generamos un numero entero aleatorio entre 1 y 100
        int numeroEntero = random.nextInt(100) + 1;
        System.out.println("Numero entero aleatorio entre 1 y 100: " + numeroEntero);

        // Generamos un numero decimal aleatorio entre 0 y 1
        double numeroDecimal = random.nextDouble();
        System.out.println("Numero decimal aleatorio entre 0 y 1: " + numeroDecimal);

        System.out.print("Ingrese el valor minimo del rango: ");
        int minimo = teclado.nextInt();

        System.out.print("Ingrese el valor maximo del rango: ");
        int maximo = teclado.nextInt();

        int numeroEnRango = minimo + random.nextInt(maximo - minimo + 1);
        System.out.println("Numero aleatorio entre " + minimo + " y " + maximo + ": " + numeroEnRango);

        teclado.close();
    }
}