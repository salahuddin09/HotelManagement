/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.model;

/**
 *
 * @author Personal
 */
public class Yearly {

    private int yearly_ID;
    private String select_year;
    private double yearly_net_income;

    /**
     * @return the yearly_ID
     */
    public int getYearly_ID() {
        return yearly_ID;
    }

    /**
     * @param yearly_ID the yearly_ID to set
     */
    public void setYearly_ID(int yearly_ID) {
        this.yearly_ID = yearly_ID;
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
     * @return the yearly_net_income
     */
    public double getYearly_net_income() {
        return yearly_net_income;
    }

    /**
     * @param yearly_net_income the yearly_net_income to set
     */
    public void setYearly_net_income(double yearly_net_income) {
        this.yearly_net_income = yearly_net_income;
    }
}
