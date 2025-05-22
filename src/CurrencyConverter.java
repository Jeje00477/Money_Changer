/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jeje
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class CurrencyConverter{
    private ArrayList<String> curList;
    private ArrayList<Double> rate;
    private static CurrencyConverter instance;
    
    public CurrencyConverter(){
        curList = new ArrayList<>();
        rate = new ArrayList<>();
        addCurr("USD", 0.000061);
        addCurr("YEN", 0.0088);
        addCurr("RINGGIT", 0.00026);
        addCurr("EURO", 0.000054);
        instance = this;
    }
    
    public static CurrencyConverter getInstance() {
    if (instance == null) {
        instance = new CurrencyConverter();
    }
    return instance;
    }
    
    public void addCurr(String curr, double rate_){
        curList.add(curr.toUpperCase());
        rate.add(rate_);
    }
    
    public void removeCur(String cur){
        for (int i = 0; i<curList.size();i++){
            if(curList.get(i).equalsIgnoreCase(cur)){
                curList.remove(i);
                rate.remove(i);
                return;
            }
        } System.out.println("Mata uang tidak ditemukan: "+cur);
    }
    
    public void convert(double amount, String fromCurrency, String toCurrency) {
        if (!fromCurrency.equalsIgnoreCase("IDR")) {
            JOptionPane.showMessageDialog(null, "Saat ini hanya mendukung konversi dari IDR.");
            return;
        }

        for (int i = 0; i < curList.size(); i++) {
            if (curList.get(i).equalsIgnoreCase(toCurrency)) {
                double result = amount * rate.get(i);
                JOptionPane.showMessageDialog(null, "Your Amount will be " + result);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Mata uang tujuan tidak ditemukan.");
    }
}
