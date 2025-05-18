/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneychanger;

/**
 *
 * @author LENOVO
 */
public class Customer {
    private int id;
    private String nama;
    private String noHP;

    public Customer(int id, String nama, String noHP) {
        this.id = id;
        this.nama = nama;
        this.noHP = noHP;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHP() {
        return noHP;
    }
}
