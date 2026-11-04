public class Libro extends MaterialBibliografico{

    private String editorial = "";
    private String editor = "";

    public Libro (String titulo, String tematica, int agnopublicacion){
        super(titulo, tematica, agnopublicacion);
    }

    public String getEditorial{
        return editorial
    }
    public String getEditor{
        return editor
    }

    public void setEditorial(String nuevoEditorial){
        editorial = nuevaEditorial;
    }
    public void setEditor (String nuevoEditor){
        editor = nuevoEditor;
    }
}