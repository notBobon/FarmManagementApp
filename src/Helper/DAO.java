/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO {
    private static final String INSERT_ANIMAL_QUERY = "INSERT INTO animals (type, unit_price) VALUES (?, ?)";
    
    public void insertAnimal(String type, double unitPrice) {
        try (Connection connection = DatabaseConnector.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ANIMAL_QUERY)) {
            preparedStatement.setString(1, type);
            preparedStatement.setDouble(2, unitPrice);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error inserting animal into the database", e);
        }
    }
}

