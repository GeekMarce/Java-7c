// Importamos Scanner para poder utilizarlo
import java.util.Scanner;

public class Buscar_Nombre{
    public static void main(String[]Args){

        // declaramos la variable Scanner
        Scanner scanner = new Scanner(System.in); 

        // declaramos la variable de nombre como string con 5 posiciones
        String[][] Nombres = {
            {"Alejandro", "Marcelo", "Fede"},
            {"Cufre", "Brocca"}
        };

        // le decimos al usuario que ingrese la posicion
        System.out.println("seleccione la fila (0,1)");

        // declaramos las variables "Seleccion1" para seleccionar la fila del array
        int Seleccion1 = scanner.nextInt();

        // declaramos las variables "Seleccion2" para seleccionar la columna del array
        System.out.println("seleccione la columna (0,1,2)");
        int Seleccion2 = scanner.nextInt();

        // cerramos el scanner
        scanner.close();

        // mostramos la posicion del nombre y usamos la variable seleccion para seleccionar la posicion
        System.out.println(Nombres[Seleccion1][Seleccion2]);
    }
}