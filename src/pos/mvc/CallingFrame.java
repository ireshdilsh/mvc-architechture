/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc;

import java.util.logging.Level;
import java.util.logging.Logger;
import pos.mvc.view.CustomerView;
import pos.mvc.view.ItemView;
import pos.mvc.view.OrderView;

/**
 *
 * @author DELL
 */
public class CallingFrame extends javax.swing.JFrame {

    /**
     * Creates new form CallingFrame
     */
    public CallingFrame() {
        initComponents();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        customerButton = new javax.swing.JButton();
        itemButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(java.awt.SystemColor.windowBorder);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerButton.setBackground(new java.awt.Color(153, 153, 153));
        customerButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        customerButton.setText("CUSTOMER FORM");
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });
        jPanel3.add(customerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        itemButton.setBackground(new java.awt.Color(153, 153, 153));
        itemButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        itemButton.setText("ITEMS FORM");
        itemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemButtonActionPerformed(evt);
            }
        });
        jPanel3.add(itemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 280, 190, -1));

        orderButton.setBackground(new java.awt.Color(153, 153, 153));
        orderButton.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        orderButton.setText("ORDER FORM");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });
        jPanel3.add(orderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 190, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Welcome to the Homepage");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Downloads\\pexels-photo-4199043.jpeg")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 560));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemButtonActionPerformed
        try {
            new ItemView().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CallingFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_itemButtonActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
                              new OrderView().setVisible(true);
    }//GEN-LAST:event_orderButtonActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
               new CustomerView().setVisible(true);
    }//GEN-LAST:event_customerButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerButton;
    private javax.swing.JButton itemButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton orderButton;
    // End of variables declaration//GEN-END:variables
}
