/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Model.Currency;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import util.DatabaseConnection;
/**
 *
 * @author jeje
 */
public class CurrencyDAO {
    private Connection conn;
    
    public CurrencyDAO(){
        this.conn = DatabaseConnection.getConnection();
    }
    
    public List<String> getCode(){
        List<String> code = new ArrayList<>();
        try{
            String sql = "Select Code from Currencies";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                code.add(rs.getString("code"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return code;
    }
    
    public boolean addCurrency(Currency cur){
        try {
            String sql = "INSERT INTO Currencies (code, name) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cur.getCode());
            ps.setString(2, cur.getName());
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean removeCurrency(Currency cur){
        try {
            String sql = "DELETE FROM Currencies WHERE code = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cur.getCode());
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean currencyExists(String code) {
        try {
            String sql = "SELECT 1 FROM Currencies WHERE code = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
