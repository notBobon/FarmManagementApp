/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Helper.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author danutryas
 */
public class Transaction {
    private String buyerName;
    private String sellerName;
    private String taxID;
    private String animalName;
    private int quantity;
    private double total;
    Database db = new Database();
    
    public void setTransaction(String buyerName, String sellerName, String taxID, String animalName, int quantity, double total){
        this.buyerName = buyerName;
        this.sellerName = sellerName;
        this.taxID = taxID;
        this.animalName = animalName;
        this.quantity = quantity;
        this.total = total;
    }
    public void addTransaction() {
        String addQuery = "INSERT INTO transaction (buyerName,sellerName,taxID,animalName,quantity,total) values (\""+buyerName+ "\",\""+sellerName+ "\",\""+taxID+ "\",\""+animalName+ "\",\""+quantity+"\",\""+ total + "\")";
        db.query(addQuery);
    }
    public ResultSet getTransaction() {
        String getQuery = "SELECT * FROM transaction";
        return db.getData(getQuery);
    }
}
