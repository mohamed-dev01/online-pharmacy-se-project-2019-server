/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author pc
 */

public class Doctor extends Person implements Observer{

    public Doctor(String CompanyName,String name, int ID, int age, int phone, Account acc) {
        super(name, ID, age, phone, acc);
    }
    
     public ArrayList DisplayMyOrders(){
        return null;
    }
     
      public ArrayList viewAllMedicine(){
        return null;
    }
      
      public void BuyMedicine (String name,int ID)
      {
          
      }
    @Override
    public void getNotification(String name, int ID, double price) {
          Medicine m=null;
       System.out.println(" the added medicine is: " + m.getName()+ m.getID()+m.getPrice());
    }
}