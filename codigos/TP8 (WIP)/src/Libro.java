public class Libro extends MaterialBibliografico{

    private String editorial = "";
    private String editor = "";

    public Libro (String titulo, String tematica, int agnopublicacion, String nuevaEditorial, String nuevoEditor){
        super(titulo, tematica, agnopublicacion);
        this.editorial = nuevaEditorial;
        this.editor = nuevoEditor;

    }

    public String getEditorial(){
        return editorial;
    }
    public String getEditor(){
        return editor;
    }

    public String getTitulo(){
        return super.gettitulo();
    }

    public int getAgnopublicacion() {
        return super.getagnopublicacion();
    }

    public String getTematica() {
        return super.gettematica();
    }

    public void setEditorial(String nuevoEditorial){
        editorial = nuevoEditorial;
    }
    public void setEditor (String nuevoEditor){
        editor = nuevoEditor;
    }

    public void MostrarInfoLibro(){
        System.out.println("titulo: " + getTitulo());
        System.out.println("año de publicacion: " + getAgnopublicacion());
        System.out.println("tematica: " + getTematica());
        System.out.println("editor: " + getEditor());
        System.out.println("editorial: " + getEditorial());


    }


}