/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

import com.hotel.dao.HotelDAO;
import com.hotel.model.Monthly;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Personal
 */
public class MonthlyEntryManager extends HotelDAO{
    
    
    public  MonthlyEntryManager() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
    }
     public List<MonthlyAcList> showNewMonthlyNetIncome(Monthly monthly) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.showMonthlyNetIncome(monthly);
    }
    
     public Monthly totalNewMonthlyNetIncome(Monthly monthly) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.totalMonthlyNetIncome(monthly);
    }
     
      public boolean insertNewMonthly(Monthly monthly) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.insertMonthly(monthly);
    }
}
