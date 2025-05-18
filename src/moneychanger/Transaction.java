/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneychanger;

/**
 *
 * @author LENOVO
 */
import java.util.Date;

public class Transaction {
    private int id;
    private int customerId;
    private String currencyFrom;
    private String currencyTo;
    private double amountFrom;
    private double amountTo;
    private double rateUsed;
    private Date tanggal;

    public Transaction(int id, int customerId, String currencyFrom, String currencyTo,
                       double amountFrom, double rateUsed, Date tanggal) {
        this.id = id;
        this.customerId = customerId;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.amountFrom = amountFrom;
        this.rateUsed = rateUsed;
        this.amountTo = amountFrom * rateUsed;
        this.tanggal = tanggal;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public double getAmountFrom() {
        return amountFrom;
    }

    public double getAmountTo() {
        return amountTo;
    }

    public double getRateUsed() {
        return rateUsed;
    }

    public Date getTanggal() {
        return tanggal;
    }
}
