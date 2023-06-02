/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Advisory {
    private int id;
    private Date advisoryDate;
    private String fullName;
    private int phoneNumber;
    private String Description;
    private boolean status;

    public Advisory() {
    }

    public Advisory(int id, Date advisoryDate, String fullName, int phoneNumber, String Description, boolean status) {
        this.id = id;
        this.advisoryDate = advisoryDate;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.Description = Description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAdvisoryDate() {
        return advisoryDate;
    }

    public void setAdvisoryDate(Date advisoryDate) {
        this.advisoryDate = advisoryDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
