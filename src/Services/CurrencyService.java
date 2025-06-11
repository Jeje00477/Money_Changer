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
    
    public void Add(String code, String name){
        Currency cur = new Currency(code,name);
        DAO.addCurrency(cur);
    }
    
    public boolean Remove(String code){
        return DAO.removeCurrency(new Currency(code));
    }
}
