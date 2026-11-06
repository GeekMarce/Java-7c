public class Revista extends MaterialBibliografico{
    private int cantPaginas = 0;

    public Revista (String titulo, String tematica, int agnopublicacion, int nuevacantPaginas){
        super(titulo, tematica, agnopublicacion);
        this.cantPaginas = nuevacantPaginas;
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

    public int getcantPaginas(){
        return cantPaginas;
    }

    public void setcantPaginas(int nuevacantPaginas){
        cantPaginas = nuevacantPaginas;
    }


    public void MostrarInfoRevista(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Año de Publicacion: " + getAgnopublicacion());
        System.out.println("tematica: " + getTematica());
        System.out.println("Cantidad de Paginas: " + getcantPaginas());
    }
}