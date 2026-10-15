import java.util.Scanner;

public class CalculadoraRaizCuadrada {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        double numero = teclado.nextDouble();

        double raiz = Math.sqrt(numero);

        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);

        teclado.close();
    }
}