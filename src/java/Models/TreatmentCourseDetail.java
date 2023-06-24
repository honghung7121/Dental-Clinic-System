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
    private String treatmentdate;
    private int id;
    private String nameService;
    private String description;
    private boolean status;
    private boolean statusPaid;

    public TreatmentCourseDetail(String treatmentdate, int id, String nameService, String description, boolean status, boolean statusPaid) {
        this.treatmentdate = treatmentdate;
        this.id = id;
        this.nameService = nameService;
        this.description = description;
        this.status = status;
        this.statusPaid = statusPaid;
    }

    public String getTreatmentdate() {
        return treatmentdate;
    }

    public void setTreatmentdate(String treatmentdate) {
        this.treatmentdate = treatmentdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "TreatmentCourseDetail{" + "treatmentdate=" + treatmentdate + ", id=" + id + ", nameService=" + nameService + ", description=" + description + ", status=" + status + ", statusPaid=" + statusPaid + '}';
    }
    
    
}
