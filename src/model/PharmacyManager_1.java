/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


public class PharmacyManager_1 extends Person
{
    private ArrayList<Observer> observers = new ArrayList();

    public PharmacyManager_1(String name, int ID, int age, int phone, Account acc) {
        super(name, ID, age, phone, acc);
    }
  
     
    public void viewAllOrders(){}
    
    public Boolean RemoveMedicine()
    {
        return true;
    }
    
    public void DisplayprofitReport(){}
    
    public void getNotification(String name,int ID,double price)
{
        Medicine m=null;
        System.out.println(" the added medicine is: " + m.getName()+m.getID()+m.getPrice());
    }
}