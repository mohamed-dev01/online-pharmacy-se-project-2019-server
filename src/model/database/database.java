/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.database;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import model.Medicine;
import model.Medicine;
import model.PharmacyManager;
import model.PharmacyManager;


public class database {

    public MongoClient client;
    public MongoDatabase database;
    public MongoCollection <Document> collection;
    public Gson gson = new Gson();

    public database() {

        Logger mongo = Logger.getLogger("org.mongodb.driver");
        mongo.setLevel(Level.SEVERE);

        client = new MongoClient();
        database = client.getDatabase("Pharmacy"); 
        collection = database.getCollection("Medicines");
        collection = database.getCollection("users");
    }


    public void insertMedicine(PharmacyManager m) {
        collection.insertOne(Document.parse(gson.toJson(m)));
        System.out.println("inserted");
    }

    public void deleteMedicine(String name) {
        boolean result = collection.deleteOne(Filters.eq("name", name)).wasAcknowledged();
        if (result) {
            System.out.println("Medicine Deleted");
        } else {
            System.out.println("Medicine wasn't found.");
        }
    }
    
        public void updateMedicine(Medicine m) {
        Document doc = Document.parse(gson.toJson(m));
        boolean result = collection.replaceOne(Filters.eq("name", m.getName()), doc).wasAcknowledged();
        if (result) {
            System.out.println("Medicine Updated");
        } else {
            System.out.println("Medicine wasn't found.");
        }
    }
        
    public PharmacyManager getbyProductPrice(int product_price) {
        Document doc = collection.find(Filters.eq("product_price", product_price)).first();
        PharmacyManager result = gson.fromJson(doc.toJson(), PharmacyManager.class);
        return result;
    }

    public ArrayList<PharmacyManager> DisplayMyProfit() {
        ArrayList<PharmacyManager> result = new ArrayList();
        ArrayList<Document> docs = collection.find().into(new ArrayList<Document>());
        for (int i = 0; i < docs.size(); i++) {
            result.add(gson.fromJson(docs.get(i).toJson(), PharmacyManager.class));
        }
        return result;
    }

    
    
    
    public void close() {
        client.close();
    }
    
}
