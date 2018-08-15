/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.model;

/**
 *
 * @author Personal
 */
public class Monthly {
    
    private int monthly_ID;
    private String select_month;
    private String select_year;
    private String select_monthyear;
    private String from_date;
    private String to_date;
    private double monthly_net_income;

    /**
     * @return the monthly_ID
     */
    public int getMonthly_ID() {
        return monthly_ID;
    }

    /**
     * @param monthly_ID the monthly_ID to set
     */
    public void setMonthly_ID(int monthly_ID) {
        this.monthly_ID = monthly_ID;
    }

    /**
     * @return the select_month
     */
    public String getSelect_month() {
        return select_month;
    }

    /**
     * @param select_month the select_month to set
     */
    public void setSelect_month(String select_month) {
        this.select_month = select_month;
    }

    /**
     * @return the select_year
     */
    public String getSelect_year() {
        return select_year;
    }

    /**
     * @param select_year the select_year to set
     */
    public void setSelect_year(String select_year) {
        this.select_year = select_year;
    }

    /**
     * @return the monthly_net_income
     */
    public double getMonthly_net_income() {
        return monthly_net_income;
    }

    /**
     * @param monthly_net_income the monthly_net_income to set
     */
    public void setMonthly_net_income(double monthly_net_income) {
        this.monthly_net_income = monthly_net_income;
    }

    /**
     * @return the select_monthyear
     */
    public String getSelect_monthyear() {
        return select_monthyear;
    }

    /**
     * @param select_monthyear the select_monthyear to set
     */
    public void setSelect_monthyear(String select_monthyear) {
        this.select_monthyear = select_monthyear;
    }

    /**
     * @return the from_date
     */
    public String getFrom_date() {
        return from_date;
    }

    /**
     * @param from_date the from_date to set
     */
    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }

    /**
     * @return the to_date
     */
    public String getTo_date() {
        return to_date;
    }

    /**
     * @param to_date the to_date to set
     */
    public void setTo_date(String to_date) {
        this.to_date = to_date;
    }
}
