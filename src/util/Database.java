package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:sqlite:notes.db"; // URL de conexão com o banco de dados SQLite
    private static Connection connection;

    // Método para conectar ao banco de dados
    public static void connect() {
        try {
            connection = DriverManager.getConnection(URL);
            System.out.println("Conexão com o banco de dados estabelecida.");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    // Método para desconectar do banco de dados
    public static void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexão com o banco de dados fechada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
        }
    }

    // Método para obter a conexão com o banco de dados
    public static Connection getConnection() {
        return connection;
    }
}
