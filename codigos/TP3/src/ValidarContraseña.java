import java.util.Scanner;
public class ValidarContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contrasena = "";
        boolean contrasenaValida = false;
        while (!contrasenaValida) {
            System.out.print("Ingrese su contrasena: ");
            contrasena = sc.nextLine();
            if (contrasena.length() < 8) {
                System.out.println("Error: debe tener al menos 8 caracteres.");
            } else if (!contrasena.matches(".*[A-Z].*")) {
                System.out.println("Error: debe tener al menos una mayuscula.");
            } else if (!contrasena.matches(".*[a-z].*")) {
                System.out.println("Error: debe tener al menos una minuscula.");
            } else if (!contrasena.matches(".*[0-9].*")) {
                System.out.println("Error: debe tener al menos un numero.");
            } else {
                contrasenaValida = true;
                System.out.println("Contrasena valida.");
            }
        }
        
        String telefono = "";
        boolean telefonoValido = false;
        while (!telefonoValido) {
            System.out.print("Ingrese su telefono (10 digitos): ");
            telefono = sc.nextLine();
            if (!telefono.matches("[0-9]+")) {
                System.out.println("Error: solo se permiten numeros.");
            } else if (telefono.length() != 10) {
                System.out.println("Error: debe tener exactamente 10 digitos.");
            } else {
                telefonoValido = true;
                System.out.println("Telefono valido: " + telefono);
            }
        }
        sc.close();
    }
}