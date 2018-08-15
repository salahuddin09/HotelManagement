/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

/**
 *
 * @author Personal
 */
public class MonthlyAcList {

    private String from_date;
    private String to_date;
    private double monthly_net_income;

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
}
