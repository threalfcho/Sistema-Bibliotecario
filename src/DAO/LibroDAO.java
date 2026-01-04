package DAO;

import DB.Conexion;
import AbstraccionBiblioteca.Libro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibroDAO {

    public void guardar(Libro libro) {
        String sql = """
            INSERT INTO "Libros" ("Titulo", "Autor", "Existencia")
            VALUES (?, ?, ?)
        """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setInt(3, libro.getExistencia());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

