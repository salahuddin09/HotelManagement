/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.testing;

import com.hotel.bl.DailyAcNameList;
import com.hotel.dao.HotelDAO;
import com.hotel.model.Child;
import com.hotel.model.Family;
import com.hotel.model.Member;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Personal
 */
public class DAOTest extends HotelDAO{
    
    public DAOTest() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        super();
    }
    public static void main(String []args){
        
        DAOTest test;
        try {
            test = new DAOTest();
          //   Child child = new Child();
            // child.setChild_Name("sayan");
           //  child.setChild_Age("5");
           //  child.setFamily_ID(2);
           // boolean status = test.insertChild(child);
             
        //     Family family = new Family();
             
         //    family.setFather_Name("faruk");
         //    family.setFather_Age("38");
         //    family.setMother_Name("Kona");
          //   family.setMother_Age("28");
          //   family.setFamily_Address("raozan");
          //   boolean status = test.insertFamily(family);
             
          //   Member member = new Member();
             
           //  member.setMember_Name("tarek");
           //  member.setMember_Age("27");
           //  member.setMember_Address("Badurtola");
            
           //  boolean status = test.insertMember(member);
            
            DailyAcNameList daily = new DailyAcNameList();
            String reservedate01 = "16-02-2014";
            //SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MM-yyyy");
            //Date date01 = null;
            
            String reservedate02 = "20-02-2014";
            //SimpleDateFormat sdf5 = new SimpleDateFormat("dd-MM-yyyy");
            //Date date02 = null;
 
            //try {
                //date01 = sdf4.parse(reservedate01);
                //date02 = sdf5.parse(reservedate02);
                daily.setReserveDate01(reservedate01);
                daily.setReserveDate02(reservedate02);
                
            List<DailyAcNameList> dailyList = test.showListOfNameDailies(daily);
           for(int i=0; i<dailyList.size(); i++){
            DailyAcNameList dailyAcList = dailyList.get(i);
            System.out.println(dailyAcList.getSingleReserveName());
        }
           // } catch (ParseException ex) {
            //    ex.printStackTrace();
            //}
     //  System.out.println(status);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
    }
}
