/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Model.Transaction;
import Services.TransactionService;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author jeje
 */
public class History extends javax.swing.JFrame {
private TransactionForm Transaction;
private TransactionService Tservice;
private String username;
LoginForm login;
    /**
     * Creates new form History
     */
    public History(String username, LoginForm login) throws SQLException{
        this.username= username;
        Tservice = new TransactionService();
        Transaction = new TransactionForm(username,login);
        this.login = login;
        initComponents();
        setVisible(true);
        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableHistory = new javax.swing.JTable();
        ReturnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("History");

        tableHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableHistory);

        ReturnButton.setText("Return");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReturnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReturnButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        setVisible(false);
        Transaction.setVisible(true);
    }//GEN-LAST:event_ReturnButtonActionPerformed
    public void showTable(){
        try {
        List<Transaction> history = Tservice.viewHistory(username);

        String[] columns = {"Username","From", "To", "Amount", "Converted", "Rate"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        for (Transaction trx : history) {
            Object[] row = {
                trx.getCustomerUsername(),
                trx.getCurrencyFrom(),
                trx.getCurrencyTo(),
                trx.getAmountFrom(),
                trx.getAmountTo(),
                trx.getRateUsed()
            };
            model.addRow(row);
        }

        tableHistory.setModel(model);

    } catch (SQLException e) {
        e.printStackTrace();
    }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReturnButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHistory;
    // End of variables declaration//GEN-END:variables
}
