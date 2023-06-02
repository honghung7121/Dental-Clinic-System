/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Models.Advisory;
import Models.User;
import Util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class AdvisoryDAO {

    public List<Advisory> getAddvisory() throws SQLException {
        List<Advisory> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = Util.getConnection();
            if (con != null) {
                String sql = "select * from tblAdvisory where status = 0";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    list.add(new Advisory(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getBoolean(6)));
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
        return list;
    }
    public void CompletedAdvisory(int id) throws SQLException{
        Connection con = null;
        PreparedStatement stm = null;
        try{
            con = Util.getConnection();
            if (con != null) {
                String sql = "update tblAdvisory set status = 1 where id = ?";
                stm = con.prepareStatement(sql);
                stm.setInt(1, id);
                stm.executeUpdate();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
}