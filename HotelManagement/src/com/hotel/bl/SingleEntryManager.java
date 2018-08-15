
package com.hotel.bl;

import com.hotel.dao.HotelDAO;
import com.hotel.model.Single;
import java.sql.SQLException;

public class SingleEntryManager extends HotelDAO{
    
    public SingleEntryManager() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
    }
     public boolean insertNewSingle(Single single) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        return super.insertSingle(single);
    }
}
