/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package pos.mvc.view;
/*
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.controller.CustomerController;
import pos.mvc.controller.ItemController;
import pos.mvc.controller.OrderController;
import pos.mvc.model.CustomerModel;
import pos.mvc.model.ItemModel;
import pos.mvc.model.OrderDetailModel;
import pos.mvc.model.OrderModel;

public class OrderView extends javax.swing.JFrame {
   
     private OrderController orederController;
     private CustomerController customerController;
     private ItemController itemController;
     
     ArrayList<OrderDetailModel>orderDetailseModel=new ArrayList<>();
   
    public OrderView() {
        customerController=new CustomerController();
        itemController=new ItemController();
        orederController=new OrderController();
        initComponents();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        orderidLabel = new javax.swing.JLabel();
        orderIDText = new javax.swing.JTextField();
        qtyLabel = new javax.swing.JLabel();
        CustomerIDText = new javax.swing.JTextField();
        searchCustomerButton = new javax.swing.JButton();
        itemDataLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        customeridLabel1 = new javax.swing.JLabel();
        ItemIDText = new javax.swing.JTextField();
        searchItemButton1 = new javax.swing.JButton();
        customerDataLabel1 = new javax.swing.JLabel();
        itemidLabel1 = new javax.swing.JLabel();
        discountLabel2 = new javax.swing.JLabel();
        qtyText = new javax.swing.JTextField();
        discountText = new javax.swing.JTextField();
        addItemButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ItemTable = new javax.swing.JTable();
        plceOrderButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Order");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(headerlabel)
                .addContainerGap())
        );

        orderidLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderidLabel.setText("Order ID");

        orderIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIDTextActionPerformed(evt);
            }
        });

        qtyLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        qtyLabel.setText("QTY");

        CustomerIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIDTextActionPerformed(evt);
            }
        });

        searchCustomerButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchCustomerButton.setText("Search Customer");
        searchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtonActionPerformed(evt);
            }
        });

        customeridLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customeridLabel1.setText("Customer ");

        searchItemButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchItemButton1.setText("Search Item");
        searchItemButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemButton1ActionPerformed(evt);
            }
        });

        itemidLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemidLabel1.setText("Item ID");

        discountLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        discountLabel2.setText("Discount");

        addItemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );

        ItemTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(ItemTable);

        plceOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        plceOrderButton.setText("Place Order");
        plceOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plceOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customeridLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(discountLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemidLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(searchCustomerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(customerDataLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(discountText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(qtyText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ItemIDText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchItemButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(addItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addComponent(itemDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(225, 225, 225))
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plceOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(orderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderidLabel))
                                .addGap(18, 18, 18)
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchCustomerButton)
                                    .addComponent(customeridLabel1)))
                            .addComponent(customerDataLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ItemIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(searchItemButton1)
                                .addComponent(itemidLabel1))
                            .addComponent(itemDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtyLabel)
                            .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(discountLabel2))
                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addItemButton)))
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(plceOrderButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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
    }// </editor-fold>                        

    private void CustomerIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerIDTextActionPerformed

    private void orderIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderIDTextActionPerformed

    private void custSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerButtonActionPerformed
        searchCustomer();
    }//GEN-LAST:event_searchCustomerButtonActionPerformed

    private void itemSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemButton1ActionPerformed
        searchItem();
    }//GEN-LAST:event_searchItemButton1ActionPerformed

    private void itemAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        addToTable();
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plceOrderButtonActionPerformed
       placeorder();
    }//GEN-LAST:event_plceOrderButtonActionPerformed

    

    // Variables declaration - do not modify                     
    private javax.swing.JTextField CustomerIDText;
    private javax.swing.JTextField ItemIDText;
    private javax.swing.JTable ItemTable;
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel customerDataLabel1;
    private javax.swing.JLabel customeridLabel1;
    private javax.swing.JLabel discountLabel2;
    private javax.swing.JTextField discountText;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JLabel itemDataLabel;
    private javax.swing.JLabel itemidLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField orderIDText;
    private javax.swing.JLabel orderidLabel;
    private javax.swing.JButton plceOrderButton;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JTextField qtyText;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JButton searchItemButton1;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration                   

    private void searchCustomer() {
         try {
             String custID=CustomerIDText.getText();
             CustomerModel cust=customerController.getCustomer(custID);
             if(cust!=null){
               customerDataLabel1.setText(cust.getName()+", "+cust.getAddress());
             }else{
             JOptionPane.showMessageDialog(this, "Customer Not Found");
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, ex.getMessage());
         } catch (SQLException ex) {
             Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    private void searchItem() {
      
         try {
              String itemId=ItemIDText.getText();
             ItemModel item=itemController.searchItem(itemId);
             if(item!=null){
               itemDataLabel.setText(item.getDescription()+", "+item.getUnitPrice()+", "+item.getQoh());
             }else{
              JOptionPane.showMessageDialog(this, "Item Not Found");
             }
         } catch (SQLException ex) {
             Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, ex.getMessage());
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    private void loadTable(){
     String[]columns={"ItemCode","QTY","Discount"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
            
        };
        ItemTable.setModel(dtm);
    }

    private void addToTable() {
        OrderDetailModel od=new OrderDetailModel("", ItemIDText.getText(), Integer.parseInt(qtyText.getText()), Double.parseDouble(discountText.getText()));
        orderDetailseModel.add(od);
        
        Object[]rowData={od.getItemCode(),od.getQty(),od.getDiscount()};
        DefaultTableModel dtm=(DefaultTableModel) ItemTable.getModel();
        dtm.addRow(rowData);
        cleanItemData();
    }

    private void cleanItemData() {
        ItemIDText.setText("");
        qtyText.setText("");
        discountText.setText("");
    }

    private void placeorder() {
         try {
             SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
             OrderModel orederModel=new OrderModel(orderIDText.getText(),
                     sdf.format(new Date()),
                     CustomerIDText.getText());
             String result=orederController.placeorder(orederModel,orderDetailseModel);                
             JOptionPane.showMessageDialog(this, result);
         } catch (SQLException ex) {
             Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, ex.getMessage());
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
         }
         clearForm();
    }

    private void clearForm() {
     loadTable();
     orderIDText.setText("");
     CustomerIDText.setText("");
    }
}
*/

package pos.mvc.view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.controller.CustomerController;
import pos.mvc.controller.ItemController;
import pos.mvc.controller.OrderController;
import pos.mvc.model.CustomerModel;
import pos.mvc.model.ItemModel;
import pos.mvc.model.OrderDetailModel;
import pos.mvc.model.OrderModel;


public class OrderView extends javax.swing.JFrame {

    private CustomerController customerController;
    private ItemController itemController;
    private OrderController orderController;
    
    ArrayList<OrderDetailModel> orderDetailModels = new ArrayList<>();

    public OrderView() {
        customerController = new CustomerController();
        itemController = new ItemController();
        orderController = new OrderController();
        initComponents();
        loadTable();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        formPanel = new javax.swing.JPanel();
        orderidLabel = new javax.swing.JLabel();
        orderIDText = new javax.swing.JTextField();
        qtyLabel = new javax.swing.JLabel();
        CustomerIDText = new javax.swing.JTextField();
        custSearchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        customeridLabel1 = new javax.swing.JLabel();
        ItemIDText = new javax.swing.JTextField();
        itemSearchButton = new javax.swing.JButton();
        customerDataLabel1 = new javax.swing.JLabel();
        itemidLabel1 = new javax.swing.JLabel();
        discountLabel2 = new javax.swing.JLabel();
        qtyText = new javax.swing.JTextField();
        discountText = new javax.swing.JTextField();
        itemAddButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ItemTable = new javax.swing.JTable();
        placeOrderButton = new javax.swing.JButton();
        itemDataLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Order");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(headerlabel)
                .addContainerGap())
        );

        orderidLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        orderidLabel.setText("Order ID");

        orderIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIDTextActionPerformed(evt);
            }
        });

        qtyLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        qtyLabel.setText("QTY");

        CustomerIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIDTextActionPerformed(evt);
            }
        });

        custSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custSearchButton.setText("Search Customer");
        custSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custSearchButtonActionPerformed(evt);
            }
        });

        customeridLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customeridLabel1.setText("Customer ");

        itemSearchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemSearchButton.setText("Search Item");
        itemSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSearchButtonActionPerformed(evt);
            }
        });

        itemidLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemidLabel1.setText("Item ID");

        discountLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        discountLabel2.setText("Discount");

        itemAddButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemAddButton.setText("Add Item");
        itemAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );

        ItemTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ItemTable);

        placeOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formPanelLayout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(225, 225, 225))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(formPanelLayout.createSequentialGroup()
                                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(formPanelLayout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(orderidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(customeridLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(discountLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(qtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(itemidLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)))
                                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(formPanelLayout.createSequentialGroup()
                                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(discountText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                    .addComponent(qtyText, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ItemIDText, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(18, 18, 18)
                                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(itemSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                                    .addComponent(itemAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(28, 28, 28)
                                                .addComponent(itemDataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(formPanelLayout.createSequentialGroup()
                                                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(orderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(CustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(custSearchButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(customerDataLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))))
                                    .addComponent(jScrollPane2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderidLabel))
                        .addGap(21, 21, 21)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(custSearchButton)
                                .addComponent(customeridLabel1))
                            .addComponent(customerDataLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItemIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemSearchButton)
                            .addComponent(itemidLabel1)
                            .addComponent(itemDataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtyLabel)
                            .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(discountLabel2))
                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(itemAddButton)))
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(formPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(placeOrderButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void custSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custSearchButtonActionPerformed
        searchCustomer();
    }//GEN-LAST:event_custSearchButtonActionPerformed

    private void itemSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSearchButtonActionPerformed
        searchItem();
    }//GEN-LAST:event_itemSearchButtonActionPerformed

    private void itemAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddButtonActionPerformed
        addToTable();
    }//GEN-LAST:event_itemAddButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {try {
//GEN-FIRST:event_placeOrderButtonActionPerformed
        placeOrder();
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void ItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemTableMouseClicked
       
    }//GEN-LAST:event_ItemTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerIDText;
    private javax.swing.JTextField ItemIDText;
    private javax.swing.JTable ItemTable;
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton custSearchButton;
    private javax.swing.JLabel customerDataLabel1;
    private javax.swing.JLabel customeridLabel1;
    private javax.swing.JLabel discountLabel2;
    private javax.swing.JTextField discountText;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JButton itemAddButton;
    private javax.swing.JLabel itemDataLabel;
    private javax.swing.JButton itemSearchButton;
    private javax.swing.JLabel itemidLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField orderIDText;
    private javax.swing.JLabel orderidLabel;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JTextField qtyText;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
    
     private void searchCustomer() {
         try {
             String custID=CustomerIDText.getText();
             CustomerModel cust=customerController.getCustomer(custID);
             if(cust!=null){
               customerDataLabel1.setText(cust.getName()+", "+cust.getAddress());
             }else{
             JOptionPane.showMessageDialog(this, "Customer Not Found");
             }
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, ex.getMessage());
         } catch (SQLException ex) {
             Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    private void searchItem() {
      
         try {
              String itemId=ItemIDText.getText();
             ItemModel item=itemController.searchItem(itemId);
             if(item!=null){
               itemDataLabel.setText(item.getDescription()+", "+item.getUnitPrice()+", "+item.getQoh());
             }else{
              JOptionPane.showMessageDialog(this, "Item Not Found");
             }
         } catch (SQLException ex) {
             Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(this, ex.getMessage());
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public void loadTable() {
        String[] columns = {"Item Code", "Qty", "Discount"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        ItemTable.setModel(dtm);
    }

    private void addToTable() {
        
        OrderDetailModel odm = new OrderDetailModel("", ItemIDText.getText(), Integer.parseInt(qtyText.getText()), Double.parseDouble(discountText.getText()));
        orderDetailModels.add(odm);
        
        Object[] rowData = {odm.getItemCode(), odm.getQty(), odm.getDiscount()};
        
        DefaultTableModel dtm = (DefaultTableModel) ItemTable.getModel();
        dtm.addRow(rowData);
        
        clearItem();
    }
    
    public void clearItem(){
        ItemIDText.setText("");
        qtyText.setText("");
        discountText.setText("");
        itemDataLabel.setText("");
    }

    private void placeOrder() throws SQLException {
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            OrderModel model = new OrderModel(orderIDText.getText(), sdf.format(new Date()), CustomerIDText.getText());
            String resp = orderController.placeOrder(model, orderDetailModels);
            JOptionPane.showMessageDialog(this, resp);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

}