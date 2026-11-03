public class Vehiculo {

    //declaramos variables privadas predeterminadas
    private String marca = "";
    private String modelo = "";
    private int anio = 0;
    private String matricula = "";
    private double kilometraje = 0;

    //creamos el constructor
    public Vehiculo (String iniciomarca, String iniciomodelo, int inicioanio, String iniciomatricula, double iniciokilometraje){

        marca = iniciomarca;
        modelo = iniciomodelo;
        anio = inicioanio;
        matricula = iniciomatricula;
        kilometraje = iniciokilometraje;
    }

    //obtenemos informacion con getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnio() {
        return anio;
    }
    public String getMatricula() {
        return matricula;
    }
    public double getKilometraje() {
        return kilometraje;
    }

    //dar posibilidad de modificar datos con setters
    public void setMarca (String nuevaMarca){

    marca = nuevaMarca;
    }
    
    public void setModelo (String nuevoModelo){

    modelo = nuevoModelo;
    }

    // que el año del vehiculo sea valido si es el año actual o anterior
    public void setAnio(int nuevoAnio) {
        if (nuevoAnio <= java.time.Year.now().getValue()) {

            anio = nuevoAnio;
        }
    }

    //prohibir kilometraje negativo
    public void setKilometraje(double nuevoKilometraje){
        if (nuevoKilometraje>= 0){

            kilometraje = nuevoKilometraje;
        }
    }

    public void setMatricula(String nuevaMatricula){

        matricula = nuevaMatricula;
    }

    // crear metodo mostrarinfo para mostrar la informacion del vehiculo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("año: " + anio);
        System.out.println("Matricula: " + matricula);
        System.out.println("Kilometraje: " + kilometraje);
    }   
}
