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
public class FeedbackDentist implements Serializable{
    
    private int id;
    private String namedentist;
    private String namecustomer;
    private int rate;
    private String comment;

    public FeedbackDentist() {
    }

    public FeedbackDentist(int id, String namedentist, String namecustomer, int rate, String comment) {
        this.id = id;
        this.namedentist = namedentist;
        this.namecustomer = namecustomer;
        this.rate = rate;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamedentist() {
        return namedentist;
    }

    public void setNamedentist(String namedentist) {
        this.namedentist = namedentist;
    }

    public String getNamecustomer() {
        return namecustomer;
    }

    public void setNamecustomer(String namecustomer) {
        this.namecustomer = namecustomer;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
