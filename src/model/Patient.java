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

public class Patient extends Person 
{
   private ArrayList<Medicine> medicine = new ArrayList();
   
    public Patient(String name, int ID, int age, int phone, Account acc) {
        super(name, ID, age, phone, acc);
    }
    
 public Boolean CreateAccount()
 {
     return true;
 } 
 
  public ArrayList DisplayMyOrders()
  {
        return null;
  }
  
  public ArrayList ViewAllMedicine()
  {
        return null;
  }
  
  public void BuyMedicine (String name,int ID){}
  
  public Boolean ReturnMedicine(String name)
 {
     return true;
 } 
  
 public ArrayList viewAllMedicine()
{
        return null;
}
}