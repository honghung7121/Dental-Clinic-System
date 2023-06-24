/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;



/**
 *
 * @author ADMIN
 */
public class Appointment{
    private int id;
    private String userName;
    private String dentistName;
    private Date date;  
    private Time time;
    private String description;
    private boolean status;
    private String Roll;

    public Appointment() {
    }

    public Appointment(int id, String userName, String dentistName, Date date, String description, boolean status) {
        this.id = id;
        this.userName = userName;
        this.dentistName = dentistName;
        this.date = date;
        this.description = description;
        this.status = status;
    }


    public Appointment(int id, String userName, Date date, Time time, String description, boolean status, String Roll) {
        this.id = id;
        this.userName = userName;
        this.dentistName = dentistName;
        this.date = date;
        this.time = time;
        this.description = description;
        this.status = status;
        this.Roll = Roll;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String Roll) {
        this.Roll = Roll;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }


    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
