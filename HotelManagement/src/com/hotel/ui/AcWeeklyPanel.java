package com.hotel.ui;

import com.hotel.bl.WeeklyEntryManager;
import com.hotel.model.Weekly;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AcWeeklyPanel extends javax.swing.JPanel {

    String firstDayString, secondDayString;
    Weekly weekTotal;
    WeeklyEntryManager weeklyManager;

    public AcWeeklyPanel() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblWeekly = new javax.swing.JLabel();
        firstDay = new com.toedter.calendar.JDateChooser();
        secondDay = new com.toedter.calendar.JDateChooser();
        chooseDayslbl = new javax.swing.JLabel();
        netIncomelbl = new javax.swing.JLabel();
        tolbl = new javax.swing.JLabel();
        txtincome = new javax.swing.JTextField();
        btnIncome = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();

        lblWeekly.setFont(new java.awt.Font("Times New Roman", 0, 24));
        lblWeekly.setText("Weekly Account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(lblWeekly)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWeekly)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        firstDay.setDateFormatString("yyyy-MM-dd");

        secondDay.setDateFormatString("yyyy-MM-dd");

        chooseDayslbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        chooseDayslbl.setText("Choose Days From Below:");
        chooseDayslbl.setPreferredSize(new java.awt.Dimension(25, 15));

        netIncomelbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        netIncomelbl.setText("Net Income :");
        netIncomelbl.setPreferredSize(new java.awt.Dimension(25, 15));

        tolbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        tolbl.setText("To");
        tolbl.setPreferredSize(new java.awt.Dimension(25, 15));

        txtincome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtincomeActionPerformed(evt);
            }
        });

        btnIncome.setText("Show Income");
        btnIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncomeActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(chooseDayslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(netIncomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstDay, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tolbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(secondDay, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtincome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(btnIncome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(savebtn)
                        .addGap(36, 36, 36)
                        .addComponent(btnClear)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(chooseDayslbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(firstDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(secondDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tolbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(btnIncome)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netIncomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn)
                    .addComponent(btnClear))
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void btnIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncomeActionPerformed


    firstDay.setDateFormatString("dd-MM-yyyy");
    Date ob1 = firstDay.getDate();
    firstDayString = String.format("%1$td-%1$tm-%1$tY", ob1);
    secondDay.setDateFormatString("dd-MM-yyyy");
    Date ob2 = secondDay.getDate();
    secondDayString = String.format("%1$td-%1$tm-%1$tY", ob2);
    System.out.println("This is first date" + firstDayString);
    System.out.println("This is second date" + secondDayString);
    Weekly weekly = new Weekly();
    weekly.setFrom_date(firstDayString);
    weekly.setTo_date(secondDayString);
    try {
        weeklyManager = new WeeklyEntryManager();
        weekTotal = weeklyManager.showNewWeeklyNetIncome(weekly);
        txtincome.setText(String.valueOf(weekTotal.getWeekly_net_income()));
        System.out.println("I am here....total===" + weekTotal.getWeekly_net_income());


    } catch (ClassNotFoundException ex) {
    } catch (InstantiationException ex) {
    } catch (IllegalAccessException ex) {
    } catch (SQLException ex) {
    }


}//GEN-LAST:event_btnIncomeActionPerformed

private void txtincomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtincomeActionPerformed
}//GEN-LAST:event_txtincomeActionPerformed

private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
// TODO add your handling code here:
    txtincome.setText(null);
}//GEN-LAST:event_btnClearActionPerformed

private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
// TODO add your handling code here:
    Weekly insertWeekly = new Weekly();

    insertWeekly.setFrom_date(String.valueOf(firstDayString));
    insertWeekly.setTo_date(String.valueOf(secondDayString));
    insertWeekly.setWeekly_net_income(Double.valueOf(weekTotal.getWeekly_net_income()));
    try {
      
        weeklyManager.insertNewWeekly(insertWeekly);
        txtincome.setText(null);
    } catch (SQLException ex) {
       
    } catch (ClassNotFoundException ex) {
       
    } catch (InstantiationException ex) {
       
    } catch (IllegalAccessException ex) {
        
    }

}//GEN-LAST:event_savebtnActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnIncome;
    private javax.swing.JLabel chooseDayslbl;
    private com.toedter.calendar.JDateChooser firstDay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblWeekly;
    private javax.swing.JLabel netIncomelbl;
    private javax.swing.JButton savebtn;
    private com.toedter.calendar.JDateChooser secondDay;
    private javax.swing.JLabel tolbl;
    private javax.swing.JTextField txtincome;
    // End of variables declaration//GEN-END:variables
}
