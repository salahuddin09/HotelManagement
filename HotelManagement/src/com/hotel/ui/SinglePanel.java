package com.hotel.ui;

import com.hotel.bl.RentEntryManager;
import com.hotel.bl.ReservelineEntryManager;
import com.hotel.bl.SingleEntryManager;
import com.hotel.bl.TotalBill;
import com.hotel.model.Rent;
import com.hotel.model.Reserveline;
import com.hotel.model.Single;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SinglePanel extends javax.swing.JPanel {
        double roomrent;
        double vat;
        double discount;
  
    public SinglePanel() {
        initComponents();
       // setBorder(new LineBorder(new java.awt.Color(100, 50, 150), 5, true));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblSingleName = new javax.swing.JLabel();
        lblSingleFName = new javax.swing.JLabel();
        lblSingleAdd = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSingleId = new javax.swing.JTextField();
        txtSingleSub = new javax.swing.JTextField();
        txtsingleAdd = new javax.swing.JTextField();
        txtSingleFName = new javax.swing.JTextField();
        txtSingleName = new javax.swing.JTextField();
        lblSingleSub = new javax.swing.JLabel();
        txtSingleRoomNo = new javax.swing.JTextField();
        lblSingleRoomNo = new javax.swing.JLabel();
        txtSinglePhn = new javax.swing.JTextField();
        lblPhn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        lblSingleAge = new javax.swing.JLabel();
        txtSingleAge = new javax.swing.JTextField();
        lblsingleChkIn = new javax.swing.JLabel();
        txtSingleChkIn = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        lblSingleChkOt = new javax.swing.JLabel();
        txtSingleChkOt = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblSingleAge1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSingleSave = new javax.swing.JButton();
        btnSingleClear = new javax.swing.JButton();
        btnSingleUpdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblSingleRoomRent = new javax.swing.JLabel();
        txtSingleRoomRent = new javax.swing.JTextField();
        lblSingleVat = new javax.swing.JLabel();
        txtSingleVat = new javax.swing.JTextField();
        lblSingleDiscount = new javax.swing.JLabel();
        txtSingleDiscount = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblSingleTotal = new javax.swing.JLabel();
        txtSingleTotal = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Single Entry Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSingleName.setText(" Name");

        lblSingleFName.setText("Father's Name");

        lblSingleAdd.setText("Address");

        jLabel2.setText("ID");

        lblSingleSub.setText("Subject");

        lblSingleRoomNo.setText("Room No");

        lblPhn.setText("Phone");

        jLabel7.setText("Age");

        lblSingleAge.setText("Age");

        lblsingleChkIn.setText("Check In");

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        lblSingleChkOt.setText("Check Out");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        lblSingleAge1.setText("Select Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(lblSingleName)
                    .addComponent(lblSingleFName)
                    .addComponent(lblSingleAdd)
                    .addComponent(lblPhn)
                    .addComponent(lblSingleRoomNo)
                    .addComponent(lblSingleSub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSingleSub)
                    .addComponent(txtSinglePhn)
                    .addComponent(txtsingleAdd)
                    .addComponent(txtSingleFName)
                    .addComponent(txtSingleName)
                    .addComponent(txtSingleId, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(txtSingleRoomNo))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblSingleChkOt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSingleChkOt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSingleAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblsingleChkIn)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                        .addComponent(txtSingleChkIn)
                                        .addComponent(txtSingleAge))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSingleAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSingleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jButton6)
                        .addComponent(lblSingleAge1))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSingleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSingleName)
                    .addComponent(lblSingleAge)
                    .addComponent(txtSingleAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSingleFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSingleFName)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsingleAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSingleAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSinglePhn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhn)
                    .addComponent(lblsingleChkIn)
                    .addComponent(txtSingleChkIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSingleSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSingleSub)
                    .addComponent(lblSingleChkOt)
                    .addComponent(txtSingleChkOt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSingleRoomNo)
                    .addComponent(txtSingleRoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSingleSave.setText("SAVE");
        btnSingleSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingleSaveActionPerformed(evt);
            }
        });

        btnSingleClear.setText("CLEAR");
        btnSingleClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingleClearActionPerformed(evt);
            }
        });

        btnSingleUpdate.setText("UPDATE");
        btnSingleUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingleUpdateActionPerformed(evt);
            }
        });

        lblSingleRoomRent.setText("Room Rent");

        lblSingleVat.setText("Vat");

        lblSingleDiscount.setText("Discount");

        lblSingleTotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSingleTotal.setText("Total");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSingleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSingleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSingleTotal)
                    .addComponent(txtSingleTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSingleDiscount)
                    .addComponent(lblSingleRoomRent)
                    .addComponent(lblSingleVat))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSingleDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(txtSingleVat)
                    .addComponent(txtSingleRoomRent))
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSingleRoomRent)
                            .addComponent(txtSingleRoomRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSingleVat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSingleVat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSingleDiscount)
                            .addComponent(txtSingleDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnSingleSave)
                .addGap(94, 94, 94)
                .addComponent(btnSingleClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSingleUpdate)
                .addGap(76, 76, 76))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSingleSave)
                    .addComponent(btnSingleClear)
                    .addComponent(btnSingleUpdate))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed
    
    private void btnSingleSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingleSaveActionPerformed
        try {
            try {
               
               Single sl = new Single();
               sl.setsingle_Address(txtsingleAdd.getText());
               sl.setsingle_Age(txtSingleAge.getText());
               sl.setsingle_Name(txtSingleName.getText());
               sl.setSingle_Father_Name(txtSingleFName.getText());
               sl.setsingle_Phone(txtSinglePhn.getText());
               SingleEntryManager singleManager = new SingleEntryManager();
               singleManager.insertNewSingle(sl);
               Reserveline reserveLine = new Reserveline();
               jDateChooser1.setDateFormatString("dd-MM-yyyy");
               Date ob=jDateChooser1.getDate();
               String dateString = String.format("%1$td-%1$tm-%1$tY", ob);
               reserveLine.setCheckIn(txtSingleChkIn.getText());
               reserveLine.setCheckOut(txtSingleChkOt.getText());
               reserveLine.setReserveDate(dateString);
               ReservelineEntryManager rlem = new ReservelineEntryManager();
               rlem.insertNewSingleReserveLine(reserveLine);
            }  catch (ClassNotFoundException ex) {
               
            } catch (InstantiationException ex) {
               
            } catch (IllegalAccessException ex) {
               
            } catch (SQLException ex) {
               
            }
            TotalBill tbl = new TotalBill();
            if(txtSingleRoomRent.getText().isEmpty()){
              txtSingleRoomRent.setText("0");
              roomrent = Double.valueOf(txtSingleRoomRent.getText());
            }
            if(txtSingleVat.getText().isEmpty()){
             txtSingleVat.setText("0");
             vat = Double.valueOf(txtSingleVat.getText());
            }
            if(txtSingleDiscount.getText().isEmpty()){
                txtSingleDiscount.setText("0");
                discount = Double.valueOf(txtSingleDiscount.getText());
            }
            roomrent = Double.valueOf(txtSingleRoomRent.getText());
            vat = Double.valueOf(txtSingleVat.getText());
            discount = Double.valueOf(txtSingleDiscount.getText());
            String total =String.valueOf(tbl.CalculateTotal(roomrent, vat, discount));
            txtSingleTotal.setText(total);
            Rent rent = new Rent();
            rent.setRoom_No(txtSingleRoomNo.getText());
            rent.setRoom_Rent(roomrent);
            rent.setSubject(txtSingleSub.getText());
            rent.setVat(vat);
            rent.setDiscount(discount);
            rent.setTotal(Double.valueOf(total));
 System.out.println("SingleRoomNo=="+txtSingleRoomNo.getText()+"SingleSub=="+txtSingleSub.getText()+"Total=="+Double.valueOf(total)+"vatty=="+vat);
            RentEntryManager rentEntry = new RentEntryManager();
             System.out.println("Room Rent=="+roomrent+"Vat=="+vat+"Discount=="+discount+"Total=="+total);
            rentEntry.insertNewRent(rent);
            
        } catch (ClassNotFoundException ex) {
           
        } catch (InstantiationException ex) {
           
        } catch (IllegalAccessException ex) {
          
        } catch (SQLException ex) {
          
        }
        txtsingleAdd.setText(null);
        txtSingleAge.setText(null);
        txtSingleName.setText(null);
        txtSingleFName.setText(null);
        txtSinglePhn.setText(null);
        txtSingleSub.setText(null);
        txtSingleRoomNo.setText(null);
        txtSingleChkIn.setText(null);
        txtSingleChkOt.setText(null);
        txtSingleRoomRent.setText(null);
        txtSingleVat.setText(null);
        txtSingleDiscount.setText(null);  
        //txtSingleTotal.setText(null);
    }//GEN-LAST:event_btnSingleSaveActionPerformed

private void btnSingleClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingleClearActionPerformed
// TODO add your handling code here:
    
    //txtSingleRoomRent.setText(null);
   //txtSingleVat.setText(null);
    //txtSingleDiscount.setText(null);  
    txtSingleTotal.setText(null);
}//GEN-LAST:event_btnSingleClearActionPerformed

    private void btnSingleUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingleUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSingleUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSingleClear;
    private javax.swing.JButton btnSingleSave;
    private javax.swing.JButton btnSingleUpdate;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblPhn;
    private javax.swing.JLabel lblSingleAdd;
    private javax.swing.JLabel lblSingleAge;
    private javax.swing.JLabel lblSingleAge1;
    private javax.swing.JLabel lblSingleChkOt;
    private javax.swing.JLabel lblSingleDiscount;
    private javax.swing.JLabel lblSingleFName;
    private javax.swing.JLabel lblSingleName;
    private javax.swing.JLabel lblSingleRoomNo;
    private javax.swing.JLabel lblSingleRoomRent;
    private javax.swing.JLabel lblSingleSub;
    private javax.swing.JLabel lblSingleTotal;
    private javax.swing.JLabel lblSingleVat;
    private javax.swing.JLabel lblsingleChkIn;
    private javax.swing.JTextField txtSingleAge;
    private javax.swing.JTextField txtSingleChkIn;
    private javax.swing.JTextField txtSingleChkOt;
    private javax.swing.JTextField txtSingleDiscount;
    private javax.swing.JTextField txtSingleFName;
    private javax.swing.JTextField txtSingleId;
    private javax.swing.JTextField txtSingleName;
    private javax.swing.JTextField txtSinglePhn;
    private javax.swing.JTextField txtSingleRoomNo;
    private javax.swing.JTextField txtSingleRoomRent;
    private javax.swing.JTextField txtSingleSub;
    private javax.swing.JTextField txtSingleTotal;
    private javax.swing.JTextField txtSingleVat;
    private javax.swing.JTextField txtsingleAdd;
    // End of variables declaration//GEN-END:variables
}
