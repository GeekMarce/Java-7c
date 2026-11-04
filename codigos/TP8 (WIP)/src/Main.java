public class Main {
    public static void main(String[]args){
        Libro libro1 = new Libro("El Hobbit", "Fantasia", 1937, "Tolkien", "Minotauro");

        System.out.println(libro1.gettitulo());
        System.out.println(libro1.geteditor());
    }
}
