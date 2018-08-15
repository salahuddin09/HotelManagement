/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

/**
 *
 * @author Personal
 */
public class DailyAcRoomList {
        
    private int singleid;
    private int coupleid;
    private String reservedate01;
    private String reserveDate02;
    private String roomNo;
    private String SingleReserveName;
    private String CoupleReserveName;
    private Double total;
    private String status;

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
     * @param coupleid the couple id to set
     */
    public void setCoupleid(int coupleid) {
        this.coupleid = coupleid;
    }

    /**
     * @return the reservedate01
     */
    public String getReservedate01() {
        return reservedate01;
    }

    /**
     * @param reservedate01 the reservedate01 to set
     */
    public void setReservedate01(String reservedate01) {
        this.reservedate01 = reservedate01;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

   
}
