/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Util.Util;
import Models.FeedbackService;
import Models.FeedbackService;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class FeedbackServiceDAO {

    public static ArrayList<FeedbackService> getFeedbackService() throws SQLException {
        ArrayList<FeedbackService> list = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "select tblFeedBackService.id as id, tblService.serviceName as serviceName, tblUser.fullName as customerName, tblFeedBackService.rate as rate, tblFeedBackService.comment as comment\n"
                        + "from tblFeedBackService, tblService, tblUser\n"
                        + "where tblFeedBackService.userID = tblUser.id and tblFeedBackService.serviceID = tblService.id";
                pst = cn.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String cusname = rs.getString("customerName");
                        String sername = rs.getString("serviceName");
                        int rate = rs.getInt("rate");
                        String cmt = rs.getString("comment");
                        FeedbackService fbs = new FeedbackService(id, cusname, sername, rate, cmt);
                        list.add(fbs);
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

    public static ArrayList<FeedbackService> getFeedbackService(String keyword, String searchby) throws SQLException {
        ArrayList<FeedbackService> list = new ArrayList<>();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            cn = Util.getConnection();
            if (cn != null && searchby != null) {
                String sql = "select tblFeedBackService.id as id, tblUser.fullName as customername, serviceName, rate, comment\n"
                        + "from tblFeedBackService, tblUser, tblService\n"
                        + "where tblFeedBackService.userID = tblUser.id and tblFeedBackService.serviceID = tblService.id and ";
                if (searchby.equalsIgnoreCase("bycustomername")) {
                    sql = sql + " tblUser.fullName like ? COLLATE SQL_Latin1_General_CP1_CI_AI";
                } else {
                    sql = sql + " tblService.serviceName like ? COLLATE SQL_Latin1_General_CP1_CI_AI";
                }
                pst = cn.prepareStatement(sql);
                pst.setString(1, "%" + keyword + "%");
                rs = pst.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String customername = rs.getString("customername");
                        String servicename = rs.getString("serviceName");
                        int rate = rs.getInt("rate");
                        String cmt = rs.getString("comment");
                        FeedbackService fbs = new FeedbackService(id, customername, servicename, rate, cmt);
                        list.add(fbs);
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

    public static boolean deleteFeedbackService(int feedbackid) throws SQLException {
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean result = false;
        try {
            cn = Util.getConnection();
            if (cn != null) {
                String sql = "delete from tblFeedBackService\n"
                        + "  where id = ?";
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
