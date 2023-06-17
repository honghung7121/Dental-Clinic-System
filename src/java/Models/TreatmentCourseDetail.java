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
public class TreatmentCourseDetail {

    private int id;
    private String nameTreatment;
    private String treatmentdate;
    private String treatmenttime;
    private String nameService;
    private String description;
    private boolean status;
    private boolean statusPaid;

    public TreatmentCourseDetail(int id, String treatmentdate, String treatmenttime, String nameService, String description, boolean status, boolean statusPaid) {
        this.id = id;
        this.treatmentdate = treatmentdate;
        this.treatmenttime = treatmenttime;
        this.nameService = nameService;
        this.description = description;
        this.status = status;
        this.statusPaid = statusPaid;
    }

    

    public TreatmentCourseDetail(String nameTreatment, String treatmentdate, String treatmenttime, String nameService, String description, boolean status, boolean statusPaid) {
        this.nameTreatment = nameTreatment;
        this.treatmentdate = treatmentdate;
        this.treatmenttime = treatmenttime;
        this.nameService = nameService;
        this.description = description;
        this.status = status;
        this.statusPaid = statusPaid;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTreatment() {
        return nameTreatment;
    }

    public void setNameTreatment(String nameTreatment) {
        this.nameTreatment = nameTreatment;
    }

    public String getTreatmentdate() {
        return treatmentdate;
    }

    public void setTreatmentdate(String treatmentdate) {
        this.treatmentdate = treatmentdate;
    }

    public String getTreatmenttime() {
        return treatmenttime;
    }

    public void setTreatmenttime(String treatmenttime) {
        this.treatmenttime = treatmenttime;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
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

    public boolean isStatusPaid() {
        return statusPaid;
    }

    public void setStatusPaid(boolean statusPaid) {
        this.statusPaid = statusPaid;
    }

    @Override
    public String toString() {
        return "TreatmentCourseDetail{" + "nameTreatment=" + nameTreatment + ", treatmentdate=" + treatmentdate + ", treatmenttime=" + treatmenttime + ", nameService=" + nameService + ", description=" + description + ", status=" + status + ", statusPaid=" + statusPaid + '}';
    }

    

    

}
