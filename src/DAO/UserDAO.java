/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import util.DatabaseConnection;

/**
 *
 * @author jeje
 */
public class UserDAO {
    
    private Connection conn;
    
    public UserDAO(){
        this.conn = DatabaseConnection.getConnection();
    }
    
    public void register(User user) throws SQLException {
        String sql = "INSERT INTO Users (username, name, phoneNumber, password) VALUES (?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getName());
        ps.setString(3,user.getPhoneNumber());
        ps.setString(4,user.getPassword());
        ps.executeUpdate();
    }
    public boolean login(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
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
