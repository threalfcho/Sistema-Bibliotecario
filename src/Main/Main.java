package Main;

import AbstraccionBiblioteca.Libro;
import AbstraccionBiblioteca.Usuario;
import DAO.LibroDAO;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro(
                "El Alquimista",
                "Pablo Coelo",
                2
        );

        LibroDAO dao = new LibroDAO();
        dao.guardar(libro);

        System.out.println("Libro guardado correctamente");

    }
}
