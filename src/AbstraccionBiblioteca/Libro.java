package AbstraccionBiblioteca;

public class Libro {
    private long id ;
    private String titulo;
    private String Autor;
    private int existencia;


    //Constructor de Libro
    public Libro( String titulo, String autor, int existencia) {
        this.titulo = titulo;
        Autor = autor;
        this.existencia = existencia;
    }

    public boolean verificarDisponibilidad(){
        if(this.existencia == 0)
            return false;
        else
            return  true;
    }

    public void reducirExistencia(){
        existencia--;
    }
    public void aumentarExistencia(){
        existencia++;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
}
