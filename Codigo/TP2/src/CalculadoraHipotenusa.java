import java.util.Scanner;

public class CalculadoraHipotenusa {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos el primer cateto
        System.out.print("Ingrese la longitud del cateto 1: ");
        double cateto1 = teclado.nextDouble();

        // Pedimos el segundo cateto
        System.out.print("Ingrese la longitud del cateto 2: ");
        double cateto2 = teclado.nextDouble();

        // Calculamos la hipotenusa
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        // Mostramos el resultado
        System.out.println("La hipotenusa del triangulo es: " + hipotenusa);

        teclado.close();
    }
}