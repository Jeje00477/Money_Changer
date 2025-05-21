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

public class Receipt {
    private int id;
    private int transactionId;
    private Date printedAt;

    public Receipt(int id, int transactionId, Date printedAt) {
        this.id = id;
        this.transactionId = transactionId;
        this.printedAt = printedAt;
    }

    public int getId() {
        return id;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Date getPrintedAt() {
        return printedAt;
    }
}
