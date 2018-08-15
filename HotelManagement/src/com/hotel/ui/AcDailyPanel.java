/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.ui;

import com.hotel.bl.DailyAcNameList;
import com.hotel.bl.DailyAcManager;
import com.hotel.bl.DailyAcRoomList;
import com.hotel.model.Daily;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class AcDailyPanel extends javax.swing.JPanel {
    
    String dateString;
    double dailyGrandTotal = 0.0;
    double dailyWithdraw = 0.0;
    double dailyNetincome = 0.0;
    // public static final String STATUS = "single";

    public AcDailyPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAcDaily = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnDailyRecords = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtWidthdraw = new javax.swing.JTextField();
        txtNetincome = new javax.swing.JTextField();
        btnDailySave = new javax.swing.JButton();
        lblTotal1 = new javax.swing.JLabel();
        lblTotal2 = new javax.swing.JLabel();

        lblAcDaily.setFont(new java.awt.Font("Times New Roman", 0, 24));
        lblAcDaily.setText("      Daily Account ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(lblAcDaily, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAcDaily, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblDate.setText(" Date       :");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        btnDailyRecords.setText("Show Records");
        btnDailyRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyRecordsActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room No.", " Name", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDailyRecords)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDailyRecords))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTotal.setText("Withdraw  :");

        txtWidthdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWidthdrawActionPerformed(evt);
            }
        });

        btnDailySave.setText("Save");
        btnDailySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailySaveActionPerformed(evt);
            }
        });

        lblTotal1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTotal1.setText("Total  :");

        lblTotal2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lblTotal2.setText("Net income  :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnDailySave))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblTotal2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNetincome))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txttotal)
                                .addComponent(txtWidthdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWidthdraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDailySave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNetincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtWidthdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWidthdrawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWidthdrawActionPerformed

private void btnDailyRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailyRecordsActionPerformed
    // TODO add your handling code here:


    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();


    try {

        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        Date ob = jDateChooser1.getDate();
        dateString = String.format("%1$td-%1$tm-%1$tY", ob);

        DailyAcNameList dailyDateList = new DailyAcNameList();
        dailyDateList.setReserveDate01(dateString);
        dailyDateList.setReserveDate02(dateString);

        DailyAcManager dailyAcManager = new DailyAcManager();

        List<DailyAcNameList> dailyNameList = new ArrayList<DailyAcNameList>();

        dailyNameList = dailyAcManager.showNewListOfNameDailies(dailyDateList);

        for (int i = 0; i < dailyNameList.size(); i++) {

            if (model.findColumn("Name") == -1) {
                DailyAcNameList dailyAcList = dailyNameList.get(i);
                model.setValueAt(dailyAcList.getSingleReserveName(), i, 1);
                //   model.fireTableDataChanged();
                //  model.fireTableRowsInserted(i, 1);
            }
            /*
            if(dailyAcList.getStatus()=="single"){
            }
             * 
             */

        }

        DailyAcRoomList dailyDateList01 = new DailyAcRoomList();
        List<DailyAcRoomList> dailyRoomList = new ArrayList<DailyAcRoomList>();

        dailyDateList01.setReserveDate02(dateString);
        dailyRoomList = dailyAcManager.showNewListOfRoomDailies(dailyDateList01);
        for (int j = 0; j < dailyRoomList.size(); j++) {

            if (model.findColumn("Room No.") == 0) {
                DailyAcRoomList dailyAcList = dailyRoomList.get(j);
                model.setValueAt(dailyAcList.getRoomNo(), j, 0);

            }
            if (model.findColumn("Amount") == 2) {
                DailyAcRoomList dailyAcList = dailyRoomList.get(j);
                model.setValueAt(dailyAcList.getTotal(), j, 2);

                dailyGrandTotal += dailyAcList.getTotal();

            }

        }
        System.out.println("Grand Total===" + dailyGrandTotal);
        txttotal.setText(String.valueOf(dailyGrandTotal));

    } catch (ClassNotFoundException ex) {
    } catch (InstantiationException ex) {
    } catch (IllegalAccessException ex) {
    } catch (SQLException ex) {
    }


}//GEN-LAST:event_btnDailyRecordsActionPerformed

private void btnDailySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailySaveActionPerformed
        try {
            // TODO add your handling code here:
            dailyWithdraw = Double.valueOf(txtWidthdraw.getText());
            dailyNetincome = Double.valueOf(dailyGrandTotal) - dailyWithdraw;
            txtNetincome.setText(String.valueOf(dailyNetincome));
            Daily daily = new Daily();
                
            daily.setDaily_total(Double.valueOf(dailyGrandTotal));
            daily.setDaily_withdraw(Double.valueOf(dailyWithdraw));
            daily.setDaily_net_income(Double.valueOf(dailyNetincome));
            daily.setDaily_date(dateString);
            DailyAcManager dailyManager =  new DailyAcManager();
            dailyManager.insertNewDaily(daily);
        } catch (ClassNotFoundException ex) {
           System.out.println("ClassNotFoundException");
        } catch (InstantiationException ex) {
         System.out.println("InstantiationException");
        } catch (IllegalAccessException ex) {
          System.out.println("IllegalAccessException");
        } catch (SQLException ex) {
           System.out.println("SQLException");
        }
    
    
}//GEN-LAST:event_btnDailySaveActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDailyRecords;
    private javax.swing.JButton btnDailySave;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAcDaily;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotal2;
    private javax.swing.JTextField txtNetincome;
    private javax.swing.JTextField txtWidthdraw;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
