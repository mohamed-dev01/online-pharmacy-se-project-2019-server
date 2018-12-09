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
public class Person {
    private String name;
    private int ID,age,phone;
    Account acc;

    public Person(String name, int ID, int age, int phone, Account acc) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.phone = phone;
        this.acc = acc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public Account getAcc() {
        return acc;
    }
    
}
