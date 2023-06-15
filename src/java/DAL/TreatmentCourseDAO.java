/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import static DAL.ServiceDAO.getAllService;
import Models.Service;
import Models.TreatmentCourse;
import Models.User;
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
public class TreatmentCourseDAO {

    public float getRevenue() throws SQLException {
        float total = 0;
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql1 = "select SUM(s.price) from tblTreatmentCourse tc join tblService s on tc.serviceID = s.id";
                stm = con.prepareStatement(sql1);
                rs = stm.executeQuery();
                if (rs.next()) {
                    total = rs.getFloat(1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return total;
    }

    public static ArrayList<TreatmentCourse> getTreatment(String from) {
        ArrayList<TreatmentCourse> list = new ArrayList<>();
        Util dbu = new Util();

        String sql = "select tblTreatmentCourse.id as id, customertable.fullName as customername, dentisttable.fullName as dentistname,tblTreatmentCourse.status as status\n"
                + "from tblTreatmentCourse, (select id, fullName from tblUser where idRole = 2) as dentisttable, (select id, fullName from tblUser where id = ?) as customertable\n"
                + "where tblTreatmentCourse.dentistID = dentisttable.id and tblTreatmentCourse.userID = customertable.id";
        try {
            Connection connection = dbu.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, from);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String cusname = rs.getString("customername");
                String denname = rs.getString("dentistname");
                boolean status = rs.getBoolean("status");
                TreatmentCourse c = new TreatmentCourse(id, cusname, denname, status);
                list.add(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public static void main(String[] args) throws SQLException {

        ArrayList<TreatmentCourse> list = getTreatment("36");
        for (TreatmentCourse o : list) {
            System.out.println(o);
        }
//System.out.println(list);
    }
}
