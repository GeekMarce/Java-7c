public class Conductor {
        
    //declaramos variables privadas predeterminadas
    private String nombre = "";
    private int edad = 0;
    private String licencia = "";
    private Vehiculo vehiculoAsignado;
    
    public Conductor (String nuevoNombre, int nuevaEdad, String nuevaLicencia){
        nombre = nuevoNombre;
        
        // validacion de edad
        if (nuevaEdad >= 18) {
            edad = nuevaEdad;
        }

        licencia = nuevaLicencia;
    }

    // con getters obtener atributos de clases privadas
    public String getNombre() {
    return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getLicencia(){
        return licencia;
    }

    //con setters poder modificar a futuro las variables
    public void setNombre(String nuevoNombre) {
    nombre = nuevoNombre;
    }

    // validamos la edad de el conductor, que deba tener +18 años para ser conductor valido
    public void setEdad(int nuevaEdad){
        if (nuevaEdad>=18){
            edad = nuevaEdad;
        }
    }

    public void setLicencia(String nuevaLicencia){
        licencia = nuevaLicencia;
    }


    public void asignarVehiculo (Vehiculo vehiculo){
        vehiculoAsignado = vehiculo;
    }

    //crear un metodo para mostrar informacion de objetos
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Licencia: " + licencia);

        //si vehiculoasignado no tiene nada escribir un mensaje de no tener vehiculo
        if (vehiculoAsignado != null) {
            System.out.println("Vehículo asignado:");
            vehiculoAsignado.mostrarInfo();
        } else {
            System.out.println("Sin vehículo asignado.");
        }
    }
}
