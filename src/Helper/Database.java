/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author danutryas
 */
public class Database {
    private static final String DB_URL = "jdbc:mysql://localhost/fsms";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "password";
    private Connection CONN;
    private Statement STMT;
    private ResultSet RS;

    public Database() {
        try {
            CONN = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            STMT = CONN.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            RS = STMT.executeQuery(SQLString);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return RS;
    }
    public void query(String SQLString) {
        try {
            STMT.executeUpdate(SQLString);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public Connection getConnection(){
        return CONN;
    }
}


