/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Admin
 */
public class TreatmentCourse {

    private int id;
    private String namecustomer;
    private String namedentist;
    private boolean status;

    public TreatmentCourse(int id, String namecustomer, String namedentist, boolean status) {
        this.id = id;
        this.namecustomer = namecustomer;
        this.namedentist = namedentist;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamecustomer() {
        return namecustomer;
    }

    public void setNamecustomer(String namecustomer) {
        this.namecustomer = namecustomer;
    }

    public String getNamedentist() {
        return namedentist;
    }

    public void setNamedentist(String namedentist) {
        this.namedentist = namedentist;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TreatmentCourse{" + "id=" + id + ", namecustomer=" + namecustomer + ", namedentist=" + namedentist + ", status=" + status + '}';
    }

    
}
