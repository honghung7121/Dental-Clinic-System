/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Models.Dentist;
import Util.Util;

/**
 *
 * @author ADMIN
 */
public class DentistDAO {

    public static ArrayList<Dentist> getAllDentist() {
        Connection cn = null;
        ArrayList<Dentist> list = new ArrayList<>();
        Dentist den = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select id, fullName, phoneNumber, email, degree, experience, image, status\n"
                        + "from tblUser u, tblDentist d\n"
                        + "where u.id = d.dentistID";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int idden = rs.getInt("id");
                        String fullnameden = rs.getString("fullName");
                        int phoneden = rs.getInt("phoneNumber");
                        String emailden = rs.getString("email");
                        String degreeden = rs.getString("degree");
                        int experienceden = rs.getInt("experience");
                        String imgden = rs.getString("image");
                        int statusden = rs.getInt("status");
                        den = new Dentist(idden, fullnameden, phoneden, emailden, degreeden, experienceden, imgden, statusden);
                        list.add(den);
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

    public static Dentist geDentistByID(String id) {
        Connection cn = null;
        Dentist den = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select id, fullName, phoneNumber, email, degree, experience, image, status\n"
                        + "from tblUser, tblDentist\n"
                        + "where id = dentistID AND id = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, id);

                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    int idden = rs.getInt("id");
                    String fullnameden = rs.getString("fullName");
                    int phoneden = rs.getInt("phoneNumber");
                    String emailden = rs.getString("email");
                    String degreeden = rs.getString("degree");
                    int experienceden = rs.getInt("experience");
                    String imgden = rs.getString("image");
                    int statusden = rs.getInt("status");
                    den = new Dentist(idden, fullnameden, phoneden, emailden, degreeden, experienceden, imgden, statusden);
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
        return den;
    }

    public static boolean updateDentist(int id, String fullname, int phone, String email, String degree, int experience, String img, int status) {
        boolean kq = false;
        Dentist den = null;
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "UPDATE tblUser\n"
                        + "SET fullName = ?, phoneNumber = ?, email = ?, status = ?\n"
                        + "WHERE id = ?;\n"
                        + "\n"
                        + "UPDATE tblDentist\n"
                        + "SET experience = ?, degree = ?, image = ?\n"
                        + "WHERE dentistID = ?;";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, fullname);
                pst.setInt(2, phone);
                pst.setString(3, email);
                pst.setInt(4, status);
                pst.setInt(5, id);
                pst.setInt(6, experience);
                pst.setString(7, degree);
                pst.setString(8, img);
                pst.setInt(9, id);
                
                int rs = pst.executeUpdate();
                kq = true;
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
        return kq;
    }

    public static void main(String[] args) {
        ArrayList<Dentist> list = DentistDAO.getAllDentist();
        System.out.println(list);
        Dentist d = geDentistByID("1");
        System.out.println(d);
    }
}
