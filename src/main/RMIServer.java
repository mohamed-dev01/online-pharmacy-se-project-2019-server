/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.database.database;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import model.PharmacyManager;
import model.PManagerInterface;

public class RMIServer {


    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        
        // Here we create our remote object
        PManagerInterface g = new PharmacyManager();
        PManagerInterface x = new PharmacyManager();
        PManagerInterface c = new PharmacyManager();
        PManagerInterface v = new PharmacyManager();
        // An RMI Registry initialized on port 1099
        Registry r = LocateRegistry.createRegistry(1011);
        
        // Our remote object g is binded to the name "grade"
        r.bind("input1", g);
        r.bind("input2", x);
        r.bind("input3", c);
        r.bind("input4", v);
        // Outputs that the server is ready
        System.out.println("It's Alive ◑.◑, I Mean The Server (•‿•).");
        
        database d=new database();
        
        
        
        ArrayList<PharmacyManager> p=d.DisplayMyProfit();
        for(int ii=0;ii<p.size();ii++){
            System.out.println(p.get(ii).toString());
        }

    }
    
}
