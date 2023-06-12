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
public class FeedbackService implements Serializable{
    private int id;
    private String nameCustomer;
    private String nameService;
    private int rate;
    private String comment;

    public FeedbackService() {
    }

    public FeedbackService(int id, String nameCustomer, String nameService, int rate, String comment) {
        this.id = id;
        this.nameCustomer = nameCustomer;
        this.nameService = nameService;
        this.rate = rate;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
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

    @Override
    public String toString() {
        return "FeedbackService{" + "id=" + id + ", nameCustomer=" + nameCustomer + ", nameService=" + nameService + ", rate=" + rate + ", comment=" + comment + '}';
    }

}
