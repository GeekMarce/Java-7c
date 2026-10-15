// importamos Scanner para poder utilizarlo
import java.util.Scanner;

public class ValidarNombre {

    public static void main(String[] args) {

        // declaramos la variable Scanner
        Scanner scanner = new Scanner(System.in); 
        String nombre;
        // declaramos la variable "valido" en boolean (verdadero o falso)
        boolean valido;

        // creamos un while para la validacion del nombre
        do {
            System.out.print("Ingrese su nombre completo: ");
            nombre = scanner.nextLine();

            // hacemos que "valido" sea verdadero si no esta vacio 
            valido = !nombre.trim().isEmpty();

            // revizamos que cada caracter del nombre y salimos del for si el nombre es valido 
            for (char c : nombre.toCharArray()) {
                if (!Character.isLetter(c) && c != ' ') {
                    valido = false;
                }
            }

            // si el nombre no es valido aparecerá un mensaje de error
            if (!valido) {
                System.out.println("nombre invalido, Intente nuevamente");
            }
        } while (!valido); // mientras que "valido" sea false se repetirá todo desde el do superior

        // mostramos el nombre completo del usuario en la terminal
        System.out.println("hola, tu nombre es " + nombre);

        // cerramos el scanner (por si acaso)
        scanner.close();

    }
}