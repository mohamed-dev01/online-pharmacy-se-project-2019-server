/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ArrayList;


public class Medicine implements Subject{
    private String name;
    private int ID;
    private double price;
    private ArrayList<MedicineOccurence> MedicineOucceruncee = new ArrayList();
    private ArrayList<Observer> observers = new ArrayList();

    public Medicine(String name, int ID, double price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }
    
    public void addbarcode(MedicineOccurence m){
    MedicineOucceruncee.add(m);
    }
    

    @Override
    public void addObserver(Observer o) {
       observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }


    @Override
    public void AddMedicine(String name, int ID, double price) 
    {
       for (int i = 0; i < observers.size(); i++) {
            observers.get(i).getNotification(name,ID,price);
    }
}

   
}