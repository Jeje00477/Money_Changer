/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;



import java.sql.*;
import util.DatabaseConnection;
import DAO.ExchangeRateDAO;
import Model.ExchangeRate;

/**
 *
 * @author jeje
 */
public class ExchangeRateService {
    private Connection conn;
    private ExchangeRateDAO DAO;
    public ExchangeRateService()throws SQLException{
        this.conn = DatabaseConnection.getConnection();
        DAO = new ExchangeRateDAO();
    }
    
    public double getRate(String from, String to) {
        try {
            String sql = "SELECT rate FROM ExchangeRates WHERE currencyFrom = ? AND currencyTo = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, from);
            ps.setString(2, to);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getDouble("rate");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1.0;
    }
    
    public boolean add(String CurrencyFrom, String CurrencyTo, double rate){
        return DAO.addRate(new ExchangeRate(CurrencyFrom, CurrencyTo,rate));
    }
    
    public void remove(String from, String to){
        DAO.removeRate(new ExchangeRate(from, to));
    }
}
