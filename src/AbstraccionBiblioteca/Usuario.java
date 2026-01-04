package AbstraccionBiblioteca;

import java.util.ArrayList;

public class Usuario {
    private long id;
    private String nombre;
    private String password;
    private ArrayList<Libro> librosEnUso = new ArrayList<>();

    //Constructor de Usuario
    //Primero se debe crear el usuario, luego solicitar un libro

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public void solicitarLibro(Libro libro){
        if(!libro.verificarDisponibilidad())
        {
            System.out.println("El libro solicitado no se encuentra disponible por el momento");
            System.out.println("Vuelva pronto y vuelva a intentarlo");
        }
        if (this.librosEnUso.size() >= 3)
        {
            System.out.println("El usuario ha llegado a su limite de 3 libros en uso");
            System.out.println("Realiza la devolucion y vuelva a intentarlo");
        }
        else{
            this.librosEnUso.add(libro);
            libro.reducirExistencia();
            System.out.println("El libro: " + libro.getTitulo() + " ha sido prestado con exito");
            System.out.println("Tiene un plazo de una semana para devolverlo");
        }
    }

    public void devolverLibro(Libro libro)
    {
        try {
            this.librosEnUso.remove(libro);
            libro.aumentarExistencia();
            System.out.println("El libro: " + libro.getTitulo() + " ha sido devuelto con exito");
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Ocurrio un error al devolver el libro");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Libro> getLibrosEnUso() {
        return librosEnUso;
    }

    public void setLibrosEnUso(ArrayList<Libro> librosEnUso) {
        this.librosEnUso = librosEnUso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void agregarLibro(Libro libro){
        if (librosEnUso.size() == 3)
            throw new IllegalArgumentException("Ha alcanzado el limite de Prestamos");
        else
            librosEnUso.add(libro);
    }
}
