/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

import com.hotel.dao.HotelDAO;
import com.hotel.model.Rent;
import java.sql.SQLException;

/**
 *
 * @author Personal
 */
public class RentEntryManager extends HotelDAO{
    
     public RentEntryManager() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
    }
     public boolean insertNewRent(Rent rent) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.insertRent(rent);
    }
}
