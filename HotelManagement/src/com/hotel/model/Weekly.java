
package com.hotel.model;


public class Weekly {
    
    private int weekly_ID;
    private String from_date;
    private String to_date;
    private double weekly_net_income;

    /**
     * @return the weekly_ID
     */
    public int getWeekly_ID() {
        return weekly_ID;
    }

    /**
     * @param weekly_ID the weekly_ID to set
     */
    public void setWeekly_ID(int weekly_ID) {
        this.weekly_ID = weekly_ID;
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

    /**
     * @return the weekly_net_income
     */
    public double getWeekly_net_income() {
        return weekly_net_income;
    }

    /**
     * @param weekly_net_income the weekly_net_income to set
     */
    public void setWeekly_net_income(double weekly_net_income) {
        this.weekly_net_income = weekly_net_income;
    }
}
