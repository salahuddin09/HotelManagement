/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.model;

public class Daily {
        
    private int daily_ID;
    private double daily_total;
    private double daily_withdraw;
    private double daily_net_income;
    private String daily_date;
    /**
     * @return the daily_ID
     */
    
    public int getDaily_ID() {
        return daily_ID;
    }

    /**
     * @param daily_ID the daily_ID to set
     */
    public void setDaily_ID(int daily_ID) {
        this.daily_ID = daily_ID;
    }

    /**
     * @return the daily_total
     */
    public double getDaily_total() {
        return daily_total;
    }

    /**
     * @param daily_total the daily_total to set
     */
    public void setDaily_total(double daily_total) {
        this.daily_total = daily_total;
    }

    /**
     * @return the daily_withdraw
     */
    public double getDaily_withdraw() {
        return daily_withdraw;
    }

    /**
     * @param daily_withdraw the daily_withdraw to set
     */
    public void setDaily_withdraw(double daily_withdraw) {
        this.daily_withdraw = daily_withdraw;
    }

    /**
     * @return the daily_net_income
     */
    public double getDaily_net_income() {
        return daily_net_income;
    }

    /**
     * @param daily_net_income the daily_net_income to set
     */
    public void setDaily_net_income(double daily_net_income) {
        this.daily_net_income = daily_net_income;
    }

    /**
     * @return the daily_date
     */
    public String getDaily_date() {
        return daily_date;
    }

    /**
     * @param daily_date the daily_date to set
     */
    public void setDaily_date(String daily_date) {
        this.daily_date = daily_date;
    }
    
}
