/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pc
 */

import java.util.ArrayList;

  
public class Admin extends Person implements Observer{
       public String pin;
       private ArrayList<Medicine> medicine = new ArrayList();
        public Admin(String pin,String name, int ID, int age, int phone, Account acc) 
       {
        super(name, ID, age, phone, acc);
       }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public ArrayList<Medicine> getMedicine() {
        return medicine;
    }

    public void setMedicine(ArrayList<Medicine> medicine) {
        this.medicine = medicine;
    }
      
       
      
    
    public Boolean createDoctorAccount(){return true;}
    public Boolean DeleteDoctorAccount(){return true;}
    public ArrayList Addpin()
    {
        return null;
    }
    public Boolean removepin(){return true;}
    public void UpdateMedicine(){
    }
    
  @Override
    public void getNotification(String name, int ID, double price) {
          Medicine m=null;
       System.out.println(" the added medicine is: " + m.getName()+ m.getID()+m.getPrice());
    }
    
 
    
}
