/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jeje
 */
public class Transaction {
    
    private String customerUsername;
    private String currencyFrom;
    private String currencyTo;
    private Double ammountFrom;
    private Double ammountTo;
    private Double rateUsed;
    
    public Transaction(String customerUsername, String currencyFrom, String currencyTo, double ammountFrom, double ammountTo, double rateUsed){
        this.customerUsername=customerUsername;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.ammountFrom = ammountFrom;
        this.rateUsed = rateUsed;
        this.ammountTo = ammountTo;
    }
    
    public String getCustomerUsername() { return customerUsername; }
    public String getCurrencyFrom() { return currencyFrom; }
    public String getCurrencyTo() { return currencyTo; }
    public double getAmountFrom() { return ammountFrom; }
    public double getAmountTo() { return ammountTo; }
    public double getRateUsed() { return rateUsed; }
}
