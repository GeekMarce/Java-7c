import java.util.Scanner;

public class ValidacionCampos {

    public static boolean esNombreValido(String nombre) {

        if (nombre.length() == 0) {
            return false;
        }

        int i = 0;
        while (i < nombre.length()) {
            char letra = nombre.charAt(i);

            boolean esLetra   = (letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z');
            boolean esEspacio = (letra == ' ');

            if (!esLetra && !esEspacio) {
                return false;
            }

            i = i + 1;
        }

        return true;
    }

    public static boolean esFechaValida(String fecha) {

        if (fecha.length() != 10) {
            return false;
        }

        if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
            return false;
        }

        String textoDia  = fecha.substring(0, 2);
        String textoMes  = fecha.substring(3, 5);
        String textoAnio = fecha.substring(6, 10);

        int dia  = Integer.parseInt(textoDia);
        int mes  = Integer.parseInt(textoMes);
        int anio = Integer.parseInt(textoAnio);

        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > 31) {
            return false;
        }

        if (mes == 2) {
            boolean bisiesto = (anio % 4 == 0);
            if (bisiesto) {
                if (dia > 29) return false;
            } else {
                if (dia > 28) return false;
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean nombreOk = false;
        boolean fechaOk  = false;

        System.out.println("=== VALIDACION DE NOMBRE ===");

        while (!nombreOk) {
            System.out.print("Ingrese su nombre completo: ");
            String nombre = teclado.nextLine();
            nombreOk = esNombreValido(nombre);
            if (nombreOk) {
                System.out.println("Nombre aceptado: " + nombre);
            } else {
                System.out.println("Error: solo se permiten letras y espacios. Intente de nuevo.");
            }
        }

        System.out.println();
        System.out.println("=== VALIDACION DE FECHA ===");

        while (!fechaOk) {
            System.out.print("Ingrese una fecha (DD/MM/AAAA): ");
            String fecha = teclado.nextLine();
            fechaOk = esFechaValida(fecha);
            if (fechaOk) {
                System.out.println("Fecha aceptada: " + fecha);
            } else {
                System.out.println("Error: formato incorrecto o fecha inexistente. Intente de nuevo.");
            }
        }

        teclado.close();
    }
}