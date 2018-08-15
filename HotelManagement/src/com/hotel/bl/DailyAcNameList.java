/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

import java.util.Date;

/**
 *
 * @author Personal
 */
public class DailyAcNameList {

    private int singleid;
    private int coupleid;
    private String reservedate01;
    private String reserveDate02;
    private String roomNo;
    private String SingleReserveName;
    private String CoupleReserveName;
    private Double total;
    private String status;

    /*
     * Client status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the reserve date
     */
    public String getReservedate01() {
        return reservedate01;
    }

    /**
     * @param reservedate the reserve date to set
     */
    public void setReserveDate01(String reservedate01) {
        this.reservedate01 = reservedate01;
    }

    /**
     * @return the roomNo
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * @param roomNo the roomNo to set
     */
    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    /**
     * @return the SingleReserveName
     */
    public String getSingleReserveName() {
        return SingleReserveName;
    }

    /**
     * @param SingleReserveName the SingleReserveName to set
     */
    public void setSingleReserveName(String SingleReserveName) {
        this.SingleReserveName = SingleReserveName;
    }

    /**
     * @return the CoupleReserveName
     */
    public String getCoupleReserveName() {
        return CoupleReserveName;
    }

    /**
     * @param CoupleReserveName the CoupleReserveName to set
     */
    public void setCoupleReserveName(String CoupleReserveName) {
        this.CoupleReserveName = CoupleReserveName;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * @return the reserveDate02
     */
    public String getReserveDate02() {
        return reserveDate02;
    }

    /**
     * @param reserveDate02 the reserveDate02 to set
     */
    public void setReserveDate02(String reserveDate02) {
        this.reserveDate02 = reserveDate02;
    }

    /**
     * @return the single id
     */
    public int getSingleid() {
        return singleid;
    }

    /**
     * @param singleid the single id to set
     */
    public void setSingleid(int singleid) {
        this.singleid = singleid;
    }

    /**
     * @return the couple id
     */
    public int getCoupleid() {
        return coupleid;
    }

    /**
     * @param couple id the couple id to set
     */
    public void setCoupleid(int coupleid) {
        this.coupleid = coupleid;
    }
}
