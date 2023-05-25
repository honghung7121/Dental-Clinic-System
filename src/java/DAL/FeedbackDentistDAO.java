/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.util.ArrayList;
import Models.FeedbackDentist;
import Models.FeedbackDentist;
import Util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class FeedbackDentistDAO {

    public static ArrayList<FeedbackDentist> getFeedbackDentist() throws SQLException {
        ArrayList<FeedbackDentist> list = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select tblFeedBackDentist.id as id, dentisttable.fullName as dentistname, customertable.fullName as customername, tblFeedBackDentist.rate as rate, tblFeedBackDentist.cmt as comment\n"
                        + "from tblFeedBackDentist, (select id, fullName from tblUser where idRole = 2) as dentisttable, (select id, fullName from tblUser where idRole = 5) as customertable\n"
                        + "where tblFeedBackDentist.dentistID = dentisttable.id and tblFeedBackDentist.userID = customertable.id";
                pst = cn.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String denname = rs.getString("dentistname");
                        String cusname = rs.getString("customername");
                        int rate = rs.getInt("rate");
                        String cmt = rs.getString("comment");
                        FeedbackDentist fbd = new FeedbackDentist(id, denname, cusname, rate, cmt);
                        list.add(fbd);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                rs.close();
            }
            if (cn != null) {
                cn.close();
            }
        }
        return list;
    }

    public static ArrayList<FeedbackDentist> getFeedbackDentist(String keyword, String searchby) throws SQLException {
        ArrayList<FeedbackDentist> list = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = Util.getConnection();
            if (cn != null && searchby !=null) {
                String sql = "select tblFeedBackDentist.id as id, dentisttable.fullName as dentistname, customertable.fullName as customername, rate, cmt\n"
                        + "from tblFeedBackDentist, (select id, fullName from tblUser where tblUser.idRole = 5) as customertable, (select id, fullName from tblUser where tblUser.idRole = 2) as dentisttable\n"
                        + "where tblFeedBackDentist.userID = customertable.id and tblFeedBackDentist.dentistID = dentisttable.id and ";
                if (searchby.equalsIgnoreCase("bycustomername")) {
                    sql = sql + " customertable.fullName like ?";
                } else {
                    sql = sql + " dentisttable.fullName like ?";
                }
                pst = cn.prepareStatement(sql);
                pst.setString(1, "%" + keyword + "%");
                rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String customername = rs.getString("customername");
                        String dentistname = rs.getString("dentistname");
                        int rate = rs.getInt("rate");
                        String cmt = rs.getString("cmt");
                        FeedbackDentist fbd = new FeedbackDentist(id, dentistname, customername, rate, cmt);
                        list.add(fbd);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                rs.close();
            }
            if (cn != null) {
                cn.close();
            }
        }
        return list;
    }

    public static boolean deleteFeedback(int feedbackid) throws SQLException {
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean result = false;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "delete from tblFeedBackDentist\n"
                        + " where id = ?";
                pst = cn.prepareStatement(sql);
                pst.setInt(1, feedbackid);
                pst.executeUpdate();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                rs.close();
            }
            if (cn != null) {
                cn.close();
            }
        }
        return result;
    }
}
