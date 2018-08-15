/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

import com.hotel.dao.HotelDAO;
import com.hotel.model.Weekly;
import java.sql.SQLException;

/**
 *
 * @author Personal
 */
public class WeeklyEntryManager extends HotelDAO {
    
        public  WeeklyEntryManager() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
    }
     public Weekly showNewWeeklyNetIncome(Weekly weekly) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.showWeeklyNetIncome(weekly);
    }
     
      public boolean insertNewWeekly(Weekly weekly) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.insertWeekly(weekly);
    }
    
}
