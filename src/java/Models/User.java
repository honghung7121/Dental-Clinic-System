/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Admin
 */
public class User {

    private int id;
    private String fullName;
    private String password;
    private int phoneNumber;
    private int roleID;
    private boolean status;
    private String email;
    private String Roll;
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String Roll) {
        this.Roll = Roll;
    }

    public User() {
    }

    public User(int id, String fullName, String password, int phoneNumber, int roleID, boolean status, String email, String Roll) {
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.roleID = roleID;
        this.status = status;
        this.email = email;
        if (Roll == null) {
            this.Roll = "";
        } else {
            this.Roll = Roll;
        }
    }
}
