/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

import com.hotel.dao.HotelDAO;
import com.hotel.model.Reserveline;
import java.sql.SQLException;

/**
 *
 * @author Personal
 */
public class ReservelineEntryManager extends HotelDAO{
    
     public ReservelineEntryManager() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
    }
     public boolean insertNewSingleReserveLine(Reserveline reserveLine) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.insertSingleReserveline(reserveLine);
    }
     public boolean insertNewCoupleReserveLine(Reserveline reserveLine) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.insertCoupleReserveline(reserveLine);
    } 
}
