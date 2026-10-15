
 // importamos Scanner para poder utilizarlo
import java.util.Scanner;

public class ValidarFecha {
    public static void main(String[] args) {
        // declaramos la variable Scanner
        Scanner scanner = new Scanner(System.in);

        String fecha;

        // declaramos la variable "valida" en boolean
        boolean valida;

        do {
            // hacemos que la variable valida sea verdadera hasta que detecte errores
            valida = true;

            // pedimos al usuario ingresar la fecha en el siguiente formato -> (DD/MM/AAAA)
            System.out.print("Ingresa una fecha (DD/MM/AAAA): ");
            fecha = scanner.nextLine();

            // si lo ingresado por el usuario no son 10 caracteres O el tercer O el sexto caracter no son "/" "valida" sera falsa
            if (fecha.length() != 10 ||
                fecha.charAt(2) != '/' ||
                fecha.charAt(5) != '/') {

                valida = false;

            } else {

                // revisa cada caracter, si no es una barra ni un numero, la fecha no es valida
                for (int i = 0; i < fecha.length(); i++) {
                    if (i != 2 && i != 5 && !Character.isDigit(fecha.charAt(i))) {
                        valida = false;
                    }
                }
            }

            // si no es valida mostrar este mensaje
            if (!valida) {
                System.out.println("fecha invalida. intenta nuevamente.");
            }

        } while (!valida);

        // mostrar mensaje si es valida
        System.out.println("fecha valida.");
        scanner.close(); // cerrar el scanner (por si acaso)
    }
}

// nota: no encontré manera y no supe como ingeniarmelas para hacer que 31/12/2000 sea valida y 12/31/2000 no lo fuera, asi que lo dejé asi