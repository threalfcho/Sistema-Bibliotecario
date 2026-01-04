package DAO;
import DB.Conexion;
import AbstraccionBiblioteca.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void guardar(Usuario usuario){
        String sql = """
            INSERT INTO "Usuarios" ("Nombre", "Password")
            VALUES (?, ?)
        """;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPassword());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
