/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.model;

/**
 *
 * @author Personal
 */
public class Group {
    
    private int group_ID;
    private String group_Contact_No;
    private String  group_Member_Name;
    private String no_Of_Member;
    private String group_Address;
    private int member_ID;
    private int rent_ID;

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

    /**
     * @return the group_Contact_No
     */
    public String getGroup_Contact_No() {
        return group_Contact_No;
    }

    /**
     * @param group_Contact_No the group_Contact_No to set
     */
    public void setGroup_Contact_No(String group_Contact_No) {
        this.group_Contact_No = group_Contact_No;
    }

    /**
     * @return the no_Of_Member
     */
    public String getNo_Of_Member() {
        return no_Of_Member;
    }

    /**
     * @param no_Of_Member the no_Of_Member to set
     */
    public void setNo_Of_Member(String no_Of_Member) {
        this.no_Of_Member = no_Of_Member;
    }

    /**
     * @return the group_Address
     */
    public String getGroup_Address() {
        return group_Address;
    }

    /**
     * @param group_Address the group_Address to set
     */
    public void setGroup_Address(String group_Address) {
        this.group_Address = group_Address;
    }

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
     * @return the group_Member_Name
     */
    public String getGroup_Member_Name() {
        return group_Member_Name;
    }

    /**
     * @param group_Member_Name the group_Member_Name to set
     */
    public void setGroup_Member_Name(String group_Member_Name) {
        this.group_Member_Name = group_Member_Name;
    }
    
}
