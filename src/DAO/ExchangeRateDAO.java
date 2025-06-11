/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author jeje
 */
import Model.ExchangeRate;
import java.sql.*;
import util.DatabaseConnection;

public class ExchangeRateDAO {
    private Connection conn;

    public ExchangeRateDAO() {
        this.conn = DatabaseConnection.getConnection();
    }

    public boolean addRate(ExchangeRate rate) {
        try {
            String sql = "INSERT INTO ExchangeRates (currencyFrom, currencyTo, rate) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, rate.getCurrencyFrom());
            ps.setString(2, rate.getCurrencyTo());
            ps.setDouble(3, rate.getRate());
            return ps.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
            
        }
    }
    
    public void removeRate(ExchangeRate rate){
        try {
            String sql = "DELETE FROM ExchangeRates WHERE currencyFrom = ? OR currencyTo = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, rate.getCurrencyFrom());
            ps.setString(2, rate.getCurrencyTo());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
