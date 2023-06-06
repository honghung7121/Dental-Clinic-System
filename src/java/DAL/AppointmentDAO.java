/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Models.Appointment;
import Models.Dentist;
import Models.User;
import Util.Util;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class AppointmentDAO {
    
    UserDAO userDAO = new UserDAO();
    DentistDAO dentistDAO = new DentistDAO();
    
    public ArrayList<Appointment> getAllAppointment() {
        Connection cn = null;
        ArrayList<Appointment> list = new ArrayList<>();
        Appointment app = null;
        User u = new User();
        Dentist d = new Dentist();
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select id, appointmentDate, userID, dentistID, description, status from tblAppointment";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int idApp = rs.getInt("id");
                        int userIDApp = rs.getInt("userID");
                        int dentistIDApp = rs.getInt("dentistID");
                        u = userDAO.getEmployeeById(userIDApp);
                        d = dentistDAO.getDentistByID(String.valueOf(dentistIDApp));
                        String userName = u.getFullName();
                        String dentistName = d.getFullName();
                        Date dateApp = rs.getDate("appointmentDate");      
                        String descriptionApp = rs.getString("description");
                        boolean statusApp = rs.getBoolean("status");
                        
                        app = new Appointment(idApp, userName, dentistName, dateApp, descriptionApp, statusApp);
                        list.add(app);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    public ArrayList<Appointment> getAppointmentByDate(String from, String to) {
        Connection cn = null;
        ArrayList<Appointment> list = new ArrayList<>();
        Appointment app = null;
        User u = new User();
        Dentist d = new Dentist();
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select id, appointmentDate, userID, dentistID, description, status from tblAppointment\n"
                        + "WHERE (appointmentDate > ? OR appointmentDate = ?)\n"
                        + "AND (appointmentDate < ? OR appointmentDate = ?)";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, from);
                pst.setString(2, from);
                pst.setString(3, to);
                pst.setString(4, to);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int idApp = rs.getInt("id");
                        int userIDApp = rs.getInt("userID");
                        int dentistIDApp = rs.getInt("dentistID");
                        u = userDAO.getEmployeeById(userIDApp);
                        d = dentistDAO.getDentistByID(String.valueOf(dentistIDApp));
                        String userName = u.getFullName();
                        String dentistName = d.getFullName();
                        Date dateApp = rs.getDate("appointmentDate");      
                        String descriptionApp = rs.getString("description");
                        boolean statusApp = rs.getBoolean("status");
                        
                        app = new Appointment(idApp, userName, dentistName, dateApp, descriptionApp, statusApp);
                        list.add(app);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    int id;
    private String userName;
    private String dentistName;
    private Date date;  
    private String description;
    private boolean status;
    
    public boolean insertAppointment(String userID, String dentistID, Date date, String description, String status){
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                int iddentist = 0;

                String sql = "INSERT INTO tblAppointment\n"
                        + "values (?,?,?,?,?)\n";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setDate(1, date);
                pst.setInt(2, Integer.parseInt(userID));
                pst.setInt(3, Integer.parseInt(dentistID));
                pst.setString(4, description);
                pst.setBoolean(5, Boolean.parseBoolean(status));
                pst.executeUpdate();
                cn.close();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
    
}
