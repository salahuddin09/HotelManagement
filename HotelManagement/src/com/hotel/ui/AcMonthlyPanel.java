package com.hotel.ui;

import com.hotel.bl.MonthlyAcList;
import com.hotel.bl.MonthlyEntryManager;
import com.hotel.model.Monthly;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AcMonthlyPanel extends javax.swing.JPanel {

    String selectedMonth = null;
    // String selectYear = null;
    Monthly monthTotal;
    int selectYear;
    MonthlyEntryManager monthlyManager;
    List<MonthlyAcList> showMonthlyList;
    DefaultTableModel model;

    public AcMonthlyPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMonthly = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        monthTabulerData = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        monthChooser = new com.toedter.calendar.JMonthChooser();
        netIncomelbl = new javax.swing.JLabel();
        netIncomelbl1 = new javax.swing.JLabel();
        btnIncome = new javax.swing.JButton();
        yearChooser = new com.toedter.calendar.JYearChooser();
        btnSave = new javax.swing.JButton();
        btlClear = new javax.swing.JButton();

        lblMonthly.setFont(new java.awt.Font("Times New Roman", 0, 24));
        lblMonthly.setText("Monthly Account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(lblMonthly)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMonthly)
                .addContainerGap())
        );

        monthTabulerData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "From_Date", "To_Date", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(monthTabulerData);

        txtTotal.setEditable(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        monthChooser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthChooserMouseClicked(evt);
            }
        });

        netIncomelbl.setFont(new java.awt.Font("Tahoma", 1, 14));
        netIncomelbl.setText("Monthly Net Income :");
        netIncomelbl.setPreferredSize(new java.awt.Dimension(25, 15));

        netIncomelbl1.setFont(new java.awt.Font("Tahoma", 1, 14));
        netIncomelbl1.setText("Select Month From Below :");
        netIncomelbl1.setPreferredSize(new java.awt.Dimension(25, 15));

        btnIncome.setText("Show Income");
        btnIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncomeActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btlClear.setText("Clear");
        btlClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(monthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(yearChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(btnIncome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(netIncomelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(netIncomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(btnSave)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btlClear)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(netIncomelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yearChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(monthChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIncome)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(netIncomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btlClear))
                .addContainerGap(60, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtTotalActionPerformed

private void btnIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncomeActionPerformed


    selectYear = yearChooser.getYear();
    int monthDetector = monthChooser.getMonth();
        
    System.out.println("Month===" + monthDetector);
    if (monthDetector == 0) {
        selectedMonth = "01";//"January";
    } else if (monthDetector == 1) {
        selectedMonth = "02";//"February";
    } else if (monthDetector == 2) {
        selectedMonth = "03";//"March";
    } else if (monthDetector == 3) {
        selectedMonth = "04";//"April";
    } else if (monthDetector == 4) {
        selectedMonth = "05";//"May";
    } else if (monthDetector == 5) {
        selectedMonth = "06";//"June";
    } else if (monthDetector == 6) {
        selectedMonth = "07";//"July";
    } else if (monthDetector == 7) {
        selectedMonth = "08";//"August";
    } else if (monthDetector == 8) {
        selectedMonth = "09";//"September";
    } else if (monthDetector == 9) {
        selectedMonth = "10";//"October";
    } else if (monthDetector == 10) {
        selectedMonth = "11"; //"November";
    } else if (monthDetector == 11) {
        selectedMonth = "12";//"December";
    }
    System.out.println("year detector....." + selectYear);
    System.out.println("Selected Month===" + selectedMonth);

    Monthly monthly = new Monthly();

    monthly.setSelect_month(selectedMonth);
    monthly.setSelect_year(String.valueOf(selectYear));

    monthly.setSelect_monthyear("%" + selectedMonth + "-" + String.valueOf(selectYear) + "%");

    model = (DefaultTableModel) monthTabulerData.getModel();
    try {
        monthlyManager = new MonthlyEntryManager();
        monthTotal = monthlyManager.totalNewMonthlyNetIncome(monthly);

        txtTotal.setText(String.valueOf(monthTotal.getMonthly_net_income()));
        System.out.println("I am here....total===" + monthTotal.getMonthly_net_income());
        showMonthlyList = new ArrayList<MonthlyAcList>();
        showMonthlyList = monthlyManager.showNewMonthlyNetIncome(monthly);
        for (int i = 0; i < showMonthlyList.size(); i++) {

            MonthlyAcList monthlyAcList = showMonthlyList.get(i);
            if (model.findColumn("From_Date") == 0) {

                model.setValueAt(monthlyAcList.getFrom_date(), i, 0);
                // model.removeRow(i);
            }
            if (model.findColumn("To_Date") == 1) {
                //  DailyAcRoomList dailyAcList = dailyRoomList.get(j);
                model.setValueAt(monthlyAcList.getTo_date(), i, 1);
                //  model.removeRow(i);
            }
            if (model.findColumn("Amount") == 2) {
                //  DailyAcRoomList dailyAcList = dailyRoomList.get(j);
                model.setValueAt(monthlyAcList.getMonthly_net_income(), i, 2);
                //    model.removeRow(i);
            }
            monthlyAcList.getFrom_date();
            System.err.println("Testing..........show monthly From date" + monthlyAcList.getFrom_date());
            System.err.println("Testing..........show monthly To date" + monthlyAcList.getTo_date());
            System.err.println("Testing..........show monthly Monthly net income" + monthlyAcList.getMonthly_net_income());
        }
    } catch (ClassNotFoundException ex) {
    } catch (InstantiationException ex) {
    } catch (IllegalAccessException ex) {
    } catch (SQLException ex) {
    }

}//GEN-LAST:event_btnIncomeActionPerformed

private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed


    Monthly insertMonthly = new Monthly();

    insertMonthly.setSelect_month(selectedMonth);
    insertMonthly.setSelect_year(String.valueOf(selectYear));
    insertMonthly.setMonthly_net_income(Double.valueOf(monthTotal.getMonthly_net_income()));
    try {

        monthlyManager.insertNewMonthly(insertMonthly);
        txtTotal.setText(null);
        for (int i = 0; i < showMonthlyList.size() - 1; i++) {
            model.removeRow(i);
            model.removeRow(0);
            model.removeRow(1);
        }
    } catch (SQLException ex) {
    } catch (ClassNotFoundException ex) {
    } catch (InstantiationException ex) {
    } catch (IllegalAccessException ex) {
    }
}//GEN-LAST:event_btnSaveActionPerformed

private void btlClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlClearActionPerformed
// TODO add your handling code here:
    for (int i = 0; i < showMonthlyList.size() - 1; i++) {
        model.removeRow(i);
        model.removeRow(0);
    }
    txtTotal.setText(null);
}//GEN-LAST:event_btlClearActionPerformed

private void monthChooserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthChooserMouseClicked
// TODO add your handling code here:
    //  monthTabulerData.revalidate();
}//GEN-LAST:event_monthChooserMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlClear;
    private javax.swing.JButton btnIncome;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMonthly;
    private com.toedter.calendar.JMonthChooser monthChooser;
    private javax.swing.JTable monthTabulerData;
    private javax.swing.JLabel netIncomelbl;
    private javax.swing.JLabel netIncomelbl1;
    private javax.swing.JTextField txtTotal;
    private com.toedter.calendar.JYearChooser yearChooser;
    // End of variables declaration//GEN-END:variables
}
