/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;
import DAO.TransactionDAO;
import Model.Transaction;
import java.sql.*;
import java.util.List;
/**
 *
 * @author jeje
 */
public class TransactionService {
    
    private TransactionDAO DAO;
    
    public TransactionService()throws SQLException{
        DAO = new TransactionDAO();
    }
    
    public void save(String customerUsername, String currencyFrom, String currencyTo, double ammountFrom, double ammountTo, double rateUsed)throws SQLException{
        Transaction tx = new Transaction(customerUsername, currencyFrom, currencyTo, ammountFrom, ammountTo, rateUsed);
        DAO.saveTransaction(tx);
    }
    
    public List<Transaction> viewHistory(String username) throws SQLException {
        return DAO.viewTransactionHistory(username);
    }
    
    public List<Transaction> viewRecord() throws SQLException {
        return DAO.viewTransactionRecord();
    }
}
