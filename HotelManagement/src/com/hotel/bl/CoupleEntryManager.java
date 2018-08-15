/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

import com.hotel.dao.HotelDAO;
import com.hotel.model.Couple;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class CoupleEntryManager extends HotelDAO{
    
    public  CoupleEntryManager() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
    }
     public boolean insertNewCouple(Couple couple) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.insertCouple(couple);
    }
}
