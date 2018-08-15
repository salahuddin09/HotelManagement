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
public class Reserveline {
    
    private int reservelineID;
    private int coupleID;
    private int memberID;
    private int singleID;
    private int childID;
    private String checkIn;
    private String checkOut;
    private String reserveDate;

    /**
     * @return the reservelineID
     */
    public int getReservelineID() {
        return reservelineID;
    }

    /**
     * @param reservelineID the reservelineID to set
     */
    public void setReservelineID(int reservelineID) {
        this.reservelineID = reservelineID;
    }

    /**
     * @return the coupleID
     */
    public int getCoupleID() {
        return coupleID;
    }

    /**
     * @param coupleID the coupleID to set
     */
    public void setCoupleID(int coupleID) {
        this.coupleID = coupleID;
    }

    /**
     * @return the memberID
     */
    public int getMemberID() {
        return memberID;
    }

    /**
     * @param memberID the memberID to set
     */
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    /**
     * @return the singleID
     */
    public int getSingleID() {
        return singleID;
    }

    /**
     * @param singleID the singleID to set
     */
    public void setSingleID(int singleID) {
        this.singleID = singleID;
    }

    /**
     * @return the childID
     */
    public int getChildID() {
        return childID;
    }

    /**
     * @param childID the childID to set
     */
    public void setChildID(int childID) {
        this.childID = childID;
    }

    /**
     * @return the checkIn
     */
    public String getCheckIn() {
        return checkIn;
    }

    /**
     * @param checkIn the checkIn to set
     */
    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    /**
     * @return the checkOut
     */
    public String getCheckOut() {
        return checkOut;
    }

    /**
     * @param checkOut the checkOut to set
     */
    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    /**
     * @return the reserveDate
     */
    public String getReserveDate() {
        return reserveDate;
    }

    /**
     * @param reserveDate the reserveDate to set
     */
    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }

    
}
