package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Database {
    private static final String DB_URL = "jdbc:mysql://localhost:3307/fsms";
    private static final String DB_USER = "admin";
    private static final String DB_PASS = "password";
    private Connection CONN;

    public Database() {
        try {
            CONN = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public ResultSet getData(String SQLString) {
        try (Statement STMT = CONN.createStatement()) {
            return STMT.executeQuery(SQLString);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Communication Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }

    public void query(String SQLString) {
        try (Statement STMT = CONN.createStatement()) {
            STMT.executeUpdate(SQLString);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Communication Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public Connection getConnection() {
        return CONN;
    }
}
