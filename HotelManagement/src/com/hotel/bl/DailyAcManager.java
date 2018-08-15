/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

import com.hotel.dao.HotelDAO;
import com.hotel.model.Daily;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Personal
 */
public class DailyAcManager extends HotelDAO {

    public DailyAcManager() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
    }

    public List<DailyAcNameList> showNewListOfNameDailies(DailyAcNameList reserveDateList) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        return super.showListOfNameDailies(reserveDateList);
    }

    public List<DailyAcRoomList> showNewListOfRoomDailies(DailyAcRoomList reserveDateList) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        return super.showListOfRoomDailies(reserveDateList);
    }

    public boolean insertNewDaily(Daily daily) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        return super.insertDaily(daily);
    }
}
