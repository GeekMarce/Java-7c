public class MaterialBibliografico {
    
    private String titulo = "";
    private String tematica = "";
    private int agnoPublicacion = 0;

    public MaterialBibliografico (String iniciotitulo, String iniciotematica, int incioagnopublicacion){

        titulo = iniciotitulo;
        tematica = iniciotematica;
        agnoPublicacion = incioagnopublicacion;
    }

    public String gettitulo(){
        return titulo;
    }
    public String gettematica(){
        return tematica;
    }
    public int getagnopublicacion(){
        return agnoPublicacion;
    }

    public void settitulo (String nuevoTitulo){
        titulo = nuevoTitulo;
    }
    public void settematica (String nuevaTematica){
        tematica = nuevaTematica;
    }
    public void setagnopublicacion (int nuevoAgnopublicacion){
        if (nuevoAgnopublicacion <= java.time.Year.now().getValue()){
            agnoPublicacion = nuevoAgnopublicacion;
        }
    }

















}
