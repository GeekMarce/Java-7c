import java.util.Scanner;

public class CalculadoraInteresCompuesto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el monto principal: ");
        double montoPrincipal = teclado.nextDouble();

        // Pedimos la tasa de interes anual en porcentaje
        System.out.print("Ingrese la tasa de interes anual (en %): ");
        double tasaInteres = teclado.nextDouble();

        // Pedimos el numero de años
        System.out.print("Ingrese el numero de años: ");
        double años = teclado.nextDouble();

        // Convertimos la tasa de porcentaje a decimal
        double tasaDecimal = tasaInteres / 100;

        // Calculamos el monto final
        double montoFinal = montoPrincipal * Math.pow(1 + tasaDecimal, años);

        // Mostramos el resultado
        System.out.println("El monto final despues de " + años + " años es: " + montoFinal);

        teclado.close();
    }
}