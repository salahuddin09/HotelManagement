/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.model;

/**
 *
 * @author Personal
 */
public class Family {
    
    private int family_ID;
    private String father_Name;
    private String father_Age;
    private String mother_Name;
    private String mother_Age;
    private String family_Address;
    private String family_Phone;
   // private int child_ID;
    private int rent_ID;

    /**
     * @return the family_ID
     */
    public int getFamily_ID() {
        return family_ID;
    }

    /**
     * @param family_ID the family_ID to set
     */
    public void setFamily_ID(int family_ID) {
        this.family_ID = family_ID;
    }

    /**
     * @return the father_Name
     */
    public String getFather_Name() {
        return father_Name;
    }

    /**
     * @param father_Name the father_Name to set
     */
    public void setFather_Name(String father_Name) {
        this.father_Name = father_Name;
    }

    /**
     * @return the father_Age
     */
    public String getFather_Age() {
        return father_Age;
    }

    /**
     * @param father_Age the father_Age to set
     */
    public void setFather_Age(String father_Age) {
        this.father_Age = father_Age;
    }

    /**
     * @return the mother_Name
     */
    public String getMother_Name() {
        return mother_Name;
    }

    /**
     * @param mother_Name the mother_Name to set
     */
    public void setMother_Name(String mother_Name) {
        this.mother_Name = mother_Name;
    }

    /**
     * @return the mother_Age
     */
    public String getMother_Age() {
        return mother_Age;
    }

    /**
     * @param mother_Age the mother_Age to set
     */
    public void setMother_Age(String mother_Age) {
        this.mother_Age = mother_Age;
    }

    /**
     * @return the family_Address
     */
    public String getFamily_Address() {
        return family_Address;
    }

    /**
     * @param family_Address the family_Address to set
     */
    public void setFamily_Address(String family_Address) {
        this.family_Address = family_Address;
    }

    /**
     * @return the child_ID
     */
   // public int getChild_ID() {
   //     return child_ID;
   // }

    /**
     * @param child_ID the child_ID to set
     */
  //  public void setChild_ID(int child_ID) {
  //      this.child_ID = child_ID;
  //  }

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
     * @return the family_Phone
     */
    public String getFamily_Phone() {
        return family_Phone;
    }

    /**
     * @param family_Phone the family_Phone to set
     */
    public void setFamily_Phone(String family_Phone) {
        this.family_Phone = family_Phone;
    }
}
