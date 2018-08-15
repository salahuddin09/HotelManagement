/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.model;

import java.util.Date;

/**
 *
 * @author Personal
 */
public class Rent {
    
    private int rent_ID;
    private String room_No;
    private double room_Rent;
    private String subject;
    private double vat;
    private double discount;
    private double total;
    private int reserveline_id;
   

    /**
     * @return the rent_ID
     */
    public int getRent_ID() {
        return rent_ID;
    }

    /**
     * @param rent_ID the rent_ID to set
     */
    public void setRent_ID(int rent_ID) {
        this.rent_ID = rent_ID;
    }

    /**
     * @return the room_Rent
     */
    public double getRoom_Rent() {
        return room_Rent;
    }

    /**
     * @param room_Rent the room_Rent to set
     */
    public void setRoom_Rent(double room_Rent) {
        this.room_Rent = room_Rent;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the vat
     */
    public double getVat() {
        return vat;
    }

    /**
     * @param vat the vat to set
     */
    public void setVat(double vat) {
        this.vat = vat;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }       

  
    public int getReserveline_id() {
        return reserveline_id;
    }

   
    public void setReserveline_id(int reserveline_id) {
        this.reserveline_id = reserveline_id;
    }

    /**
     * @return the room_No
     */
    public String getRoom_No() {
        return room_No;
    }

    /**
     * @param room_No the room_No to set
     */
    public void setRoom_No(String room_No) {
        this.room_No = room_No;
    }
}
