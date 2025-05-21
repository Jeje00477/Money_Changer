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

public class ExchangeRate {
    private int id;
    private String currencyFrom;
    private String currencyTo;
    private double rate;
    private Date tanggal;

    public ExchangeRate(int id, String currencyFrom, String currencyTo, double rate, Date tanggal) {
        this.id = id;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.rate = rate;
        this.tanggal = tanggal;
    }

    public int getId() {
        return id;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public double getRate() {
        return rate;
    }

    public Date getTanggal() {
        return tanggal;
    }
}
