/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.controller.ItemController;
import pos.mvc.model.ItemModel;

public class ItemView extends javax.swing.JFrame {
  private ItemController itemController;
   
    public ItemView() throws ClassNotFoundException {
        itemController=new ItemController();
        initComponents();
        loadAllItems();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        itemcodeLabel = new javax.swing.JLabel();
        itemCodeText = new javax.swing.JTextField();
        itemdiscriptionLabel = new javax.swing.JLabel();
        itemPriceLabel = new javax.swing.JLabel();
        itemPacksizeLabel = new javax.swing.JLabel();
        itemDiscriptionText1 = new javax.swing.JTextField();
        itemPacksizeText = new javax.swing.JTextField();
        itemPriceText = new javax.swing.JTextField();
        itemqohLabel = new javax.swing.JLabel();
        itemQOHText = new javax.swing.JTextField();
        deleteitemButton = new javax.swing.JButton();
        addItemButton = new javax.swing.JButton();
        updateitemButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Manage Item");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(headerlabel)
                .addContainerGap())
        );

        itemcodeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemcodeLabel.setText("Item Code");

        itemdiscriptionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemdiscriptionLabel.setText("Discription");

        itemPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemPriceLabel.setText("Unit Price");

        itemPacksizeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemPacksizeLabel.setText("Pack Size");

        itemDiscriptionText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDiscriptionText1ActionPerformed(evt);
            }
        });

        itemPacksizeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPacksizeTextActionPerformed(evt);
            }
        });

        itemPriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPriceTextActionPerformed(evt);
            }
        });

        itemqohLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemqohLabel.setText("QOH");

        deleteitemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteitemButton.setText("Delete Item");
        deleteitemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitemButtonActionPerformed(evt);
            }
        });

        addItemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        updateitemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateitemButton.setText("Update Item");
        updateitemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateitemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(itemPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(itemdiscriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addComponent(itemcodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addComponent(itemPacksizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addComponent(itemqohLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itemDiscriptionText1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemPacksizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemQOHText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(deleteitemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateitemButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addItemButton)
                        .addGap(32, 32, 32))))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemcodeLabel)
                    .addComponent(itemCodeText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemDiscriptionText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemdiscriptionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemPacksizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemPacksizeLabel))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemPriceLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemqohLabel)
                    .addComponent(itemQOHText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteitemButton)
                    .addComponent(updateitemButton)
                    .addComponent(addItemButton))
                .addContainerGap())
        );

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        itemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(formPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemPriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemPriceTextActionPerformed

    private void deleteitemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitemButtonActionPerformed
      try {        
          deleteItem();
      } catch (SQLException ex) {
          Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_deleteitemButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
          saveItem();        
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void updateitemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateitemButtonActionPerformed
          updateItem();        
    }//GEN-LAST:event_updateitemButtonActionPerformed

    private void itemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemTableMouseClicked
       searchItem();        
    }//GEN-LAST:event_itemTableMouseClicked

    private void itemDiscriptionText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDiscriptionText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemDiscriptionText1ActionPerformed

    private void itemPacksizeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPacksizeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemPacksizeTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton deleteitemButton;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JTextField itemCodeText;
    private javax.swing.JTextField itemDiscriptionText1;
    private javax.swing.JLabel itemPacksizeLabel;
    private javax.swing.JTextField itemPacksizeText;
    private javax.swing.JLabel itemPriceLabel;
    private javax.swing.JTextField itemPriceText;
    private javax.swing.JTextField itemQOHText;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel itemcodeLabel;
    private javax.swing.JLabel itemdiscriptionLabel;
    private javax.swing.JLabel itemqohLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton updateitemButton;
    // End of variables declaration//GEN-END:variables

    public void loadAllItems() throws ClassNotFoundException {
        
      try {
          String[]columns={"ItemCode","Discription","PackSize","UnitPrice","QTY"};
          DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
              @Override
              public boolean isCellEditable(int row, int column) {
                  return false;
              }
          };
          itemTable.setModel(dtm);
          
          ArrayList<ItemModel>itemModels=itemController.getAllItems();
          for (ItemModel item : itemModels) {
              Object[]row={item.getItemCode(),item.getDescription(),item.getPackSize(),item.getUnitPrice(),item.getQoh()};
              dtm.addRow(row);
          }
      } catch (SQLException ex) {
          Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(this, ex.getMessage());
      }
    }

    private void saveItem() {
        
      try {
          ItemModel itemModel=new ItemModel(itemCodeText.getText(),
                  itemDiscriptionText1.getText(),
                  itemPacksizeText.getText(),
                  Double.parseDouble(itemPriceText.getText()),
                  Integer.parseInt(itemQOHText.getText()));
          
          String resp=itemController.saveItem(itemModel);
          
          JOptionPane.showMessageDialog(this, resp);
          clear();
          loadAllItems();
      } catch (SQLException ex) {
          Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    private void clear() {
        
        itemCodeText.setText("");
        itemDiscriptionText1.setText("");
        itemPacksizeText.setText("");
        itemPriceText.setText("");
        itemQOHText.setText("");
    }

    private void searchItem(){
        
      try {
          String itemCode= itemTable.getValueAt(itemTable.getSelectedRow(), 0).toString();
          ItemModel itemModel=itemController.searchItem(itemCode);
          
          if(itemModel!=null){
              itemCodeText.setText(itemModel.getItemCode());
              itemDiscriptionText1.setText(itemModel.getDescription());
              itemPacksizeText.setText(itemModel.getPackSize());
              itemPriceText.setText(Double.toString(itemModel.getUnitPrice()));
              itemQOHText.setText(Integer.toString(itemModel.getQoh()));
          }else{
              JOptionPane.showMessageDialog(this, "Item Not Found");
          }
      } catch (SQLException ex) {
          Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(this, ex.getMessage());
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    private void updateItem() {
        
      try {
          ItemModel itemModel=new ItemModel(itemCodeText.getText(),
                  itemDiscriptionText1.getText(),
                  itemPacksizeText.getText(),
                  Double.parseDouble(itemPriceText.getText()),
                  Integer.parseInt(itemQOHText.getText()));
          String resp=itemController.updateItem(itemModel);
          JOptionPane.showMessageDialog(this, resp);
          clear();
          loadAllItems();
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(this, ex.getMessage());
      } catch (SQLException ex) {
          Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    private void deleteItem() throws SQLException  {
      try {
          String itemCode= itemCodeText.getText();
          String resp=itemController.deleteItem(itemCode);
          JOptionPane.showMessageDialog(this, resp);
          clear();
          loadAllItems();
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(this, ex.getMessage());
      }
    }
}
