/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Models.TreatmentCourse;
import Models.TreatmentCourseDetail;
import Util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TreatmentCourseDetailDAO {

    public static ArrayList<TreatmentCourseDetail> getTreatmentDetailByTreatmentID(String from) {
        ArrayList<TreatmentCourseDetail> list = new ArrayList<>();
        Util dbu = new Util();

        String sql = "SELECT treatmentDate,tblTreatmentCourseDetail.id AS id, tblService.serviceName AS serviceName,tblTreatmentCourseDetail.description,tblTreatmentCourseDetail.status,tblTreatmentCourseDetail.statusPaid, treatmentTime\n"
                + "FROM tblTreatmentCourseDetail, tblService, tblTreatmentCourse\n"
                + "WHERE tblTreatmentCourseDetail.treatmentID = tblTreatmentCourse.id\n"
                + "AND tblTreatmentCourseDetail.serviceID = tblService.id\n"
                + "AND tblTreatmentCourseDetail.treatmentID = ? ORDER BY tblTreatmentCourseDetail.status DESC, treatmentDate ASC";
        try {
            Connection connection = dbu.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, from);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String treatmentdate = rs.getString("treatmentDate");
                String treatmenttime = rs.getString("treatmentTime");
                String servicename = rs.getString("serviceName");
                String description = rs.getString("description");
                boolean status = rs.getBoolean("status");
                boolean statuspaid = rs.getBoolean("statusPaid");
                TreatmentCourseDetail c = new TreatmentCourseDetail(id, treatmentdate, treatmenttime, servicename, description, status, statuspaid);
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static TreatmentCourseDetail getTreatmentDetailByID(String idDetail) {
        Connection cn = null;
        TreatmentCourseDetail c = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "SELECT tblTreatmentCourseDetail.id AS id, treatmentDate, treatmentTime, tblService.serviceName AS serviceName,tblTreatmentCourseDetail.description,tblTreatmentCourseDetail.status,tblTreatmentCourseDetail.statusPaid\n"
                        + "FROM tblTreatmentCourseDetail, tblService, tblTreatmentCourse\n"
                        + "WHERE tblTreatmentCourseDetail.treatmentID = tblTreatmentCourse.id\n"
                        + "AND tblTreatmentCourseDetail.serviceID = tblService.id\n"
                        + "AND tblTreatmentCourseDetail.id = ?\n";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, idDetail);
                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    int id = rs.getInt("id");
                    String treatmentdate = rs.getString("treatmentDate");
                    String treatmenttime = rs.getString("treatmentTime");
                    String servicename = rs.getString("serviceName");
                    String description = rs.getString("description");
                    boolean status = rs.getBoolean("status");
                    boolean statuspaid = rs.getBoolean("statusPaid");
                    c = new TreatmentCourseDetail(id, treatmentdate, treatmenttime, servicename, description, status, statuspaid);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    public static boolean updateTreatmentDetail(String id, String date, String time, String serviceID, String description, String status, String statusPaid) {
        boolean kq = false;
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "UPDATE dbo.tblTreatmentCourseDetail\n"
                        + "SET treatmentDate = ?,\n"
                        + "    treatmentTime = ?,\n"
                        + "    serviceID = ?,\n"
                        + "    description = ?,\n"
                        + "    status = ?,\n"
                        + "    statusPaid = ?\n"
                        + "WHERE id = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, date);
                pst.setString(2, time);
                pst.setString(3, serviceID);
                pst.setString(4, description);
                pst.setString(5, status);
                pst.setString(6, statusPaid);
                pst.setString(7, id);

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

    public static boolean insertTreatmentDetail(String treatmentID, String date, String time, String serviceID, String description, String status, String statusPaid) {
        boolean kq = false;
        Connection cn = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "INSERT INTO dbo.tblTreatmentCourseDetail\n"
                        + "           (treatmentDate\n"
                        + "           ,treatmentID\n"
                        + "           ,serviceID\n"
                        + "           ,description\n"
                        + "           ,status\n"
                        + "           ,statusPaid\n"
                        + "           ,treatmentTime)\n"
                        + "     VALUES(?,?,?,?,?,?,?)";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, date);
                pst.setString(2, treatmentID);
                pst.setString(3, serviceID);
                pst.setString(4, description);
                pst.setString(5, status);
                pst.setString(6, statusPaid);
                pst.setString(7, time);

                int rs = pst.executeUpdate();
                cn.close();
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

    public static int getIDPatientByDetailID(String idTreatment) {
        Connection cn = null;
        int idPatient = 0;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "SELECT u.id AS id\n"
                        + "FROM tblTreatmentCourseDetail td, tblTreatmentCourse t, tblUser u\n"
                        + "WHERE td.treatmentID = t.id AND t.userID = u.id AND td.treatmentID = ?";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, idTreatment);
                ResultSet rs = pst.executeQuery();
                if (rs != null && rs.next()) {
                    idPatient = rs.getInt("id");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idPatient;
    }

}
