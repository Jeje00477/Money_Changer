/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moneychanger;

/**
 *
 * @author LENOVO
 */
public class Employee {
    private int id;
    private String nama;
    private String role;

    public Employee(int id, String nama, String role) {
        this.id = id;
        this.nama = nama;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getRole() {
        return role;
    }
}
