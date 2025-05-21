/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneychanger;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;

public class MoneyChanger {
    private String nama;
    private String lokasi;
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<ExchangeRate> exchangeRates = new ArrayList<>();

    public MoneyChanger(String nama, String lokasi) {
        this.nama = nama;
        this.lokasi = lokasi;
    }

    public void tambahPegawai(Employee e) {
        employees.add(e);
    }

    public void tambahExchangeRate(ExchangeRate rate) {
        exchangeRates.add(rate);
    }

    public String getNama() {
        return nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<ExchangeRate> getExchangeRates() {
        return exchangeRates;
    }
}
