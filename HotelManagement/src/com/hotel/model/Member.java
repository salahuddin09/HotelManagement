/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.model;

/**
 *
 * @author Personal
 */
public class Member {
    
    private int member_ID;
    private String member_Name;
    private String member_Age;
    private String member_Address;
    private int group_ID;  
    /**
     * @return the member_ID
     */
    public int getMember_ID() {
        return member_ID;
    }

    /**
     * @param member_ID the member_ID to set
     */
    public void setMember_ID(int member_ID) {
        this.member_ID = member_ID;
    }

    /**
     * @return the member_Name
     */
    public String getMember_Name() {
        return member_Name;
    }

    /**
     * @param member_Name the member_Name to set
     */
    public void setMember_Name(String member_Name) {
        this.member_Name = member_Name;
    }

    /**
     * @return the member_Age
     */
    public String getMember_Age() {
        return member_Age;
    }

    /**
     * @param member_Age the member_Age to set
     */
    public void setMember_Age(String member_Age) {
        this.member_Age = member_Age;
    }

    /**
     * @return the member_Address
     */
    public String getMember_Address() {
        return member_Address;
    }

    /**
     * @param member_Address the member_Address to set
     */
    public void setMember_Address(String member_Address) {
        this.member_Address = member_Address;
    }

    /**
     * @return the group_ID
     */
    public int getGroup_ID() {
        return group_ID;
    }

    /**
     * @param group_ID the group_ID to set
     */
    public void setGroup_ID(int group_ID) {
        this.group_ID = group_ID;
    }
    
}
