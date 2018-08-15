/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.testing;

import com.hotel.dao.HotelDBConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Personal
 */
public class DBTest extends HotelDBConnection{
   
    protected DBTest() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
            
        }
    public static void main(String []args){
        try {
            DBTest test = new DBTest();
            test.getConnection();
            System.out.println("Connection successful");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DBTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DBTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
