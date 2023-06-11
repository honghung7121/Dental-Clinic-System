/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Bill implements Serializable{
    private int id;
    private String username;
    private String treatmentDate;
    private float price;
    private boolean PaidStatus;

    public Bill() {
    }

    public Bill(int id, String username, String treatmentDate, float price, boolean PaidStatus) {
        this.id = id;
        this.username = username;
        this.treatmentDate = treatmentDate;
        this.price = price;
        this.PaidStatus = PaidStatus;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(String treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }   

    public boolean isPaidStatus() {
        return PaidStatus;
    }

    public void setPaidStatus(boolean PaidStatus) {
        this.PaidStatus = PaidStatus;
    }
    
    
}
