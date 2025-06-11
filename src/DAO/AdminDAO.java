/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import util.DatabaseConnection;

/**
 *
 * @author jeje
 */
public class AdminDAO {
    private Connection conn;
    
    public AdminDAO(){
        this.conn = DatabaseConnection.getConnection();
    }
    
    public boolean login(String username, String password) {
        String sql = "SELECT * FROM Admins WHERE username = ? AND password = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.err.println("Error logging in: " + e.getMessage());
            return false;
        }
    }
}
