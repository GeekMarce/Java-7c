import java.util.Scanner;

public class CalculadoraCirculo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // Pedimos el radio del circulo
        System.out.print("Ingrese el radio del circulo: ");
        double radio = teclado.nextDouble();

        // Calculamos el area del circulo
        double area = Math.PI * Math.pow(radio, 2);

        // Calculamos el perímetro
        double perimetro = 2 * Math.PI * radio;

        // Mostramos los resultados
        System.out.println("El area del circulo es: " + area);
        System.out.println("El perímetro del circulo es: " + perimetro);

        teclado.close();
    }
}