/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jeje
 */
public class ExchangeRate {
    private String currencyFrom;
    private String currencyTo;
    private double rate;

    public ExchangeRate(String currencyFrom, String currencyTo, double rate) {
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.rate = rate;
    }
    
    public ExchangeRate(String currencyFrom, String currencyTo) {
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
    }

    public String getCurrencyFrom() { return currencyFrom; }
    public String getCurrencyTo() { return currencyTo; }
    public double getRate() { return rate; }
}
