/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

import com.hotel.dao.HotelDAO;
import com.hotel.model.Family;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class FamilyEntryManager extends HotelDAO{
    public FamilyEntryManager() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
    }
     public boolean insertNewFamily(Family family) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.insertFamily(family);
    }
    
}
