/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel.bl;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TotalBill {
   // private double roomRent=0;
   // private double vat=0;
   // private double discount=0;
    private double vatCalculate;
    private double totalWithVat;
    private double totalVat;
    private double discountCalculate;
    private double totalWithDiscount;
  //  private double totalDiscount;
    private double grandTotal=0;     
    public double CalculateTotal(double roomRent,double vat,double discount){
        
        vatCalculate=vat/100;
        totalWithVat=roomRent*vatCalculate;
        totalVat=roomRent+totalWithVat;
      //  System.out.println(totalVat);
        discountCalculate=discount/100;
        totalWithDiscount=roomRent*discountCalculate;
     //   totalDiscount=roomRent-totalWithDiscount;
      //  System.out.println(totalDiscount);
        grandTotal=totalVat-totalWithDiscount;
      //  System.out.println(grandTotal);
        
        return grandTotal;
       }
   
    
}
