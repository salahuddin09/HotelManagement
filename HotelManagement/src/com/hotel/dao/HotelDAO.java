package com.hotel.dao;

import com.hotel.bl.DailyAcNameList;
import com.hotel.bl.DailyAcRoomList;
import com.hotel.bl.MonthlyAcList;
import com.hotel.bl.YearlyAcList;
import com.hotel.model.Child;
import com.hotel.model.Couple;
import com.hotel.model.Daily;
import com.hotel.model.Family;
import com.hotel.model.Group;
import com.hotel.model.Member;
import com.hotel.model.Monthly;
import com.hotel.model.Rent;
import com.hotel.model.Reserveline;
import com.hotel.model.Single;
import com.hotel.model.Weekly;
import com.hotel.model.Yearly;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HotelDAO extends HotelDBConnection {

    String insertChild = "INSERT INTO child(child_name,child_age,family_id) VALUES(?,?,?)";
    String insertFamily = "INSERT INTO family(father_name,father_age,mother_name,mother_age,family_address,family_phone) VALUES(?,?,?,?,?,?)";
    String insertMember = "INSERT INTO member(member_name,member_age,member_address,group_id) VALUES(?,?,?,?)";
    String insertGroup = "INSERT INTO group(group_contact_no,group_member_name,no_of_member,group_address) Values(?,?,?,?)";//
    String insertSingle = "INSERT INTO single(single_name,single_father_name,single_age,single_address,single_phone) Values(?,?,?,?,?)";//
    String insertCouple = "INSERT INTO couple(husband_name,husband_age,wife_name,wife_age,couple_address,couple_phone) Values(?,?,?,?,?,?)";//
    String insertRent = "INSERT INTO rent(room_no,room_rent,subject,vat,discount,total,reserveline_id) Values(?,?,?,?,?,?,(SELECT MAX(reserveline_id) as reserveline_id FROM reserveline))";
    String insertSingleReserveline = "INSERT INTO reserveline(single_id,check_in,check_out,reserve_date)VALUES((SELECT MAX(single_id) as single_id FROM single),?,?,?);";
    String insertCoupleReserveline = "INSERT INTO reserveline(couple_id,check_in,check_out,reserve_date)VALUES((SELECT MAX(couple_id) as couple_id FROM couple),?,?,?);";
    String dailyNameAcString = "SELECT s.single_name  AS reservename FROM single s,reserveline r "
            + "WHERE s.single_id=r.single_id AND r.reserve_date=? "
            + "UNION SELECT c.husband_name AS reservename "
            + "FROM couple c,reserveline r "
            + "WHERE c.couple_id=r.couple_id AND r.reserve_date=?;";//okkkkkkkk with single and couple
    // String dailySingleAcString = "SELECT s.single_name  FROM single s,reserveline r WHERE r.reserve_date=? AND  s.single_id=r.single_id;";
    String dailyAcString = "SELECT rent.room_no AS room_no ,rent.total AS total FROM rent "
            + "INNER JOIN reserveline ON rent.reserveline_id=reserveline.reserveline_id "
            + "WHERE reserveline.reserve_date = ? ; ";
    String insertDaily = "INSERT INTO daily(daily_total,daily_withdraw,daily_net_income,daily_date) VALUES(?,?,?,?)";
    String selectWeeklyIncome = "SELECT SUM(daily_net_income) AS weekly_net_income FROM daily WHERE daily_date BETWEEN ? AND ? ;";
    String insertWeekly = "INSERT INTO weekly(from_date,to_date,weekly_net_income) VALUES(?,?,?)";
    /**************************************/
    //   SELECT weekly_net_income FROM weekly WHERE from_date LIKE '%02-2014%'
    String totalMonthlyIncome = "SELECT SUM(weekly_net_income) AS monthly_net_income FROM weekly WHERE from_date LIKE ? ;";//month,year
    String showMonthlyIncome = "SELECT from_date,to_date,weekly_net_income FROM weekly WHERE from_date LIKE ? ;";//month,year
    String insertMonthly = "INSERT INTO monthly(select_month,select_year,monthly_net_income) VALUES(?,?,?)";
    
    
    //SELECT SUM(monthly_net_income) AS yearly_net_income FROM monthly WHERE select_year LIKE '%2014%' ;
    String totalYearlyIncome = "SELECT SUM(monthly_net_income) AS yearly_net_income FROM monthly WHERE select_year LIKE ? ;";//month,year
    String showYearlyIncome = "SELECT select_month,monthly_net_income FROM monthly WHERE select_year LIKE ? ;";//month,year
    String insertYearly = "INSERT INTO yearly(select_year,yearly_net_income) VALUES(?,?)";

    public HotelDAO() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        super();
    }
    
     protected List<YearlyAcList> showYearlyNetIncome(Yearly yearly) throws SQLException {

         List<YearlyAcList> showYearList = new ArrayList<YearlyAcList>();
        try {

            PreparedStatement st = getConnection().prepareStatement(showYearlyIncome);

            st.setString(1, yearly.getSelect_year());

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                YearlyAcList yearList = new YearlyAcList();
              
                yearList.setSelect_month(rs.getString("select_month"));
                yearList.setMonthly_net_income(rs.getDouble("monthly_net_income"));
                System.out.println("test monthly income......." + yearList.getMonthly_net_income());
                showYearList.add(yearList);
            }
        } catch (Exception excp) {
            excp.printStackTrace();
            System.out.println("Sorry Exception occured......");
        } finally {
            return showYearList;
        }
    }
    
    protected Yearly totalYearlyNetIncome(Yearly yearly) throws SQLException {

        try {

            PreparedStatement st = getConnection().prepareStatement(totalYearlyIncome);

            st.setString(1, yearly.getSelect_year());

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                yearly.setYearly_net_income(rs.getDouble("yearly_net_income"));
                System.out.println("test monthly income......." + yearly.getYearly_net_income());
            }
        } catch (Exception excp) {
            excp.printStackTrace();
            System.out.println("Sorry Exception occured......");
        } finally {
            return yearly;
        }
    }

     protected boolean insertYearly(Yearly yearly) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        boolean status = false;
        try {

            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertYearly);

            st.setString(1, yearly.getSelect_year());
            st.setDouble(2, yearly.getYearly_net_income());
            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }
     
    protected boolean insertMonthly(Monthly monthly) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        boolean status = false;
        try {

            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertMonthly);

            st.setString(1, monthly.getSelect_month());
            st.setString(2, monthly.getSelect_year());
            st.setDouble(3, monthly.getMonthly_net_income());
            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected List<MonthlyAcList> showMonthlyNetIncome(Monthly monthly) throws SQLException {

         List<MonthlyAcList> showMonthList = new ArrayList<MonthlyAcList>();
        try {

            PreparedStatement st = getConnection().prepareStatement(showMonthlyIncome);

            st.setString(1, monthly.getSelect_monthyear());

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                MonthlyAcList monthList = new MonthlyAcList();
                monthList.setFrom_date(rs.getString("from_date"));
                monthList.setTo_date(rs.getString("to_date"));
                monthList.setMonthly_net_income(rs.getDouble("weekly_net_income"));
                System.out.println("test monthly income......." + monthList.getMonthly_net_income());
                showMonthList.add(monthList);
            }
        } catch (Exception excp) {
            excp.printStackTrace();
            System.out.println("Sorry Exception occured......");
        } finally {
            return showMonthList;
        }
    }

    protected Monthly totalMonthlyNetIncome(Monthly monthly) throws SQLException {

        try {

            PreparedStatement st = getConnection().prepareStatement(totalMonthlyIncome);

            st.setString(1, monthly.getSelect_monthyear());

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                monthly.setMonthly_net_income(rs.getDouble("monthly_net_income"));
                System.out.println("test monthly income......." + monthly.getMonthly_net_income());
            }
        } catch (Exception excp) {
            excp.printStackTrace();
            System.out.println("Sorry Exception occured......");
        } finally {
            return monthly;
        }
    }

    protected boolean insertWeekly(Weekly weekly) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        boolean status = false;
        try {

            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertWeekly);

            st.setString(1, weekly.getFrom_date());
            st.setString(2, weekly.getTo_date());
            st.setDouble(3, weekly.getWeekly_net_income());
            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected Weekly showWeeklyNetIncome(Weekly weekly) throws SQLException {

        try {

            PreparedStatement st = getConnection().prepareStatement(selectWeeklyIncome);

            st.setString(1, weekly.getFrom_date());
            st.setString(2, weekly.getTo_date());
            //  st.setString(1, "16-02-2014");
            // st.setString(2, "20-02-2014");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                weekly.setWeekly_net_income(rs.getDouble("weekly_net_income"));
                System.out.println("test weekly income......." + weekly.getWeekly_net_income());
            }
        } catch (Exception excp) {
            excp.printStackTrace();
            System.out.println("Sorry Exception occured......");
        } finally {
            return weekly;
        }
    }

    protected boolean insertDaily(Daily daily) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        boolean status = false;
        try {

            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertDaily);

            st.setDouble(1, daily.getDaily_total());
            st.setDouble(2, daily.getDaily_withdraw());
            st.setDouble(3, daily.getDaily_net_income());
            st.setString(4, daily.getDaily_date());
            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected List<DailyAcRoomList> showListOfRoomDailies(DailyAcRoomList reserveDateList) throws SQLException {
        List<DailyAcRoomList> daily = new ArrayList<DailyAcRoomList>();
        try {

            PreparedStatement st = getConnection().prepareStatement(dailyAcString);

            st.setString(1, reserveDateList.getReserveDate02());

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                DailyAcRoomList roomList = new DailyAcRoomList();
                roomList.setRoomNo(rs.getString("room_no"));
                roomList.setTotal(rs.getDouble("total"));
                daily.add(roomList);
            }
        } catch (Exception excp) {
            excp.printStackTrace();
            System.out.println("Sorry Exception occured......");
        } finally {
            return daily;
        }
    }

    protected List<DailyAcNameList> showListOfNameDailies(DailyAcNameList reserveDateList) throws SQLException {
        List<DailyAcNameList> daily = new ArrayList<DailyAcNameList>();
        try {

            PreparedStatement st = getConnection().prepareStatement(dailyNameAcString);
            // long ts1 =reserveDateList.getReservedate01().getTime();
            //  st.setInt(1,reserveDateList.getSingleid());
            //  st.setTimestamp(1,new Timestamp(ts1) );
            st.setString(1, reserveDateList.getReservedate01());
            // long ts2 =reserveDateList.getReserveDate02().getTime();
            // st.setTimestamp(2,new Timestamp(ts2));
            st.setString(2, reserveDateList.getReserveDate02());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                DailyAcNameList nameList = new DailyAcNameList();
                nameList.setSingleReserveName(rs.getString("reservename"));
                nameList.setCoupleReserveName(rs.getString("reservename"));
                daily.add(nameList);
            }
        } catch (Exception excp) {
            excp.printStackTrace();
            System.out.println("Sorry Exception occured......");
        } finally {
            return daily;
        }
    }

    protected boolean insertChild(Child child) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        boolean status = false;
        try {

            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertChild);

            st.setString(1, child.getChild_Name());
            st.setString(2, child.getChild_Age());
            st.setInt(3, child.getFamily_ID());
            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected boolean insertFamily(Family family) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        boolean status = false;
        try {

            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertFamily);

            st.setString(1, family.getFather_Name());
            st.setString(2, family.getFather_Age());
            st.setString(3, family.getMother_Name());
            st.setString(4, family.getMother_Age());
            st.setString(5, family.getFamily_Address());
            st.setString(6, family.getFamily_Phone());
            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected boolean insertMember(Member member) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        boolean status = false;
        try {

            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertMember);

            st.setString(1, member.getMember_Name());
            st.setString(2, member.getMember_Age());
            st.setString(3, member.getMember_Address());
            st.setInt(4, member.getGroup_ID());

            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected boolean insertGroup(Group group) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        boolean status = false;
        try {

            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertGroup);

            st.setString(1, group.getGroup_Contact_No());
            st.setString(2, group.getGroup_Member_Name());
            st.setString(3, group.getNo_Of_Member());
            st.setString(4, group.getGroup_Address());


            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected boolean insertSingle(Single single) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        boolean status = false;
        try {

            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertSingle);

            st.setString(1, single.getsingle_Name());
            st.setString(2, single.getSingle_Father_Name());
            st.setString(3, single.getsingle_Age());
            st.setString(4, single.getsingle_Address());
            st.setString(5, single.getsingle_Phone());


            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected boolean insertSingleReserveline(Reserveline reserveline) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        boolean status = false;
        try {
            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertSingleReserveline);


            //  long ts3 = reserveline.getReserveDate().getTime();

            st.setString(1, reserveline.getCheckIn());
            st.setString(2, reserveline.getCheckOut());
            //  System.out.println("checking test in method....."+ts3);
            st.setString(3, reserveline.getReserveDate());

            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected boolean insertCouple(Couple couple) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        boolean status = false;
        try {

            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertCouple);

            st.setString(1, couple.getHusband_Name());
            st.setString(2, couple.getHusband_Age());
            st.setString(3, couple.getWife_Name());
            st.setString(4, couple.getWife_Age());
            st.setString(5, couple.getCouple_Address());
            st.setString(6, couple.getCouple_Phone());


            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected boolean insertCoupleReserveline(Reserveline reserveline) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        boolean status = false;
        try {
            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertCoupleReserveline);


            //  long ts3 = reserveline.getReserveDate().getTime();

            st.setString(1, reserveline.getCheckIn());
            st.setString(2, reserveline.getCheckOut());
            //  System.out.println("checking test in method....."+ts3);
            st.setString(3, reserveline.getReserveDate());

            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected boolean insertRent(Rent rent) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        boolean status = false;
        try {

            getConnection().setAutoCommit(false);
            PreparedStatement st = getConnection().prepareStatement(insertRent);

            st.setString(1, rent.getRoom_No());
            st.setDouble(2, rent.getRoom_Rent());
            st.setString(3, rent.getSubject());
            st.setDouble(4, rent.getVat());
            st.setDouble(5, rent.getDiscount());
            st.setDouble(6, rent.getTotal());

            System.out.println("I am in insertrent, successfully executed...." + rent.getTotal());

            status = (st.executeUpdate() >= 1) ? true : false;
            getConnection().commit();
        } catch (SQLException excp) {
            getConnection().rollback();
        } finally {
            getConnection().close();
        }
        return status;
    }

    protected void dropDBConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        getConnection().close();
    }
}
