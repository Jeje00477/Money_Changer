/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import DAO.CurrencyDAO;
import Model.Currency;
import java.sql.*;
/**
 *
 * @author jeje
 */
public class CurrencyService {
    private CurrencyDAO DAO;
    
    public CurrencyService() throws SQLException{
        DAO = new CurrencyDAO();
    }
    
    public boolean Add(String code, String name) {
    if (!DAO.currencyExists(code)) {
        return DAO.addCurrency(new Currency(code, name));
    } else {
        return true;
    }
}
    
    public boolean Remove(String code){
        return DAO.removeCurrency(new Currency(code));
    }
    
    public boolean exists(String code){
        return DAO.currencyExists(code);
    }
}
