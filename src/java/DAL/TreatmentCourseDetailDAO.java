/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import static DAL.TreatmentCourseDAO.getTreatment;
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

    public static ArrayList<TreatmentCourseDetail> getTreatmentDetail(String from) {
        ArrayList<TreatmentCourseDetail> list = new ArrayList<>();
        Util dbu = new Util();

        String sql = "SELECT treatmentDate,tblTreatmentCourseDetail.treatmentID AS id, tblService.serviceName AS serviceName,tblTreatmentCourseDetail.description,tblTreatmentCourseDetail.status,tblTreatmentCourseDetail.statusPaid\n"
                + "FROM tblTreatmentCourseDetail, tblService, tblTreatmentCourse\n"
                + "WHERE tblTreatmentCourseDetail.treatmentID = tblTreatmentCourse.id\n"
                + "    AND tblTreatmentCourseDetail.serviceID = tblService.id\n"
                + "    AND tblTreatmentCourseDetail.treatmentID = ?;";
        try {
            Connection connection = dbu.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, from);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String treatmentdate = rs.getString("treatmentDate");
                int id = rs.getInt("id");
                String servicename = rs.getString("serviceName");
                String description = rs.getString("description");
                boolean status = rs.getBoolean("status");
                boolean statuspaid = rs.getBoolean("statusPaid");
                TreatmentCourseDetail c = new TreatmentCourseDetail(treatmentdate, id, servicename, description, status, statuspaid);
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public static void main(String[] args) throws SQLException {

        ArrayList<TreatmentCourseDetail> list = getTreatmentDetail("1");
        for (TreatmentCourseDetail o : list) {
            System.out.println(o);
        }
//System.out.println(list);
    }
}
