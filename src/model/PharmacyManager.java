/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.database.database;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is just the implementation of our remote class
 * @author Youssef Negm
 */
public class PharmacyManager extends UnicastRemoteObject implements PManagerInterface {
    public int product_price,saleries,adv,total_sales;
   
    
    public PharmacyManager() throws RemoteException {
        
    }
  

    public PharmacyManager (int product_price, int saleries, int adv, int total_sales) throws RemoteException{
        this.product_price = product_price;
        this.saleries = saleries;
        this.adv = adv;
        this.total_sales = total_sales;
        
    }


    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public void setSaleries(int saleries) {
        this.saleries = saleries;
    }

    public void setAdv(int adv) {
        this.adv = adv;
    }

    public void setTotal_sales(int total_sales) {
        this.total_sales = total_sales;
    }

    public int getProduct_price() {
        return product_price;
    }

    public int getSaleries() {
        return saleries;
    }

    public int getAdv() {
        return adv;
    }

    public int getTotal_sales() {
        return total_sales;
    }
    
    @Override
    public void addToDatabase(int product_price, int saleries, int adv, int total_sales) throws RemoteException{
        database d=new database();
        PharmacyManager p=new PharmacyManager(product_price,saleries,adv,total_sales);
        d.insertMedicine(p);
    }
    
    @Override
    public String GetProfit(int g,int x,int c,int v) throws RemoteException {
       int y = g+x+c;
      int tot = v - y;
        if (v - y <= 1000) return "The net profilt is too low =  " + tot;
        if (v - y>1000 &&v - y <= 5000) return "The net profilt is good =  " + tot;
       if (v - y > 5000) return "The net profilt is high =  " + tot;
      //if (v - y <= 1000 && v - y <=3000) return "The net profit this month is" + tot ;
       
        return "please enter the numbers to calculate your profit ";
      
    }
    @Override
    public String toString() {
        return "PharmacyManager{" + "Product price=" + product_price + ", Salaries=" + saleries + ", adv=" + adv + ", Total sales=" + total_sales + '}';
    }

  
//To change body of generated methods, choose Tools | Templates.
    }
  

