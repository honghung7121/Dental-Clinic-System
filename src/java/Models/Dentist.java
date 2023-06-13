/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author ADMIN
 */


public class Dentist extends User{
    
    private String degree;
    private String experience;
    private String img;
    private String roleDentist;

    public Dentist(String degree, String experience, String img, String roleDentist, int id, String fullName, String password, String phoneNumber, int roleID, boolean status, String email, String Roll, String gender) {
        super(id, fullName, password, phoneNumber, roleID, status, email, Roll, gender);
        this.degree = degree;
        this.experience = experience;
        this.img = img;
        this.roleDentist = roleDentist;
    }

    
    

    public Dentist() {
    }

    public Dentist(String degree, String experience, String img) {
        this.degree = degree;
        this.experience = experience;
        this.img = img;
    }
    
    public Dentist(String degree, String experience, String img, int id, String fullName, String password, String phoneNumber, int roleID, boolean status, String email, String Roll, String gender) {
        super(id, fullName, password, phoneNumber, roleID, status, email, Roll, gender);
        this.degree = degree;
        this.experience = experience;
        this.img = img;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getRoleDentist() {
        return roleDentist;
    }

    public void setRoleDentist(String roleDentist) {
        this.roleDentist = roleDentist;
    }

    
}
