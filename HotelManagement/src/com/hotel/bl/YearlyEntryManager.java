/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

import com.hotel.dao.HotelDAO;
import com.hotel.model.Yearly;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Personal
 */
public class YearlyEntryManager  extends HotelDAO{
    
    public  YearlyEntryManager() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
    }
      public Yearly totalNewYearlyNetIncome(Yearly yearly) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.totalYearlyNetIncome(yearly);
    }
      
     public List<YearlyAcList> showNewYearlyNetIncome(Yearly yearly) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.showYearlyNetIncome(yearly);
    } 
    
      public boolean insertNewYearly(Yearly yearly) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.insertYearly(yearly);
    }
      
}
