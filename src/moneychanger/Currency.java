/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneychanger;

/**
 *
 * @author LENOVO
 */
public class Currency {
    private String code;
    private String nama;
    private String symbol;

    public Currency(String code, String nama, String symbol) {
        this.code = code;
        this.nama = nama;
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public String getNama() {
        return nama;
    }

    public String getSymbol() {
        return symbol;
    }
}
