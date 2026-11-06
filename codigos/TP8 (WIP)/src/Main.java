import javax.swing.JOptionPane;
public class Main  {
    public static void main(String[]args){        

        //creamos los objetos para libros con distintos atributos
        Libro libro1 = new Libro("El Hobbit", "Fantasia", 1937, "Minotauro", "J.R.R. Tolkien");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Novela", 1605, "Francisco de Robles", "Miguel de Cervantes");
        Libro libro3 = new Libro("1984", "Ciencia ficcion", 1949, "Secker & Warburg", "George Orwell");
        Libro libro4 = new Libro("Cien años de soledad", "Realismo magico", 1967, "Sudamericana", "Gabriel Garcia Marquez");


        //pantalla de seleccion de modo de programa (por ahora solo uno)
        int seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione su operación : Consultarlibro (1)"));

        //hacemos un switch para elegir entre los distintos modos usando la variable seleccion
        // (iba a usar if pero creo que hubiese sido aun mas quilombo, switch en mi cabeza sonaba mas simple)
        switch (seleccion){

            case 1:
                //mostramos un mensaje con las opciones de los libros
                String seleccionLibro = JOptionPane.showInputDialog("Seleccione su libro: El Hobbit, Don Quijote de la Mancha, 1984, Cien años de soledad");
                
                // seleccionamos el libro
                switch(seleccionLibro){
                    case "El Hobbit":
                        libro1.MostrarInfoLibro();
                        break;
                    case "Don Quijote de la Mancha":
                        libro2.MostrarInfoLibro();
                        break;
                    case "1984":
                        libro3.MostrarInfoLibro();
                        break;
                    case "Cien años de soledad":
                        libro4.MostrarInfoLibro();
                        break;
                }
                break;
            

            //casos de switch sin uso (por ahora)
            case 2:
                break;
            default:
                break;
        }
    }
}
