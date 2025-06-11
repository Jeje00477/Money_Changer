/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import util.DatabaseConnection;
import java.sql.*;
import Model.Transaction;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author jeje
 */
public class TransactionDAO {
    private Connection conn;
    
    public TransactionDAO(){
        this.conn = DatabaseConnection.getConnection();
    }
    
    public void saveTransaction(Transaction tx) {
        String sql = "INSERT INTO transactions (customerUsername, currencyFrom, currencyTo, amountFrom, amountTo, rateUsed) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, tx.getCustomerUsername());
            ps.setString(2, tx.getCurrencyFrom());
            ps.setString(3, tx.getCurrencyTo());
            ps.setDouble(4, tx.getAmountFrom());
            ps.setDouble(5, tx.getAmountTo());
            ps.setDouble(6, tx.getRateUsed());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Transaction> viewTransactionHistory(String username) {
        List<Transaction> list = new ArrayList<>();
        String sql = "SELECT * FROM transactions WHERE customerUsername = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Transaction tx = new Transaction(
                    rs.getString("customerUsername"),
                    rs.getString("currencyFrom"),
                    rs.getString("currencyTo"),
                    rs.getDouble("amountFrom"),
                    rs.getDouble("amountTo"),
                    rs.getDouble("rateUsed")
                );
                list.add(tx);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<Transaction> viewTransactionRecord() {
        List<Transaction> list = new ArrayList<>();
        String sql = "SELECT * FROM transactions";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Transaction tx = new Transaction(
                    rs.getString("customerUsername"),
                    rs.getString("currencyFrom"),
                    rs.getString("currencyTo"),
                    rs.getDouble("amountFrom"),
                    rs.getDouble("amountTo"),
                    rs.getDouble("rateUsed")
                );
                list.add(tx);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
