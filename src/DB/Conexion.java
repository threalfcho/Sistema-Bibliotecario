package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

        private static final String URL = "jdbc:postgresql://localhost:5432/Biblioteca";
        private static final String USER = "fcho";
        private static final String PASSWORD = "admin";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }

}
