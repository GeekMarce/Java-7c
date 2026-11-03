public class Main {
    public static void main(String[]args){

        //creamos objetos vehiculos
        Vehiculo Ale = new Vehiculo("Toyota", "Hilux", 2026, "ALEMAI", 0);
        Vehiculo Camion = new Vehiculo("Mercedes-Benz", "Actros", 2023, "CAM123", 150000);
        Vehiculo Furgon = new Vehiculo("Fiat", "Ducato", 2024, "FUR456", 35000);

        //creamos objetos conductores
        Conductor Estudiante = new Conductor ("Marce", 18, "B1");
        Conductor Amiga = new Conductor ("Erica", 19, "B2");
        Conductor Compañera = new Conductor ("Maria", 19, "B1");


        //asignacion de vehiculos a cada conductor
        Estudiante.asignarVehiculo(Ale);
        Amiga.asignarVehiculo(Camion);
        Compañera.asignarVehiculo(Furgon);

        Estudiante.mostrarInfo(); // mostrar info de estudiante y su vehiculo

        System.out.println(); //espacio blanco

        Amiga.mostrarInfo(); // mostrar info de amiga y su vehiculo

        System.out.println(); //espacio blanco

        Compañera.mostrarInfo(); // mostrar info de compañera y su vehiculo
    }
}
